package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementFour} class contain method related to the activity:
 * En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud, 
 * pero esta vez sin contar los espacios en blanco. 
 * Para lograr esto, se utilizará el método length() de la clase String 
 * y se realizará un proceso adicional para excluir los espacios de la cuenta.
 */

public class ComplementFour {
    public static void countingChars() {
        String sentence = TerminalFunctions.inputString("Ingrese la cadena de caracteres: ");

        String sentenceNoSpace = sentence.replace(" ", "");

        System.out.println("La cantidad de caracteres son: " + sentenceNoSpace.length());
    }
}
