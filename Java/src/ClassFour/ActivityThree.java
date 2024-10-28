package ClassFour;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * En esta actividad, escribirás un programa que solicite al usuario un número 
 * y determine si es divisible por 5, por 3, por ambos o por ninguno. 
 * El resultado se mostrará en pantalla.
 */

public class ActivityThree {
    public static void divisible35(){
        int number = TerminalFunctions.inputInt("Ingrese un numero: ");
        
        if (number % 3 == 0) {
            if (number % 5 ==0) {
                System.out.println("El numero " + number + " es divisible por 3 y por 5");
            } else {
                System.out.println("El numero " + number + " es divisible por 3");
            }
        } else {
            if (number % 5 ==0) {
                System.out.println("El numero " + number + " es divisible por 5");
            } else {
                System.out.println("El numero " + number + " no es divisible ni por 3 y ni por 5");
            }            
        }
        
    }
}
