import java.util.ArrayList;
import java.util.List;

public class Puerto extends Terminal {
    public Puerto(String nombre, String direccion, String telefono, int maxPasajeros, Ciudad ciudad, List<Ruta> rutas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.maxPasajeros = maxPasajeros;
        this.ciudad = ciudad;
        this.rutas = rutas;
        this.TransporteSoportado = new ArrayList<String>();
        this.TransporteSoportado.add("Barco");
        this.TransporteSoportado.add("MCD");
        this.TransporteSoportado.add("MLG");
    }
}
