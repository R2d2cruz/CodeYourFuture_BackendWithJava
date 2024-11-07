package ClassThirteen;

import java.util.Arrays;
import Utils.TerminalFunctions;

/*
 * The {@code ActivityFive} class contain method related to the activity:
 * El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, 
 * desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) 
 * y devuelve el arreglo modificado. 
 * Vamos a escribir un programa que solicite al usuario el tamaño para un arreglo 
 * y un número entero con el que quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill(). 
 * Finalmente, imprime el arreglo resultante.
 */

public class ActivityFive {
    public static void fillingArray() {
        int n = 0;
        boolean invalid;
        do {
            n = TerminalFunctions.inputInt("Ingrese longitud del arreglo: ");
            invalid = n < 0;
            if (invalid) {
                System.out.println("Valor invalido");
            }
        } while (invalid);
        
        int val = TerminalFunctions.inputInt("Ingrese el valor que desea: ");

        int[] arrInt = new int[n];

        Arrays.fill(arrInt, val);

        System.out.println(Arrays.toString(arrInt));
    }
}
