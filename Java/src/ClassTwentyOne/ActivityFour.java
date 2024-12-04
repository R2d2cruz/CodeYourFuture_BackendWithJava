package ClassTwentyOne;

import Utils.TerminalFunctions;
import java.util.Arrays;

/*
 * The {@code ActivityFour} class contain method related to the activity:
 * 1. Solicita al usuario que ingrese su nombre (cadena de texto), 
 *    guárdalo en una variable e imprime el dato por consola..
 * 2. Solicita al usuario que ingrese su edad (número), 
 *    guárdalo en una variable e imprime el dato por consola..
 * 3. Luego imprime en pantalla un mensaje que diga 
 *    “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
 */

public class ActivityFour {
    private static String sentence = "", word, word2;
    private static int option, i;
    private static String[] aux, words = {};
    private static boolean vbool;

    public static void sentenceManipulation() {

        do {
            option = menu();

            switch (option) {
                case 1 -> sentenceCreation();
                case 2 -> countChars();
                case 3 -> countWords();
                case 4 -> sortWords();
                case 5 -> searchByIndex();
                case 6 -> searchWord();
                case 7 -> changeWord();
                case 8 -> addEnd();
                case 0 -> {
                }
                default -> {
                }
            }
            TerminalFunctions.waitEnter();
        } while (option != 0);
    }

    private static void sentenceCreation() {
        if (sentence.isEmpty()) {
            sentence = TerminalFunctions.inputString("Crear una oracion: ").trim();
            words = sentence.split(" ");
        } else {
            System.out.println("Borrando oración");
            sentence = "";
        }
    }

    private static void countChars() {
        System.out.printf("La oracion tiene %d caracteres", sentence.length());
    }

    private static void countWords() {
        System.out.printf("La oracion tiene %d palabras", sentence.length());
    }

    private static void sortWords() {
        aux = sentence.split(" ");
        Arrays.sort(aux);
        System.out.println("Palabras desc:" + Arrays.toString(aux));
    }

    private static void searchByIndex() {
        i = TerminalFunctions.inputInt("Ingrese un numero") - 1;
        if (i < words.length) {
            word = words[i];
            System.out.println("La palabra en la posición " + (i + 1) + " es " + word);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    private static void changeWord() {
        do {
            word = TerminalFunctions.inputString("Ingrese una palabra a modificar:").toLowerCase();
            vbool = sentence.contains(word);
            if (vbool) {
                word2 = TerminalFunctions.inputString("Ingresa la nueva palabra a modificar");
                sentence = sentence.replaceFirst(word, word2);
            }
        } while (!vbool);
        System.out.println("La nueva oracion:" + sentence);
    }

    private static void searchWord() {
        word = TerminalFunctions.inputString("Ingrese una palabra a buscas:").toLowerCase();
        for (i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().contains(word)) {
                System.out.println("La palabra es:" + words[i] + " y la posicion es:" + (i + 1));
                break;
            }
        }
        if (i == words.length) {
            System.out.println("No esta tu palabra sorry");
        }
    }

    private static void addEnd() {
        word = TerminalFunctions.inputString("Ingrese nuevo contenido a la oración: ");
        sentence = sentence.concat(" ").concat(word).trim();
        System.out.println("nueva oracion:" + sentence);
    }

    private static int menu() {
        TerminalFunctions.clearTerminal();
        System.out.println("------------------------------------");
        System.out.println("Opciones:");
        System.out.println("1. " + (sentence.isEmpty() ? "Crear oracion" : "Borrar oracion"));
        System.out.println("2. Contar caracteres");
        System.out.println("3. Contar palabras.");
        System.out.println("4. Ordenar palabras alfabeticamente.");
        System.out.println("5. Buscar palabra por posicion");
        System.out.println("6. Buscar palabra");
        System.out.println("7. Cambiar palabra");
        System.out.println("8. Agregar mas palabras al final");
        System.out.println("0. Salir");
        System.out.println("-------------------------------------");
        return TerminalFunctions.inputInt(8, "Ingrese la opcion que desea utilizar: ");
    }
}
