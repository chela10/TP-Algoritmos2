import java.util.ArrayList;

public class Aeropuerto extends Terminal {
    public Aeropuerto(String nombre, String direccion, String telefono, int maxPasajeros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.maxPasajeros = maxPasajeros;
        this.TransporteSoportado = new ArrayList<String>();
        this.TransporteSoportado.add("Avion");
        this.TransporteSoportado.add("MCD");
        this.TransporteSoportado.add("MLG");
    }

    public void establecerRutas(ArrayList<Ruta> rutas) {
        this.rutas = rutas;
    }
}
