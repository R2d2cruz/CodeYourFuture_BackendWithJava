package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, 
 * que representen un índice inicial y un índice final. 
 * Utiliza el método substring() de la clase String para extraer la subcadena que se encuentra 
 * entre los índices ingresados por el usuario, y muestra la subcadena resultante en pantalla.
 */

public class ActivityThree {
    public static void cutString() {
        String string = TerminalFunctions.inputString("Ingrese la cadena que desea recortar: ");
        int indexA = TerminalFunctions.inputInt(string.length() - 1, "Ingrese indice inicial: ");
        int indexB = TerminalFunctions.inputInt(indexA, string.length() - 1, "Ingrese indice final: ");

        System.out.println("La cadena recortada resulta en: ");
        System.out.println(string.substring(indexA, indexB));
    }
}
