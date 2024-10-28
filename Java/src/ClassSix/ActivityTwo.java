package ClassSix;

import Utils.TerminalFunctions;
import java.util.InputMismatchException;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * Escribe un programa que pida al usuario que ingrese dos números enteros 
 * y realice la división del primer número entre el segundo número. 
 * Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. 
 * En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.
 */

public class ActivityTwo {
    public static void inputTry() {
        try {
            System.out.print("Ingrese minuendo: ");
            int minuend = TerminalFunctions.getScanner().nextInt();
            TerminalFunctions.getScanner().nextLine(); // Consumes the newline
            System.out.print("Ingrese sustraendo: ");
            int subtrahend = TerminalFunctions.getScanner().nextInt();
            TerminalFunctions.getScanner().nextLine(); // Consumes the newline
            int difference = minuend - subtrahend;
            System.out.println(minuend + " - " + subtrahend + " = " + difference);
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida.");
            TerminalFunctions.getScanner().nextLine(); // Clears the buffer in case of error
        }
    }
}
