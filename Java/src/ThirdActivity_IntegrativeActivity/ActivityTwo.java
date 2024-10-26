package ThirdActivity_IntegrativeActivity;

import java.util.Scanner;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * 1. Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.
 * 2. Declara una variable para almacenar el resultado de la operación. 
 * 3. Permite al usuario elegir qué operación quiere realizar.
 * 4. Muestra el resultado de la operación en la consola.
 */

public class ActivityTwo {
    public static void calculator(Scanner scanner){
        int a = inputInt("Ingrese numero a: ", scanner);
        int b = inputInt("Ingrese numero b: ", scanner);

        System.out.println("Opciones de operacion: ");
        System.out.println("1. a + b");
        System.out.println("2. a - b");
        System.out.println("3. a x b");
        System.out.println("4. a / b");
        System.out.println("5. a % b");

        int option = inputInt("Ingrese 1 para suma, u otro numero para resta: ", scanner);

        double c = option > 3 ? (option == 4 ? a / b : (option == 5 ? a % b : 0)) : (option == 3 ? a * b : (option == 2 ? a - b : (option == 1 ? a + b : 0)));
        System.out.println(option > 5 || option < 1 ? "Operacion no valida" : "El resultado es " + c);
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
