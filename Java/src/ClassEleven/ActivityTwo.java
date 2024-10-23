package ClassEleven;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * Escribe un programa que recorra un array de enteros y encuentre el valor 
 * mínimo presente en el array. El tamaño y los números  a contener pueden ser de tu elección.
 */

public class ActivityTwo {
    public static void minVal() {
        int[] arrInt = { 3, 2, 4, 76, 12, -23 };
        int min = arrInt[0];

        printArray(arrInt);

        for (int i = 1; i < arrInt.length; i++) {
            min = min < arrInt[i] ? min : arrInt[i];
        }

        System.out.println("El minimo valor en el array es: " + min);
    }

    public static void printArray(int[] arrInt) {
        System.out.print("[");
        for (int i : arrInt) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}
