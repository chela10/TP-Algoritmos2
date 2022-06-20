// el viaje debe contemplar un mínimo de kilómetros recorridos.
public class DistanciaMinima implements RequerimientoViaje {
    private int kmsMinimos;

    public DistanciaMinima(int kmsMinimos) {
        this.kmsMinimos = kmsMinimos;
    }
    public boolean validar(Viaje viaje) {
        return true;
    }
}
