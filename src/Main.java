import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pais pais1 = new Pais("Argentina");
        Pais pais2 = new Pais("Brasil");
        Terminal terminal1 = new Terrestre("TERMINAL SF", "direccion", "11", 90, null);
        Terminal terminal2 = new Puerto("TERMINAL BSAS", "direccion", "11", 90, null);
        Terminal terminal3 = new Aeropuerto("TERMINAL SP", "direccion", "11", 90, null);
        Terminal terminal4 = new Aeropuerto("TERMINAL RIO", "direccion", "11", 90, null);
        ArrayList<Terminal> terminales1 = new ArrayList<>();
        terminales1.add(terminal1);
        ArrayList<Terminal> terminales2 = new ArrayList<>();
        terminales2.add(terminal2);
        ArrayList<Terminal> terminales3 = new ArrayList<>();
        terminales3.add(terminal3);
        ArrayList<Terminal> terminales4 = new ArrayList<>();
        terminales4.add(terminal4);
        Ciudad ciudad1 = new Ciudad(1, "Santa fe", pais1, 20, terminales1, 20);
        Ciudad ciudad2 = new Ciudad(2, "Buenos aires", pais1, 4000, terminales2, 30);
        Ciudad ciudad3 = new Ciudad(2, "San pablo", pais2, 4000, terminales3, 30);
        Ciudad ciudad4 = new Ciudad(2, "RIO", pais2, 4000, terminales4, 30);
        pais1.agregarCiudad(ciudad1);
        pais1.agregarCiudad(ciudad2);
        pais2.agregarCiudad(ciudad3);
        pais2.agregarCiudad(ciudad4);
        Grafo mapa = new Grafo();
        mapa.agregarPais(pais1);
        mapa.agregarPais(pais2);
        Menu menu = new Menu(mapa);
        menu.loopPrincipal(null);
    
    }
}
