import java.io.Console;
public class Menu {
    private String textoMenuPrincipal = "1. Información\n\n" + "2. Calcular viajes\n\n" 
    + "3. Ver viajes calculados\n\n" + "4. Salir";

    public void mostrarMenuPrincipal() {
        System.out.println(this.textoMenuPrincipal);
    }

    private String pedirInput(String texto) {
        Console pedirInput = System.console();
        String opcionIngresada = pedirInput.readLine(texto);
        return opcionIngresada;
    }

    public void porcesarOpcion(Viaje viaje) {
        String opcionIngresada = this.pedirInput("Ingrese la opcion deseada: ");
        if(opcionIngresada.equals("1")) {
            // llamar al sub menu, es mostrar la infromacion del grafo
        }
        else if(opcionIngresada.equals("2")) {
            // viaje.calcularViaje();
        }
        else if(opcionIngresada.equals("3")) {
            // viaje.viajesCalculados();
        }
        else if(opcionIngresada.equals("4")) {
            // break o cambiar algun booleano
        }
        else {
            System.out.println("La opcion ingresada es incorrecta, intente nuevamente");
        }
    }
    

}
