package ClassTwentyOne;

/*
 * The {@code ActivityFour} class contain method related to the activity:
 * Escribe un programa que implemente un juego en el que el usuario debe adivinar una palabra aleatoria. 
 * El programa elegirá una palabra al azar de una lista predefinida y mostrará una pista de la longitud de la palabra. 
 * El usuario tendrá un número limitado de intentos para adivinar la palabra. Después de cada intento, 
 * el programa mostrará cuántas letras ha adivinado correctamente y en qué posición se encuentran.
 * 
 * El programa debe tener las siguientes características:
 * 
 * - Utiliza un array de Strings para almacenar una lista de palabras predefinidas.
 * 
 * - Utiliza el método Math.random() para seleccionar una palabra aleatoria del array.
 * 
 * - Implementa un método para obtener una pista de la palabra seleccionada. 
 *   Por ejemplo, si la palabra es "casa", la pista podría ser "_ _ _ _" (cuatro guiones bajos).
 * 
 * - Implementa un método para comprobar si una letra ingresada por el usuario está presente en la palabra seleccionada 
 *   y en qué posición se encuentra.
 * 
 * - Utiliza un bucle para permitir al usuario ingresar sus intentos hasta que adivine la palabra o se agoten los intentos.
 * 
 * - Muestra un mensaje al usuario al final del juego indicando si adivinó la palabra correctamente o no, 
 *   y muestra la palabra completa.
 */

import Utils.TerminalFunctions;

public class ComplementOne {
    private static String word;
    private static String letters;
    private static int attempts;
    private static boolean isNotGuessed;
    final private static String[] WORDSLIS_STRINGS = { "casa", "arbol", "silla", "mesa", "flor" };

    public static void main(String[] args) {
        TerminalFunctions.init();
        char c;
        reset();

        do {
            showStatus();
            c = TerminalFunctions.inputChar("Ingrese una letra: ");
            verifyLetter(c);
        } while (attempts > 0 && isNotGuessed);
        if (isNotGuessed) {
            System.out.println("Intentos terminados...\nLa palabra era " + word);
        } else {
            System.out.println("Felicidades, adivinaste la palabra: " + word);
        }
        TerminalFunctions.close();
    }

    private static void verifyLetter(char  c) {
        if (word.contains(c + "")) {
            char[] wordCharts = letters.toCharArray();
            for (int i = 0; i < letters.length(); i++) {
                if (word.charAt(i) == c) {
                    wordCharts[i] = c;
                }
            }
            letters = String.copyValueOf(wordCharts);
            isNotGuessed = ! word.equals(letters);
            System.out.println("Letra encontrada");
        } else {
            attempts--;
            System.out.println("Letra incorrecta. Pierdes 1 intento.");
        }
        TerminalFunctions.waitEnter();
    }

    private static void reset(){
        attempts = 3;
        isNotGuessed = true;
        choiceWord();
    }

    private static void choiceWord() {
        int num = (int) (Math.random() * WORDSLIS_STRINGS.length);
        word = WORDSLIS_STRINGS[num];
        letters = "_".repeat(word.length());
    }

    private static void showStatus() {
        TerminalFunctions.clearTerminal();
        System.out.printf("Te quedan %d intentos.\n", attempts);
        for (int i = 0; i < letters.length(); i++) {
            System.out.print(letters.charAt(i) + " ");
        }
        System.out.println("\n");
    }
}
