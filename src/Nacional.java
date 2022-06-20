// no se pueden visitar ciudades de otro país durante durante el viaje.
public class Nacional implements RequerimientoViaje{
    public boolean validar(Viaje viaje) {
        return true;
    }
}
