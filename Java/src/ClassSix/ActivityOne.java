package ClassSix;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa que pida al usuario que ingrese dos números enteros 
 * y realice la división del primer número entre el segundo número. 
 * Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. 
 * En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.
 */

public class ActivityOne {
    public static void division() {
        int dividend = TerminalFunctions.inputInt("Ingrese el dividendo: ");
        int divisor = TerminalFunctions.inputInt("Ingrese el divisor: ");

        try {
            int quotient = dividend / divisor;
            System.out.println(dividend + " / " + divisor + " = " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Division por Zero no esta definida.");
        }
    }
}
