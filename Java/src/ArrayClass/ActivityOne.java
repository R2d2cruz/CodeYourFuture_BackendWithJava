package ArrayClass;

import java.util.Scanner;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa en el cual se cree una variable de tipo array 
 * que contenga tres elementos de tipo entero. El programa debe sumar 
 * los tres elementos de forma manual e imprimir por consola el resultado 
 * utilizando solamente las herramientas adquiridas hasta el momento.
 */

public class ActivityOne {
    public static void printSumList(Scanner scanner) {
        int[] ints = new int[3];
        ints[0] = inputInt("Ingrese numero 1: ", scanner);
        ints[1] = inputInt("Ingrese numero 2: ", scanner);
        ints[2] = inputInt("Ingrese numero 3: ", scanner);
        int sum = ints[0] + ints[1] + ints[3];
        System.out.println("La suma es " + sum);
    }

    public static int inputInt(String message, Scanner scanner) {
        int val = 0;
        boolean isNotvalid;
        do {
            System.out.print(message);
            try {
                val = scanner.nextInt();
                isNotvalid = false;
            } catch (Exception e) {
                System.out.println("Entrada no valida, intente de nuevo");
                isNotvalid = true;
            }
        } while (isNotvalid);
        return val;
    }
}
