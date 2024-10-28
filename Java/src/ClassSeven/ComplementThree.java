package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementThree} class contain method related to the activity:
 * Desarrolla un programa que solicite al usuario ingresar dos palabras. 
 * Utiliza el método equals() de la clase String para comparar si las dos palabras son iguales. 
 * Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.
 */

public class ComplementThree {
    public static void compareString() {
        String setenceA = TerminalFunctions.inputString("Ingrese una palabra: ");
        String setenceB = TerminalFunctions.inputString("Ingrese otra palabra: ");

        if (setenceA.equals(setenceB)) {
            System.out.println("Las dos palabras son iguales");
        } else {
            System.out.println("Las dos palabras son diferentes");
        }
    }
}
