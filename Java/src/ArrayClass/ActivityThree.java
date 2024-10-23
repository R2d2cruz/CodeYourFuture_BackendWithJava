package ArrayClass;

import java.util.Scanner;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Escribe un programa en el cual se cree una variable de tipo array que 
 * contenga cinco elementos de tipo entero, ingresados por el usuario. 
 * El programa debe buscar el máximo e imprimir por consola el resultado 
 * utilizando solamente las herramientas adquiridas hasta el momento.
 */

public class ActivityThree {
    public static void maxValue(Scanner scanner) {
        int[] nums = new int[5];
        int max;

        nums[0] = inputInt("Ingrese numero 1: ", scanner);
        nums[1] = inputInt("Ingrese numero 2: ", scanner);
        nums[2] = inputInt("Ingrese numero 3: ", scanner);
        nums[3] = inputInt("Ingrese numero 4: ", scanner);
        nums[4] = inputInt("Ingrese numero 5: ", scanner);

        max = nums[0] >= nums[1] ? nums[0] : nums[1];
        max = max >= nums[2] ? max : nums[2];
        max = max >= nums[3] ? max : nums[3];
        max = max >= nums[4] ? max : nums[4];

        System.out.println("El valor maximo es: " + max);
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
