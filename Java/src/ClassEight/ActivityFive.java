package ClassEight;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityFive} class contain method related to the activity:
 * Escribe un programa que pida al usuario un número positivo 
 * y calcule su raíz cuadrada utilizando el método sqrt() de la clase Math. 
 * Si el número ingresado es negativo, muestra un mensaje adecuado en pantalla.
 */

public class ActivityFive {
    public static void sqrtnumbers() {
        int num = TerminalFunctions.inputInt("Ingrese un numero, se tomara su valor absoluto: ");
        num = Math.abs(num);

        System.out.println("sqrt(" + num + ") = " + Math.sqrt(num));
    }
}
