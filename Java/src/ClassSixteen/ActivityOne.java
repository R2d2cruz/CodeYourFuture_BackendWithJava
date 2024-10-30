package ClassSixteen;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando un bucle do-while. 
 * Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. 
 * Finalizar el programa cuando ingrese 0 (cero).
 * 
 * Un número es primo si solo tiene dos divisores: 1 y él mismo. 
 */

public class ActivityOne {
    public static void factorial() {
        int num = TerminalFunctions.inputInt("Ingrese numero para calcular factorial: ");

        int factorial = 1;

        do {
            factorial *= num > 0 ? num-- : 1;
        } while (num > 1);

        System.out.printf("%d ! = %d", num, factorial);
    }
}
