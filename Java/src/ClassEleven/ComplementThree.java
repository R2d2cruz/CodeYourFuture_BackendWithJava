package ClassEleven;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementThree} class contain method related to the activity:
 * Escribe un programa que cree un array de 50 elementos de tipo carácter, 
 * inicializándolo con una frase elegida. 
 * Luego, solicita al usuario un carácter objetivo y 
 * cuenta cuántas veces aparece ese carácter en el array. 
 * Finalmente, imprime el resultado por consola.
 */

public class ComplementThree {
    public static void searchLetter() {
        String sentence = TerminalFunctions.inputString("Ingrese una frase: ");
        char letter = (TerminalFunctions.inputString("Ingrese el caracter que busca: ")).toCharArray()[0];
        char[] letters = sentence.toCharArray();
        int sum = 0;
        for (char c : letters) {
            if (c == letter) {
                sum += 1;
            }
        }

        System.out.println("En la frase: " + sentence);
        System.out.println("Hay " + sum + " letras " + letter);
    }
}
