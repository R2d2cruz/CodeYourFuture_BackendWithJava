package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementTwo} class contain method related to the activity:
 * Crea un programa que solicite al usuario ingresar una frase con espacios en blanco al principio y al final. 
 * Utiliza el método trim() de la clase String para eliminar los espacios en blanco 
 * y luego muestra la frase resultante en pantalla.
 */

public class ComplementTwo {
    public static void trimString() {
        System.out.println("Ingrese cadena de texto con espacios al inico y al final: ");
        String string = TerminalFunctions.getScanner().nextLine();

        System.out.println(string.trim());
    }
}
