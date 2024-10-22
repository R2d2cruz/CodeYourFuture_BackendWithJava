package ClassEleven;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Escribe un programa que recorra un array de enteros y los imprima en orden inverso, 
 * comenzando desde el último elemento.. 
 * El tamaño y los números  a contener pueden ser de tu elección.
 */

public class ActivityThree {
    public static void printInv() {
        int[] arrInt = {1, 2, 3, 4, 5};

        System.out.print("[");
        for (int i = arrInt.length - 1; i >= 0; i--) {
            System.out.print(" " + arrInt[i] + " ");
        }
        System.out.println("]");
    }
}
