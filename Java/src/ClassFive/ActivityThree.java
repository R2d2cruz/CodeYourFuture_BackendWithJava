package ClassFive;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
 * 
 * Opción 1: "Guardar"
 * 
 * Opción 2: "Cargar"
 * 
 * Opción 3: "Salir"
 * 
 * El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 
 */

public class ActivityThree {
    public static void pauseMenu() {
        System.out.println("Menu de pausa:");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");

        int option = TerminalFunctions.inputInt(1, 3, "Ingrese una opcion: ");

        switch (option) {
            case 1 -> {
                System.out.print("Guardando partida");
                TerminalFunctions.sleep(500);
                System.out.print(".");
                TerminalFunctions.sleep(500);
                System.out.print(".");
                TerminalFunctions.sleep(500);
                System.out.println(".");
                TerminalFunctions.sleep(500);
                System.out.println("Partida guardada");
            }
            case 2 -> {
                System.out.print("Cargando partida");
                TerminalFunctions.sleep(500);
                System.out.print(".");
                TerminalFunctions.sleep(500);
                System.out.print(".");
                TerminalFunctions.sleep(500);
                System.out.println(".");
                TerminalFunctions.sleep(500);
                System.out.println("Partida Cargada");
            }
            case 3 -> {
                System.out.println("Cerrando sesion");
                TerminalFunctions.sleep(500);
                System.out.print(".");
                TerminalFunctions.sleep(500);
                System.out.print(".");
                TerminalFunctions.sleep(500);
                System.out.println(".");
                TerminalFunctions.sleep(500);
                System.out.println("Partida Cargada");
            }

            default -> System.out.println("Opcion no valida");
        }
    }
}
