package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. 
 * Utiliza el método replace() de la clase String para reemplazar todas las ocurrencias del primer carácter 
 * con el segundo carácter en la frase ingresada por el usuario. Muestra la frase resultante en pantalla.
 */

public class ComplementOne {
    public static void changeChar() {
        String sentence = TerminalFunctions.inputString("Ingrese cadena de texto: ");

        char charA = TerminalFunctions.inputChar("Ingrese caracter que desea cambiar: ");
        char charB = TerminalFunctions.inputChar("Ingrese caracter con el que quiere remplazar: ");

        String newSentence = sentence.replace(charA, charB);
        System.out.println("La cadena quedo: \n" + newSentence);
    }
}
