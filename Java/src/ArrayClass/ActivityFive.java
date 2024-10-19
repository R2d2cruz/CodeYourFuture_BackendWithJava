package ArrayClass;

import java.util.Scanner;

public class ActivityFive {
    public static void copingInArray(Scanner scanner) {
        int[] originalInts = { 32, 16, 25 };
        int[] copyInts = { originalInts[0], originalInts[1], originalInts[2], 0, 0 };

        int aux = inputInt("Ingrese nuevo valor para el arreglo", scanner);
        copyInts[3] = aux;
        
        aux = inputInt("Ingrese nuevo valor para el arreglo", scanner);
        copyInts[4] = aux;

        System.out.println("[" + copyInts[0] + ", " + copyInts[1] + ", " + copyInts[2] + ", " + ", " + copyInts[3]
                + ", " + copyInts[4] + "]");
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
