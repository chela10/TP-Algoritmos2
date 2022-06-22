// sólo guardan los viajes de menor consumo de combustible.
public class Ecologico extends RequerimientoViaje {

    public Ecologico(String tipo_requerimiento) {// ver si no recibe algun otro agrumento
        this.tipo_requerimiento = tipo_requerimiento;
    }
    public boolean validar(Viaje viaje) {
        return true;
    }
}
