import java.util.ArrayList;

public class Pais {
    private String pais;
    private ArrayList<Ciudad> ciudades = new ArrayList<>();
    
    public Pais(String pais) {
        this.pais = pais;
    }
    public void agregarCiudad(Ciudad ciudad) {
        if(!this.ciudades.contains(ciudad)) {
            this.ciudades.add(ciudad);
        }
    }
    
    public String obtenerPais() {
        return pais;
    }
    public ArrayList<Ciudad> obtenerCiudades() {
        return this.ciudades;
    }
}
