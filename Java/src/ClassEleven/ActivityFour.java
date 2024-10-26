package ClassEleven;

/*
 * The {@code ActivityFour} class contain method related to the activity:
 * Escribe un programa que genere un array de 10 elementos de tipo entero. 
 * Inicializa cada elemento con un número aleatorio menor a 100 y 
 * luego imprime todos los elementos del array en una única línea. 
 * Posteriormente, recorre el array para contar los elementos pares y muestra el total en la consola.
 */

public class ActivityFour {
    public static void pairCounting() {
        int[] arrInt = new int[10];
        int even = 0;

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) (Math.random() * 101);
        }

        for (int i : arrInt) {
            if (i % 2 == 0) {
                even++;
            }
        }

        printArray(arrInt);

        System.out.println("La cantidad de pares es " + even);

    }

    public static void printArray(int[] arrInt) {
        System.out.print("[");
        for (int i : arrInt) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}
