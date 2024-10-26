package ArrayClass;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa en el cual se cree una variable de tipo array 
 * que contenga tres elementos de tipo entero. El programa debe sumar 
 * los tres elementos de forma manual e imprimir por consola el resultado 
 * utilizando solamente las herramientas adquiridas hasta el momento.
 */

public class ActivityOne {
    public static void printSumList() {
        int[] ints = new int[3];
        ints[0] = TerminalFunctions.inputInt("Ingrese numero 1: ");
        ints[1] = TerminalFunctions.inputInt("Ingrese numero 2: ");
        ints[2] = TerminalFunctions.inputInt("Ingrese numero 3: ");
        int sum = ints[0] + ints[1] + ints[3];
        System.out.println("La suma es " + sum);
    }
}
