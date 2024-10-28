package ClassEight;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityFour} class contain method related to the activity:
 * Escribe un programa que pida al usuario dos números enteros, representando la base y el exponente, 
 * y calcula el resultado de elevar la base al exponente utilizando el método pow() de la clase Math. 
 * Muestra el resultado en pantalla.
 */

public class ActivityFour {
    public static void powNumbers() {
        double base = TerminalFunctions.inputDouble("Ingrese base: ");
        double exponent = TerminalFunctions.inputDouble("Ingrese exponente: ");

        System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
    }
}
