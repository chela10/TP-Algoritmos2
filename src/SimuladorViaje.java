import java.util.ArrayList;

public class SimuladorViaje {
    private ArrayList<Viaje> viajesSimulados = new ArrayList<>();  
    private Menu menu; // revisar, tiene sentido?
    private Grafo mapa;
    
    public SimuladorViaje(Grafo mapa) {
        this.mapa = mapa;
    }
    public ArrayList<Viaje> obtenerViajesSimulados() {
        return this.viajesSimulados;
    }
    public Grafo obtenerMapa() {
        return this.mapa;
    }
    public void agregarViaje(Viaje viaje) {
        if(!this.viajesSimulados.contains(viaje)) {
            this.viajesSimulados.add(viaje);
        }
    }
}