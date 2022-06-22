import java.util.ArrayList;

public class Grafo {
    private ArrayList<Pais> nodos = new ArrayList<>();
    
    public ArrayList<Pais> obtenerNodos() {
        return this.nodos;
    }
    public void agregarPais(Pais pais) {
        if(!this.nodos.contains(pais)) {
            this.nodos.add(pais);
        }
    }
    /*public void agregarRuta(Ruta ruta) { // ver lo de bidireccional
        this.aristas.add(ruta);
    }*/

    public boolean existePais(String nombre) {
        if(this.nodos.isEmpty()) {
            System.out.println("El pais no existe porque el mapa esta vacio");
        }
        else {
            for (Pais pais : this.nodos) {
                if(pais.obtenerPais() == nombre) {
                    return true;
                }
            }
        }
        return false;
    }

    /*public boolean existeRuta(Terminal origen, Terminal destino) {
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
    }*/

    public Pais obtenerPais(String nombre) {
        if(!this.nodos.isEmpty()) {
            for (Pais pais : this.nodos) {
                if(pais.obtenerPais() == nombre) {
                    return pais;
                }
            }
        }
        return null;
    }

    /*public Ruta obtenerRuta(Terminal origen, Terminal destino) { // chequear
        if(!this.aristas.isEmpty()) {
            for (Ruta ruta : this.aristas) {
                if(ruta.obtenerOrigen() == origen && ruta.obtenerDestino() == destino) {
                    return ruta;
                }
            }
        }
        return null;
    }*/
}
