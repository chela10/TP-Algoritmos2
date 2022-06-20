import java.util.ArrayList;

public class Viaje {
    private double presupuesto;
    private Ciudad origen, destino;
    private ArrayList<RequerimientoViaje> requerimientosOpcionales = new ArrayList<>();
    private ArrayList<Terminal> recorridos = new ArrayList<>();

    public Viaje(double presupuesto, Ciudad origen, Ciudad destino, ArrayList<RequerimientoViaje> requerimientosOpcionales, ArrayList<Terminal> recorridos) {
        this.presupuesto = presupuesto;
        this.origen = origen;
        this.destino = destino;
        this.requerimientosOpcionales = requerimientosOpcionales;
        this.recorridos = recorridos;
    }

    public ArrayList<Terminal> obtenerRecorridos() {
        return this.recorridos;
    }

}
