package ClassEleven;

/*
 * The {@code ActivitySix} class contain method related to the activity:
 * Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. 
 * Luego, concatena los elementos en una sola cadena, separados por espacios, 
 * e imprime el resultado por consola.
 */

import java.util.Scanner;

public class ActivitySix {
    public static void concatenateStrings(Scanner scanner) {
        String[] arrChar = { "hola", "Bienvenido", "a", "mi", "codigo" };

        String sentence = "";
        for (String string : arrChar) {
            sentence += string + " ";
        }

        System.out.println(sentence.trim());
    }
}
