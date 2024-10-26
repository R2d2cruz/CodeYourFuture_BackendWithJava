package ArrayClass;

import java.util.Scanner;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * Escribe un programa en el cual se cree una variable de tipo array que 
 * contenga cuatro elementos de tipo entero. Estos elementos deben ser 
 * ingresados por el usuario. El programa debe sumar y promediar los cuatro 
 * elementos de forma manual e imprimir por consola el resultado, utilizando 
 * solamente las herramientas adquiridas hasta el momento.
 */

public class ActivityTwo {
    public static void average(Scanner scanner) {
        int[] nums = new int[4];
        nums[0] = inputInt("Ingrese numero 1: ", scanner);
        nums[1] = inputInt("Ingrese numero 2: ", scanner);
        nums[2] = inputInt("Ingrese numero 3: ", scanner);
        nums[3] = inputInt("Ingrese numero 4: ", scanner);
        double prom = (nums[0] + nums[1] + nums[2] + nums[3]) / 4;
        System.out.println("El promedio es " + prom);
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
