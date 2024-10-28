package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityFour} class contain method related to the activity:
 * Escribe un programa que pida al usuario ingresar una palabra y un carácter, 
 * y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. 
 * Muestra un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.
 */

public class ActivityFour {
    public static void searchChar() {
        String word = TerminalFunctions.inputString("Ingrese una palabra: ");
        char charSearch = TerminalFunctions.inputChar("Ingrese caracter que desea buscar: ");

        int index = word.indexOf(charSearch);

        if (index > 0) {
            System.out.println("La primera aparicion de la letra " + charSearch + " esta en la posicion " + index);
        } else {
            System.out.println("La letra" + charSearch + " no se encuentra en la palabra");
        }
    }
}
