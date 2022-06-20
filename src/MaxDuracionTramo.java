//import java.util.ArrayList;
// el viaje no puede incluir rutas con tiempos de duración mayor al definido.
public class MaxDuracionTramo implements RequerimientoViaje {
    private float duracionMaximaRuta;
    public MaxDuracionTramo(int duracionMaximaRuta) {
        this.duracionMaximaRuta = duracionMaximaRuta;
    }
    
    public boolean validar(Viaje viaje) {
        //ArrayList<Terminal> recorridos = viaje.obtenerRecorridos();
        return true;
    }
}
