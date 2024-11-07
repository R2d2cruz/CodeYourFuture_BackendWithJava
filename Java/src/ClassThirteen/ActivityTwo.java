package ClassThirteen;

import Utils.TerminalFunctions;
import java.util.Arrays;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. 
 * La clase Arrays ya incluye su implementación mediante el método binarySearch(). 
 * Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). 
 * El programa debe imprimir el arreglo generado originalmente, 
 * solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.
 */

public class ActivityTwo {
    public static void searchRandom() {
        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int)(Math.random() * 100 + 1);
        }

        Arrays.sort(arrInt);

        System.out.println(Arrays.toString(arrInt));

        int search = TerminalFunctions.inputInt("Ingrese el numero que desea buscar: ");

        int index = Arrays.binarySearch(arrInt, search);

        System.out.println(index >= 0 ? " El numero se encuentra en la poscision " + index : "El numero no se encuentra en la lista");
    }
}
