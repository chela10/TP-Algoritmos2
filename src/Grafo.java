import java.util.ArrayList;

public class Grafo {
    private ArrayList<Ciudad> nodos = new ArrayList<>();
    private ArrayList<Ruta> aristas = new ArrayList<>();

    public void agregarCiudad(Ciudad ciudad) {
        this.nodos.add(ciudad);
    }
    public void agregarRuta(Ruta ruta) { // ver lo de bidireccional
        this.aristas.add(ruta);
    }

    public boolean existeCiudad(String nombre) {
        if(this.nodos.isEmpty()) {
            System.out.println("La ciudad no existe porque el mapa esta vacio");
            return false;
        }
        else {
            for (Ciudad ciudad : this.nodos) {
                if(ciudad.obtenerNombre() == nombre) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean existeRuta(Terminal origen, Terminal destino) {
        if (this.aristas.isEmpty()) {
            System.out.println("La ruta no existe porque el mapa esta vacio");
            return false;
        } 
        else {
            for (Ruta ruta : this.aristas) {
                if (ruta.obtenerOrigen() == origen && ruta.obtenerDestino() == destino) {
                    return true;
                }
            }
        }
        return false;
    }

    public Ciudad obtenerCiudad(String nombre) {
        if(!this.nodos.isEmpty()) {
            for (Ciudad ciudad : this.nodos) {
                if(ciudad.obtenerNombre() == nombre) {
                    return ciudad;
                }
            }
        }
        return null;
    }

    public Ruta obtenerRuta(Terminal origen, Terminal destino) { // chequear
        if(!this.aristas.isEmpty()) {
            for (Ruta ruta : this.aristas) {
                if(ruta.obtenerOrigen() == origen && ruta.obtenerDestino() == destino) {
                    return ruta;
                }
            }
        }
        return null;
    }
}
