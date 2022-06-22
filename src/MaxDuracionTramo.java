//import java.util.ArrayList;
// el viaje no puede incluir rutas con tiempos de duración mayor al definido.
public class MaxDuracionTramo extends RequerimientoViaje {
    private float duracionMaximaRuta;
    public MaxDuracionTramo(int duracionMaximaRuta, String tipo_requerimiento) {
        this.duracionMaximaRuta = duracionMaximaRuta;
        this.tipo_requerimiento = tipo_requerimiento;
    }
    
    public boolean validar(Viaje viaje) {
        //ArrayList<Terminal> recorridos = viaje.obtenerRecorridos();
        return true;
    }
}
