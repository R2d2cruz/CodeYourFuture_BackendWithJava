package ClassNineteen;

import java.util.Scanner;

public class ActivityThree {
    public static Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        try {
            imprimirNombre(inputString(), inputInt());
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }

    public static String inputString() {
        System.out.println("Ingrese nombre: ");
        return scanner.nextLine();
    }

    public static int inputInt() {
        System.out.println("Ingrese edad: ");
        int var = scanner.nextInt();
        scanner.nextLine();
        return var;
    }

    public static void imprimirNombre(String nombre, int edad) {
        System.out.printf("Me llamo %s y tengo %d años \n", nombre, edad);
    }
}
