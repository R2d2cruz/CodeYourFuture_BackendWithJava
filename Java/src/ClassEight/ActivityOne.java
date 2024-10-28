package ClassEight;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa que  pida al usuario un número entero 
 * y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math.
 */

public class ActivityOne {
    public static void absInt() {
        int num = TerminalFunctions.inputInt("Ingrese un numero entero: ");

        System.out.println("El valor absoluto de " + num + " es " + Math.abs(num));
    }
}
