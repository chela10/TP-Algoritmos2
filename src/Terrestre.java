import java.util.ArrayList;
import java.util.List;

public class Terrestre extends Terminal {
    public Terrestre(String nombre, String direccion, String telefono, int maxPasajeros ,Ciudad ciudad, List<Ruta> rutas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.maxPasajeros = maxPasajeros;
        this.ciudad = ciudad;
        this.rutas = rutas;
        this.TransporteSoportado = new ArrayList<String>();
        this.TransporteSoportado.add("Tren");
        this.TransporteSoportado.add("MCD");
        this.TransporteSoportado.add("MLG");
    }
}
