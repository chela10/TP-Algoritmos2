import java.io.Console;
import java.util.ArrayList;
public class Menu {
    private SimuladorViaje viajes;
    private String textoMenuPrincipal = "1. Información\n\n" + "2. Calcular viajes\n\n" 
    + "3. Ver viajes calculados\n\n" + "4. Salir";


    public Menu(SimuladorViaje viajes) {
        this.viajes = viajes;
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
                this.mostrarViajesCalculados();
                // viaje.viajesCalculados();
                break;
            case "4":
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta, intente nuevamente");
                break;
        }
    }
    
    private void recorrerViajesRealizados(ArrayList<Viaje> viajesRealizados) {
        int i = 1;
        for (Viaje viaje : viajesRealizados) {
            System.out.println("Viaje " + i);
            i++;
        }
    }


    private boolean opcionFueraDeRango(String opcionIngresada, int longitudArreglo) {
        try {
            int opcionIngresada2 = Integer.parseInt(opcionIngresada);
            return opcionIngresada2 > longitudArreglo || opcionIngresada2 < 1;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    private void mostrarRequisitosOpcionales(ArrayList<RequerimientoViaje> requerimientosOpcionales) {
        for (RequerimientoViaje requerimientoViaje : requerimientosOpcionales) {
            System.out.println("." + requerimientoViaje.tipo_requerimiento);
        }
    }

    private void procesarViajeSeleccionado(int opcionIngresada, Viaje viajeElegido) {
        System.out.println("Informacion del viaje");
        System.out.println("Presupuesto: " +  viajeElegido.obtenerPresupuesto());
        System.out.println("Origen y destino: " +  viajeElegido.obtenerOrigen().obtenerNombre() + " " + viajeElegido.obtenerDestino().obtenerNombre());
        System.out.println("Requerimientos opcionales");
        this.mostrarRequisitosOpcionales(viajeElegido.obtenerRequerimientosOpcionales()); // falta rutas, distancia, tarifa, consumo, etc

    }

    private void mostrarViajesCalculados() {
        ArrayList<Viaje> viajesRealizados = this.viajes.obtenerViajesSimulados();
        this.recorrerViajesRealizados(viajesRealizados);
        String opcionIngresada = this.pedirInput("Ingrese el nro del viaje a ver en detalle: ");
        if(this.opcionFueraDeRango(opcionIngresada, viajesRealizados.size())) {
            System.out.println("Opcion fuera de rango o invalida, intente nuevamente");
        }
        else {
            this.procesarViajeSeleccionado(Integer.parseInt(opcionIngresada), viajesRealizados.get(Integer.parseInt(opcionIngresada) - 1));
        }
    }
    private void informacion() {
        ArrayList<Pais> paises = this.viajes.obtenerMapa().obtenerNodos();
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
