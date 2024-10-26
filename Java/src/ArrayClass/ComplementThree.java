package ArrayClass;

import java.util.Scanner;

/*
 * The {@code ComplementThree} class contain method related to the activity:
 * Desarrolla un programa que pida al usuario ingresar 4 nombres. 
 * Estos nombres serán ordenados alfabéticamente y posteriormente impresos en la consola. 
 * Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento.
 */

public class ComplementThree {
    public static void alfabetic(Scanner scanner){
        String[] names = new String[4];
        
        System.out.println("Ingrese su nombre: ");
        names[0] = scanner.next();
        
        System.out.println("Ingrese su nombre: ");
        names[1] = scanner.next();
        
        System.out.println("Ingrese su nombre: ");
        names[2] = scanner.next();
        
        System.out.println("Ingrese su nombre: ");
        names[3] = scanner.next();

        String aux = names[0];

        if (names[0].compareTo(names[1]) >= 0) {
            names[0] = names[1];
            names[1] = aux;
        }

        if (names[1].compareTo(names[2]) >= 0) {
            aux = names[1];
            names[1] = names[2];
            names[2] = aux;
        }

        if (names[2].compareTo(names[3]) >= 0) {
            aux = names[2];
            names[2] = names[3];
            names[3] = aux;
        }

        if (names[0].compareTo(names[1]) >= 0) {
            aux = names[0];
            names[0] = names[1];
            names[1] = aux;
        }

        if (names[1].compareTo(names[2]) >= 0) {
            aux = names[1];
            names[1] = names[2];
            names[2] = aux;
        }

        if (names[0].compareTo(names[1]) >= 0) {
            aux = names[0];
            names[0] = names[1];
            names[1] = aux;
        }

        System.out.println(names[0] + names[1] + names[2] + names[3]);
    }
}
