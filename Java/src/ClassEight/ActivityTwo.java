package ClassEight;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * Escribe un programa que pida al usuario un número decimal 
 * y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.
 */

public class ActivityTwo {
    public static void rounding() {
        double num = TerminalFunctions.inputDouble("Ingrese numero decimal: ");

        System.out.println("El numero " + num + " redondeado es " + Math.round(num));
    }
}
