package ArrayClass;

import java.util.Scanner;

/*
 * The {@code ComplementThree} class contain method related to the activity:
 * El programa debe crear un array de tamaño 3 que almacene números enteros. 
 * Luego, solicita un número al usuario y muestra por consola si ese número 
 * está presente en el array o no. 
 * Es importante utilizar únicamente las herramientas aprendidas hasta el momento, 
 * sin emplear bucles en el proceso.
 */

public class ActivityFour {
    public static void arrayInts(Scanner scanner){
        int[] arrayInt = new int[3];
        arrayInt[0] = inputInt("Ingrese primer numero: ", scanner);
        arrayInt[1] = inputInt("Ingrese segundo numero: ", scanner);
        arrayInt[2] = inputInt("Ingrese tercer numero: ", scanner);

        System.out.println("[" + arrayInt[0] + ", " + arrayInt[1] + ", " + arrayInt[2] + "]");
        
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
