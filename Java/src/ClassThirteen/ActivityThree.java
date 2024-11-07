package ClassThirteen;

import java.util.Arrays;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). 
 * El programa debe imprimir si los arreglos son iguales o no.
 */

public class ActivityThree {
    public static void arrayCompare() {
        int[] arrInt1 = new int[3];
        int[] arrInt2 = new int[3];

        for (int i = 0; i < arrInt1.length; i++) {
            arrInt1[i] = (int)(Math.random() * 2);
            arrInt2[i] = (int)(Math.random() * 2);
        }

        System.out.println(Arrays.toString(arrInt1));

        System.out.println(Arrays.toString(arrInt2));
        
        System.out.println("Las listas a y b son " + (Arrays.equals(arrInt1, arrInt2) ? "iguales" : "diferentes"));
    }
}
