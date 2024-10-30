package ClassSixteen;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityFive} class contain method related to the activity:
 * Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. 
 * Luego, imprime una representación visual de estos números en forma de gráfico de barras utilizando asteriscos. 
 * Cada número ingresado corresponderá a la longitud de una barra en el gráfico, 
 * donde cada asterisco representa una unidad en la escala. A modo de ejemplo:
 * 
 * 2**
 * 5*****
 * 1*
 * 4****
 */

public class ActivityFive {
    public static void dots() {
        int[] longitudes = new int[4];
        int num;
        boolean noEsValido;
        for (int i = 0; i < 4; i++) {
            do {
                num = TerminalFunctions.inputInt(String.format("Ingrese numero %d: ", i + 1));
                noEsValido = !(num > 0 && num < 21);
                if (noEsValido) {
                    System.out.println("El numero esta fuera de rango");
                }
            } while (noEsValido);
            longitudes[i] = num;
        }

        for (int i : longitudes) {
            System.out.print(i + "\t");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
