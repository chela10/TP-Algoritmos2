// el tiempo acumulado del recorrido en transportes no puede superar este número.

public class MaxDuracionViaje extends RequerimientoViaje {
    private float maxTiempoTransportes;

    public MaxDuracionViaje(float maxTiempoTransportes, String tipo_requerimiento) {
        this.maxTiempoTransportes = maxTiempoTransportes;
        this.tipo_requerimiento = tipo_requerimiento;
    }

    public boolean validar(Viaje viaje) {
        return true;
    }
}
