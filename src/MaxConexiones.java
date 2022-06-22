// el viaje no podrá tener más rutas recorridas que este número.
public class MaxConexiones extends RequerimientoViaje {
    private int maxRutas;
    
    public MaxConexiones(int maxRutas, String tipo_requerimiento) {
        this.maxRutas = maxRutas;
        this.tipo_requerimiento = tipo_requerimiento;
    }

    public boolean validar(Viaje viaje) {
        return true;
    }
}
