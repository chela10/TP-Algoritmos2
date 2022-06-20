// el viaje no podrá tener rutas aéreas.
public class SinAereos implements RequerimientoViaje {
    public boolean validar(Viaje viaje) {
        return true;
    }
}
