package ClassFifteen;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando un bucle do-while. 
 * Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. 
 * Finalizar el programa cuando ingrese 0 (cero).
 * 
 * Un número es primo si solo tiene dos divisores: 1 y él mismo. 
 */

public class ActivityFour {
    public static void isPrime() {
        int num, i = 0;
        boolean inBucle, isPrime = true;
        
        do {
            num = TerminalFunctions.inputInt("Ingrese numero natural (0 para salir): ");
            inBucle = num != 0;
            if (inBucle) {
                if (num % 2 == 0 || num == 1) {
                    isPrime = false;
                } else {
                    while (i <= Math.sqrt(num) && isPrime) {
                        isPrime = num % i++ != 0; 
                    }
                }
                if (isPrime) {
                    System.out.println("El numero " + num + " es primo");
                } else {
                    System.out.println("El numero " + num + " no es primo");                    
                }
            }
        } while (inBucle);
    }
}
