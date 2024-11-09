package ClassNineteen;

import java.util.Scanner;

public class ActivityTwo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            imprimirNombre(inputString(scanner), inputInt(scanner));
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public static String inputString(Scanner tangamandapio) {
        System.out.println("Ingrese nombre: ");
        return tangamandapio.nextLine();
    }

    public static int inputInt(Scanner scanner){
        System.out.println("Ingrese edad: ");
        int var = scanner.nextInt();
        scanner.nextLine();
        return var;
    }

    public static void imprimirNombre(String nombre, int edad) {
        System.out.printf("Me llamo %s y tengo %d años \n", nombre, edad);
    }
}
