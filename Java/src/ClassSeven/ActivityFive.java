package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityFive} class contain method related to the activity:
 * Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla la misma cadena, 
 * pero con todos los caracteres en mayúsculas o minúsculas. 
 * Utiliza los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.
 */

public class ActivityFive {
    public static void upToDown() {
        String sentence = TerminalFunctions.inputString("Ingrese cadena que desea convertir: ");

        System.out.println("Upper case: ");
        System.out.println(sentence.toUpperCase());

        System.out.println("Lower case: ");
        System.out.println(sentence.toLowerCase());
    }
}
