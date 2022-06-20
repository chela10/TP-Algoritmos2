// sólo guardan los viajes de menor consumo de combustible.
public class Ecologico implements RequerimientoViaje {
    public boolean validar(Viaje viaje) {
        return true;
    }
}
