package ClassNineteen;

import java.util.Scanner;

public class ActivityOne {
    public static void main(String[] args) {
        System.out.println("\033\143"); // Limpia la consola

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Indica tu nombre: ");
            String nombre = scanner.nextLine();
            imprimirNombre(nombre);
            System.out.println("Cual es tu edad?");
            int edad = scanner.nextInt();
            imprimirNombre(nombre, edad);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void imprimirNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimirNombre(String nombre, int edad) {
        System.out.printf("Me llamo %s y tengo %d años \n", nombre, edad);
    }
}
