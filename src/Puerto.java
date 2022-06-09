import java.util.ArrayList;

public class Puerto extends Terminal {
    public Puerto(Ciudad ciudad) {
        this.ciudad = ciudad;
        this.TransporteSoportado = new ArrayList<String>();
        this.TransporteSoportado.add("Barco");
        this.TransporteSoportado.add("MCD");
        this.TransporteSoportado.add("MLG");
    }
}
