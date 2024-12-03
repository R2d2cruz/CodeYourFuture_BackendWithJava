package ClassNineteen;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * 1. Obtener datos: Perfeccionando la actividad de “imprimir datos”, 
 *    no solo crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, 
 *    el nombre y la edad, sino a su vez, crea dos métodos para obtener el nombre y la edad, respectivamente. 
 *    Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner".
 * 
 * 2. Usar una variable global: Modifica los métodos "obtenerNombre()" y "obtenerEdad()" para que no necesiten recibir el Scanner por parámetro. 
 *    En su lugar, utiliza una variable global para acceder al Scanner y obtener los datos necesarios.
 */

import java.util.Scanner;

public class ActivityThree {
    public static Scanner scanner = new Scanner(System.in);

    
    public static void funtionsActivity() {
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
