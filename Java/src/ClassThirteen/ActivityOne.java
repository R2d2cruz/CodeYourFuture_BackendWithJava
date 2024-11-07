package ClassThirteen;

import java.util.Arrays;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. 
 * Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial 
 * y luego ordenalo en forma descendente utilizando el método Arrays.sort(). 
 * Finalmente, imprime los elementos ordenados en la consola.
 */

public class ActivityOne {
    public static void sortingReverse() {
        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int)(Math.random() * 100 + 1);
        }

        System.out.println(Arrays.toString(arrInt));
        Arrays.sort(arrInt);

        int aux;
        int n = arrInt.length - 1;
        for (int i = 0; i < arrInt.length / 2; i++) {
            aux = arrInt[i];
            arrInt[i] = arrInt[n - i];
            arrInt[n - i] = aux;
        }
        System.out.println(Arrays.toString(arrInt));

    }
}
