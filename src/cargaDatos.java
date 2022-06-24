import java.util.ArrayList;

public class cargaDatos {
    public void cargarMapa(Grafo mapa) {
        Pais argentina = new Pais("Argentina");
        Pais uruguay = new Pais("Uruguay");
        Pais brasil = new Pais("Brasil");
        Pais chile = new Pais("Chile");
        // Terminales sante fe
        Terminal terminal1Arg = new Terrestre("A1", "Santa fe", "000", 100);
        Terminal terminal2Arg = new Aeropuerto("A2", "Santa fe", "001", 100);
        ArrayList<Terminal> terminalesSantaFe = new ArrayList<>();
        terminalesSantaFe.add(terminal1Arg);
        terminalesSantaFe.add(terminal2Arg);
        // Terminales entre rios
        Terminal terminal3Arg = new Terrestre("B1", "Entre rios", "002", 100);
        Terminal terminal4Arg = new Puerto("B2", "Entre rios", "003", 100);
        Terminal terminal5Arg = new Aeropuerto("B3", "Entre rios", "004", 100);
        ArrayList<Terminal> terminalesEntreRios = new ArrayList<>();
        terminalesEntreRios.add(terminal3Arg);
        terminalesEntreRios.add(terminal4Arg);
        terminalesEntreRios.add(terminal5Arg);
        // Terminales montevideo
        Terminal terminal1Uru = new Aeropuerto("C1", "Montevideo", "005", 100);
        Terminal terminal2Uru = new Terrestre("C2", "Montevideo", "006", 100);
        ArrayList<Terminal> terminalesMontevideo = new ArrayList<>();
        terminalesMontevideo.add(terminal1Uru);
        terminalesMontevideo.add(terminal2Uru);
        // Terminales santiago
        Terminal terminal1Chi = new Aeropuerto("D1", "Santiago", "007", 100);
        Terminal terminal2Chi = new Aeropuerto("D2", "Santiago", "008", 100);
        Terminal terminal3Chi = new Terrestre("D3", "Santiago", "009", 100);
        Terminal terminal4Chi = new Puerto("D4", "Santiago", "010", 100);
        Terminal terminal5Chi = new Terrestre("D5", "Santiago", "011", 100);
        ArrayList<Terminal> terminalesSantiago = new ArrayList<>();
        terminalesSantiago.add(terminal1Chi);
        terminalesSantiago.add(terminal2Chi);
        terminalesSantiago.add(terminal3Chi);
        terminalesSantiago.add(terminal4Chi);
        terminalesSantiago.add(terminal5Chi);
        // Terminales florianopolis
        Terminal terminal1Bra = new Aeropuerto("E1", "Florianopolis", "012", 100);
        Terminal terminal2Bra = new Puerto("E2", "Florianopolis", "013", 100);
        Terminal terminal3Bra = new Terrestre("E3", "Florianopolis", "014", 100);
        ArrayList<Terminal> terminalesFlo = new ArrayList<>();
        terminalesFlo.add(terminal1Bra);
        terminalesFlo.add(terminal2Bra);
        terminalesFlo.add(terminal3Bra);
        // Terminales san pablo
        Terminal terminal4Bra = new Aeropuerto("F1", "San pablo", "015", 100);
        Terminal terminal5Bra = new Terrestre("F2", "San pablo", "016", 100);
        ArrayList<Terminal> terminalesSanPablo = new ArrayList<>();
        terminalesSanPablo.add(terminal4Bra);
        terminalesSanPablo.add(terminal5Bra);
        // Creacion de ciudades
        Ciudad santaFe = new Ciudad(1, "Santa fe", argentina, 5000, terminalesSantaFe, 5);
        Ciudad entreRios = new Ciudad(2, "Entre rios", argentina, 5000, terminalesEntreRios, 5);
        Ciudad montevideo = new Ciudad(3, "Montevideo", uruguay, 5000, terminalesMontevideo, 5);
        Ciudad santiago = new Ciudad(4, "Santiago", chile, 5000, terminalesSantiago, 5);
        Ciudad florianopolis = new Ciudad(5, "Florianopolis", brasil, 5000, terminalesFlo, 5);
        Ciudad sanPablo = new Ciudad(6, "San pablo", brasil, 5000, terminalesSanPablo, 5);
       
        ArrayList<Ciudad> ciudadesArgentinas = new ArrayList<>();
        ciudadesArgentinas.add(santaFe);
        ciudadesArgentinas.add(entreRios);
        
        ArrayList<Ciudad> ciudadesUruguayas = new ArrayList<>();
        ciudadesArgentinas.add(montevideo);
        
        ArrayList<Ciudad> ciudadesChilenas = new ArrayList<>();
        ciudadesArgentinas.add(santiago);
        
        ArrayList<Ciudad> ciudadesBrasileras = new ArrayList<>();
        ciudadesArgentinas.add(florianopolis);
        ciudadesArgentinas.add(sanPablo);

        // Asignacion de ciudad a las terminales
        this.asignarCiudadATerminales(santaFe, terminalesSantaFe);
        this.asignarCiudadATerminales(entreRios, terminalesEntreRios);
        this.asignarCiudadATerminales(montevideo, terminalesMontevideo);
        this.asignarCiudadATerminales(santiago, terminalesSantiago);
        this.asignarCiudadATerminales(florianopolis, terminalesFlo);
        this.asignarCiudadATerminales(sanPablo, terminalesSanPablo);

        // Asignacion de ciudades a paises
        this.asignarCiudadAPais(argentina, ciudadesArgentinas);
        this.asignarCiudadAPais(uruguay, ciudadesUruguayas);
        this.asignarCiudadAPais(chile, ciudadesChilenas);
        this.asignarCiudadAPais(brasil, ciudadesBrasileras);
        
        // Creacion de rutas
        Ruta a1_a2I = new rutaTerrestre(terminal1Arg, terminal2Arg, 20, 2, 6, 0.3);
        Ruta a1_a2V = new rutaTerrestre(terminal2Arg, terminal1Arg, 20, 2, 6, 0.3);
        
        Ruta a2_d1I = new rutaAerea(terminal2Arg, terminal1Chi, 1500, 18000, 180, 2);
        Ruta a2_d1V = new rutaAerea(terminal1Chi, terminal2Arg, 1500, 15000, 180, 1.75);
        
        Ruta a1_b1I = new rutaFerroviaria(terminal1Arg, terminal3Arg, 300, 15, 22.5, 3.75);
        Ruta a1_b1V = new rutaFerroviaria(terminal3Arg, terminal1Arg, 300, 15, 22.5, 3.75);
        
    }

    private void asignarCiudadATerminales(Ciudad ciudad, ArrayList<Terminal> terminales) {
        for (Terminal terminal : terminales) {
            terminal.establecerCiudad(ciudad);
        }
    }

    private void asignarCiudadAPais(Pais pais, ArrayList<Ciudad> ciudades) {
        for (Ciudad ciudad : ciudades) {
            pais.agregarCiudad(ciudad);
        }
    }

    private void crearRutas(Terminal orgien, Terminal destino) {

    }
}
