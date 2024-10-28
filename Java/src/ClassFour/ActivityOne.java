package ClassFour;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * En esta actividad, deberás escribir un programa que solicite al usuario un número 
 * y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.
 */

public class ActivityOne {
    public static void determineNumber(){
        int val = TerminalFunctions.inputInt("Ingrese un numero entero: ");

        if (val > 0){
            System.out.println("El numero " + val + " es positivo");
        } else {
            if (val == 0) {
                System.out.println("El numero " + val + " es igual a 0");
            } else {
                System.out.println("El numero " + val + " es negativo");
            }
        }
    }
}
