package ClassEleven;

import java.util.Scanner;

/*
 * The {@code ComplementThree} class contain method related to the activity:
 * Escribe un programa que cree un array de 50 elementos de tipo carácter, 
 * inicializándolo con una frase elegida. 
 * Luego, solicita al usuario un carácter objetivo y 
 * cuenta cuántas veces aparece ese carácter en el array. 
 * Finalmente, imprime el resultado por consola.
 */

public class ComplementThree {
    public static void searchLetter(Scanner scanner) {
        System.out.println("Ingrese una frase: ");
        String sentence = scanner.next();
        System.out.print("Ingrese el caracter que busca: ");
        char letter = (scanner.next()).toCharArray()[0];
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
