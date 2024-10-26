package ClassEleven;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * Escribe un programa que recorra un array de enteros y lo invierta, es decir, 
 * que el primer elemento se convierta en el último y viceversa, 
 * luego imprime el array resultante por consola.  
 * El tamaño y los números  a contener pueden ser de tu elección.
 */

public class ComplementOne {
    public static void invertArray() {
        int[] arrInt = {1, 2, 3, 4, 5};
        int j = arrInt.length - 1;
        int aux;

        printArray(arrInt);

        for (int i = 0; i < arrInt.length / 2; i++) {
            aux = arrInt[i];
            arrInt[i] = arrInt[j - i];
            arrInt[j - i] = aux;
        }

        printArray(arrInt);
    }

    public static void printArray(int[] arrInt) {
        System.out.print("[");
        for (int i : arrInt) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}
