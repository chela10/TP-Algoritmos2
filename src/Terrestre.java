import java.util.ArrayList;

public class Terrestre extends Terminal {
    public Terrestre(Ciudad ciudad) {
        this.ciudad = ciudad;
        this.TransporteSoportado = new ArrayList<String>();
        this.TransporteSoportado.add("Tren");
        this.TransporteSoportado.add("MCD");
        this.TransporteSoportado.add("MLG");
    }
}
