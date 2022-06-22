import java.util.ArrayList;

public class Puerto extends Terminal {
    public Puerto(String nombre, String direccion, String telefono, int maxPasajeros, ArrayList<Ruta> rutas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.maxPasajeros = maxPasajeros;
        this.rutas = rutas;
        this.TransporteSoportado = new ArrayList<String>();
        this.TransporteSoportado.add("Barco");
        this.TransporteSoportado.add("MCD");
        this.TransporteSoportado.add("MLG");
    }
}
