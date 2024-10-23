package ClassEleven;

/*
 * The {@code ComplementTwo} class contain method related to the activity:
 * Escribe un programa que recorra un array de enteros y
 * calcule la suma acumulada de los elementos, 
 * reemplazando cada elemento por la suma acumulada hasta ese punto.
 * El tamaño y los números  a contener pueden ser de tu elección.
 */


public class ComplementTwo {
    public static void sumArray() {
        int[] arrInt = {1, 2, 3, 4, 5};
        int sum = 0;

        printArray(arrInt);
        
        for (int i = 0; i < arrInt.length; i++) {
            sum += arrInt[i];
        }

        System.out.println("La suma de los valores del arreglo es: " + sum);
    }

    public static void printArray(int[] arrInt) {
        System.out.print("[");
        for (int i : arrInt) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}
