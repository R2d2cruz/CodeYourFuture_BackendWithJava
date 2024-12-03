package ClassNineteen;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * 1. Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]". 
 * Invocar dicho método desde el método main para ver el mensaje por consola
 * 
 * 2. Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, 
 * y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".
 */

import Utils.TerminalFunctions;
import java.util.Scanner;

public class ActivityOne {
    public static void funtionsActivity() {
        TerminalFunctions.clearTerminal();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Indica tu nombre: ");
            String nombre = scanner.nextLine();
            imprimirNombre(nombre);
            System.out.println("Cual es tu edad?");
            int edad = scanner.nextInt();
            imprimirNombre(nombre, edad);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void imprimirNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    private static void imprimirNombre(String nombre, int edad) {
        System.out.printf("Me llamo %s y tengo %d años \n", nombre, edad);
    }
}
