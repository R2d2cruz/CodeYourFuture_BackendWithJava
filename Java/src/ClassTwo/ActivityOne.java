package ClassTwo;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * 1. Solicita al usuario que ingrese su nombre (cadena de texto), 
 *    guárdalo en una variable e imprime el dato por consola..
 * 2. Solicita al usuario que ingrese su edad (número), 
 *    guárdalo en una variable e imprime el dato por consola..
 * 3. Luego imprime en pantalla un mensaje que diga 
 *    “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
 */

public class ActivityOne {
    public static void scannerFunction(){
        System.out.println("Ingrese su nombre: ");
        String name = TerminalFunctions.getScanner().nextLine();
        System.out.println("Ingrese su edad: ");
        int age = TerminalFunctions.getScanner().nextInt();
        TerminalFunctions.getScanner().nextLine();
        System.out.println("Su nombres es " + name + " y su edad es " + age);
    }
}
