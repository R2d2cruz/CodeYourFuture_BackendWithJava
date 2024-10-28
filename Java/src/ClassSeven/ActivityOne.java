package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa que pida al usuario ingresar una cadena de texto 
 * y muestre en pantalla su longitud utilizando el método length() de la clase String.
 */

public class ActivityOne {
    public static void stringLength() {
        String sentence = TerminalFunctions.inputString("Ingrese una oracion: ");

        System.out.println("La longitud de caracteres de su oracion son " + sentence.length() + " caracteres");
    }
}
