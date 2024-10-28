package ClassSeven;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, 
 * y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.
 */

public class ActivityTwo {
    public static void concatName() {
        String firstName = TerminalFunctions.inputString("Ingrese primer nombre: ");
        String lastName = TerminalFunctions.inputString("Ingrese primer apellido: ");
    
        String fullName = (firstName.concat(" ")).concat(lastName);
        System.out.print("Su nombre completo es ");
        System.out.println(fullName);
    }
}
