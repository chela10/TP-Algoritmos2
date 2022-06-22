import java.io.Console;
import java.util.ArrayList;
public class Menu {
    private Grafo mapa;
    private String textoMenuPrincipal = "1. Información\n\n" + "2. Calcular viajes\n\n" 
    + "3. Ver viajes calculados\n\n" + "4. Salir";


    public Menu(Grafo mapa) {
        this.mapa = mapa;
    }
    public Menu() {}

    public void loopPrincipal(Viaje viaje) {
        String opcionIngresada = "0";
        while(!opcionIngresada.equals("4")) {
            this.mostrarMenuPrincipal();
            opcionIngresada = this.pedirInput("Ingrese la opcion deseada: ");
            this.porcesarOpcion(opcionIngresada, viaje);
        }
    }

    private void mostrarMenuPrincipal() {
        System.out.println(this.textoMenuPrincipal);
    }

    private String pedirInput(String texto) {
        Console pedirInput = System.console();
        String opcionIngresada = pedirInput.readLine(texto);
        System.out.print("\033[H\033[2J"); // para limpiar la consola despues de pedir input
        System.out.flush();
        return opcionIngresada;
    }

    private void porcesarOpcion(String opcionIngresada, Viaje viaje) {
        switch (opcionIngresada) {
            case "1":
                this.informacion();
                break;
            case "2":
                // viaje.calcularViaje();
                break;
            case "3":
                // viaje.viajesCalculados();
                break;
            case "4":
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta, intente nuevamente");
                break;
        }
    }
    

    private void informacion() {
        ArrayList<Pais> paises = this.mapa.obtenerNodos();
        for (Pais pais : paises) {
            System.out.println(". " + pais.obtenerPais() + "  (Pais)");
            ArrayList<Ciudad> ciudades = pais.obtenerCiudades();
            for (Ciudad ciudad : ciudades) {
                System.out.println("--- " + ciudad.obtenerNombre() + "  (Ciudad)");
                ArrayList<Terminal> terminales = ciudad.obtenerTerminales();
                for (Terminal terminal : terminales) {
                    System.out.println( "------ " + terminal.obtenerNombre() + "  (Terminal)");
                }
            }
            System.out.println("**********************");
        }
    }

}
