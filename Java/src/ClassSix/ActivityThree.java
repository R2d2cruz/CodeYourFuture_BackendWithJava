package ClassSix;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. 
 * Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. 
 * Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. 
 * En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla.
 */

public class ActivityThree {
    public static void intToString() {
        String numString = TerminalFunctions.inputString("Ingrese un numero entero: ");

        try {
            int num = Integer.parseInt(numString);
            System.out.println("El numero se guardo correctamente, el valor es " + num);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir el numero, la entrada no corresponde a un numero entero");
        }
    }
}
