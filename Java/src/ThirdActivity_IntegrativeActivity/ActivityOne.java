package ThirdActivity_IntegrativeActivity;

import java.util.Scanner;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * 1. Solicita al usuario que ingrese un número y almacena este valor en una variable. 
 * 2. Desarrolla un programa que determine si el número ingresado es par o impar.
 * 3. Muestra el resultado en la consola.
 */

public class ActivityOne {
    public static void evenOrOdd(Scanner scanner){
        int number = inputInt("Ingrese un numero: " ,scanner);
        String numberType = number % 2 == 0 ? "par" : "impar";
        System.out.println("El numero" + number + " es " + numberType);
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
