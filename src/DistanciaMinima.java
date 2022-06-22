// el viaje debe contemplar un mínimo de kilómetros recorridos.
public class DistanciaMinima extends RequerimientoViaje {
    private int kmsMinimos;

    public DistanciaMinima(int kmsMinimos, String tipo_requerimiento) {
        this.kmsMinimos = kmsMinimos;
        this.tipo_requerimiento = tipo_requerimiento;
    }
    public boolean validar(Viaje viaje) {
        return true;
    }
}
