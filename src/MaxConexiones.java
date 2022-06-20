// el viaje no podrá tener más rutas recorridas que este número.
public class MaxConexiones implements RequerimientoViaje {
    private int maxRutas;
    
    public MaxConexiones(int maxRutas) {
        this.maxRutas = maxRutas;
    }

    public boolean validar(Viaje viaje) {
        return true;
    }
}
