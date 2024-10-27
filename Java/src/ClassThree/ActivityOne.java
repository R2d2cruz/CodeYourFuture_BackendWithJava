package ClassThree;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * 1. Solicita al usuario que ingrese un número y almacena este valor en una variable. 
 * 2. Desarrolla un programa que determine si el número ingresado es par o impar.
 * 3. Muestra el resultado en la consola.
 */

public class ActivityOne {
    public static void evenOrOdd(){
        int number = TerminalFunctions.inputInt("Ingrese un numero: ");
        String numberType = number % 2 == 0 ? "par" : "impar";
        System.out.println("El numero" + number + " es " + numberType);
    }
}
