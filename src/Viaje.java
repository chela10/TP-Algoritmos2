import java.util.ArrayList;

public class Viaje {
    private double presupuesto;
    private Ciudad origen, destino;
    private ArrayList<RequerimientoViaje> requerimientosOpcionales = new ArrayList<>();
    private ArrayList<Terminal> recorridos = new ArrayList<>();
    private ArrayList<Ruta> rutasUtilizadas = new ArrayList<>(); // puede q no sea necesario, en principio es para mostrar las rutas utilizadas del viaje en la opcion 3

    public Viaje(double presupuesto, Ciudad origen, Ciudad destino, ArrayList<RequerimientoViaje> requerimientosOpcionales, ArrayList<Terminal> recorridos) {
        this.presupuesto = presupuesto;
        this.origen = origen;
        this.destino = destino;
        this.requerimientosOpcionales = requerimientosOpcionales;
        this.recorridos = recorridos;
    }

    public Ciudad obtenerOrigen() {
        return this.origen;
    }
    public Ciudad obtenerDestino() {
        return this.destino;
    }

    public double obtenerPresupuesto() {
        return this.presupuesto;
    }

    public ArrayList<RequerimientoViaje> obtenerRequerimientosOpcionales() {
        return this.requerimientosOpcionales;
    }

    public ArrayList<Terminal> obtenerRecorridos() {
        return this.recorridos;
    }

    public ArrayList<Ruta> obtenerRutasUtilizadas() {
        return this.rutasUtilizadas;
    }

    public void agregarRutaUtilizada(Ruta ruta) {
        if(!this.rutasUtilizadas.contains(ruta)) {
            this.rutasUtilizadas.add(ruta);
        }
    }

}
