// el viaje no podrá tener rutas aéreas.
public class SinAereos extends RequerimientoViaje {
    
    public SinAereos(String tipo_requerimiento) {
        this.tipo_requerimiento = tipo_requerimiento;
    }
    
    public boolean validar(Viaje viaje) {
        return true;
    }
}
