package ClassTwentyOne;

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
