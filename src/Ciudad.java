import java.util.ArrayList;
public class Ciudad {

    // Atributos
    private int id;
    private String nombre;
    private String pais;
    private int cantHabitantes;
    private ArrayList<Terminal> terminales;
    private float precioLitro;

    // Metodos
    public Ciudad(int id, String nombre, String pais, int cantHabitantes, ArrayList<Terminal> terminales, float precioLitro) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.cantHabitantes = cantHabitantes;
        this.terminales = terminales;
        this.precioLitro = precioLitro;
    }

    public int obtenerId() {
        return this.id;
    }
    public String obtenerNombre() {
        return this.nombre;
    }
    public String obtenerPais() {
        return this.pais;
    }
    public int obtenerCantHabitantes() {
        return this.cantHabitantes;
    }
    public ArrayList<Terminal> obtenerTerminales() {
        return this.terminales;
    }
    public float obtenerPrecioLitro() {
        return this.precioLitro;
    }

    public boolean equalsTo(Ciudad ciudad) {
        return this.id == ciudad.obtenerId() && this.nombre == ciudad.obtenerNombre() && this.pais == ciudad.obtenerPais() && 
        this.cantHabitantes == ciudad.obtenerCantHabitantes() && 
        this.terminales == ciudad.obtenerTerminales() && 
        this.precioLitro == ciudad.obtenerPrecioLitro();
    }
}
