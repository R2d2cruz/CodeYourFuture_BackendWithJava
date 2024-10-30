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

public class ActivityTwo {
    public static void searchFibonaci() {
        int prev = 1;
        int actual = 0;
        int next;
        int i = 0;

        int search = TerminalFunctions.inputInt("Ingrese que numero de fibonacci busca: ");

        do {
            next = prev + actual;
            prev = actual;
            actual = next;
        } while (search > i++);

        System.out.println(prev);
    }
}
