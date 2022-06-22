// no se pueden visitar ciudades de otro país durante durante el viaje.
public class Nacional extends RequerimientoViaje{
    
    public Nacional(String tipo_requerimiento) { // ver si no recibe otro argumento
        this.tipo_requerimiento = tipo_requerimiento;
    }
    
    public boolean validar(Viaje viaje) {
        return true;
    }
}
