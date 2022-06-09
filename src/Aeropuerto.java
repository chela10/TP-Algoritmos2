import java.util.ArrayList;

public class Aeropuerto extends Terminal {
    public Aeropuerto(Ciudad ciudad) {
        this.ciudad = ciudad;
        this.TransporteSoportado = new ArrayList<String>();
        this.TransporteSoportado.add("Avion");
        this.TransporteSoportado.add("MCD");
        this.TransporteSoportado.add("MLG");
    }
}
