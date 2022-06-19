import java.util.ArrayList;

public abstract class Terminal {
    // Atributos
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected int maxPasajeros;
    protected Ciudad ciudad;
    protected ArrayList<Ruta> rutas;
    protected ArrayList<String> TransporteSoportado;

    // Metodos
    
    public String obtenerNombre() {
        return this.nombre;
    }
    
    public String obtenerDireccion() {
        return this.direccion;
    }

    public String obtenerTelefono() {
        return this.telefono;
    }
    
    public int obtenerMaxPasajeros() {
        return this.maxPasajeros;
    }
    
    public Ciudad obtenerCiudad() {
        return this.ciudad;
    }
    
    public ArrayList<Ruta> obtenerRutas() {
        return this.rutas;
    }

    public ArrayList<String> obtenerTransporteSoportado() {
        return TransporteSoportado;
    }
}
