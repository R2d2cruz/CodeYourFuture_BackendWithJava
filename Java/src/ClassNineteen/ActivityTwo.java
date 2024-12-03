package ClassNineteen;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * 1. Obtener datos: Perfeccionando la actividad de “imprimir datos”, 
 *    no solo crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, 
 *    el nombre y la edad, sino a su vez, crea dos métodos para obtener el nombre y la edad, respectivamente. 
 *    Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner".
 */

import java.util.Scanner;

public class ActivityTwo {
    public static void funtionsActivity() {
        try (Scanner scanner = new Scanner(System.in)) {
            imprimirNombre(inputString(scanner), inputInt(scanner));
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
