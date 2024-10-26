package ClassEleven;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea separada. 
 * El tamaño, tipo de datos y la información a contener pueden ser de tu elección.
 */

public class ActivityOne {
    public static void printArrayLn() {
        int[] arrInt = {3, 2, 4, 76, 12};

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
