package SecondClass;

import java.util.Scanner;

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
    public static void scannerFunction(Scanner scanner){
        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int age = scanner.nextInt();
        System.out.println("Su nombres es " + name + " y su edad es " + age);
    }
}
