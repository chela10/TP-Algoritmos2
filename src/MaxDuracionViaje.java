// el tiempo acumulado del recorrido en transportes no puede superar este número.

public class MaxDuracionViaje implements RequerimientoViaje {
    private float maxTiempoTransportes;

    public MaxDuracionViaje(float maxTiempoTransportes) {
        this.maxTiempoTransportes = maxTiempoTransportes;
    }

    public boolean validar(Viaje viaje) {
        return true;
    }
}
