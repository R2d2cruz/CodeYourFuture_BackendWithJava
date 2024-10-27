package ClassThree;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * 1. Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.
 * 2. Declara una variable para almacenar el resultado de la operación. 
 * 3. Permite al usuario elegir qué operación quiere realizar.
 * 4. Muestra el resultado de la operación en la consola.
 */

public class ActivityTwo {
    public static void calculator(){
        int a = TerminalFunctions.inputInt("Ingrese numero a: ");
        int b = TerminalFunctions.inputInt("Ingrese numero b: ");

        System.out.println("Opciones de operacion: ");
        System.out.println("1. a + b");
        System.out.println("2. a - b");
        System.out.println("3. a x b");
        System.out.println("4. a / b");
        System.out.println("5. a % b");

        int option = TerminalFunctions.inputInt("Ingrese numero de la operacion: ");

        double c = option > 3 ? (option == 4 ? a / b : (option == 5 ? a % b : 0)) : (option == 3 ? a * b : (option == 2 ? a - b : (option == 1 ? a + b : 0)));
        System.out.println(option > 5 || option < 1 ? "Operacion no valida" : "El resultado es " + c);
    }
}
