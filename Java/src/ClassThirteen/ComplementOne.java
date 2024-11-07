package ClassThirteen;

import Utils.TerminalFunctions;
import java.util.Arrays;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * Escribe un programa en Java que realice lo siguiente:
 * 
 * - Solicita al usuario un tamaño para un arreglo.
 * - Luego, pídele que ingrese un número con el que desea rellenar el array.
 * - Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
 * - El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.
 * 
 * Asegúrate de validar lo siguiente:
 * 
 * - La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.
 * - Si el índice ingresado no es el índice del último elemento del arreglo, 
 *   el programa debe continuar pidiendo al usuario nuevos números e índices para rellenar el arreglo.
 * - El índice siempre debe ser menor que el tamaño total del arreglo.
 * 
 * Cada vez que se solicita un nuevo número para rellenar el arreglo, 
 * el índice ingresado debe ser mayor que el último índice ingresado; 
 * a su vez, se debe rellenar el array con el nuevo número desde el índice anterior hasta el nuevo índice.
 * 
 * Por último, el programa debe imprimir por consola el arreglo completo.
 */



public class ComplementOne {
    public static void fillingPersonalized() {
        int n = -1;
        int spam = 0;
        int indexA = 0;
        int indexB = 0;

        boolean isNotValid = true;
        boolean isNotValidIndex = true;

        do {
            try {
                n = TerminalFunctions.inputInt("Ingrese tamaño del arreglo: ");
                isNotValid = n < 0;
            } catch (Exception e) {
                System.out.println("Entrada invalida");
            }
        } while (isNotValid);
        
        int[] arrInt = new int[n];

        do {
            System.out.println(Arrays.toString(arrInt));
            do {
                try {
                    indexB = TerminalFunctions.inputInt("Ingrese tamaño del indice hasta donde desea llenar: ");
                    isNotValid = indexB >= n;
                    isNotValidIndex = indexA > indexB;
                    if (isNotValidIndex) {
                        System.out.println("Indice no valido, ingrese indice mayor o igual a " + indexA);
                    }
                    if (isNotValid) {
                        System.out.println("Ingrese un indice menor a " + n);
                    }
                } catch (Exception e) {
                    System.out.println("Entrada invalida");
                }
            } while (isNotValid || isNotValidIndex);
            do {
                try {
                    spam = TerminalFunctions.inputInt("Ingrese spam: ");
                    isNotValid = false;
                } catch (Exception e) {
                    System.out.println("Entrada invalida");
                    isNotValid = true;
                }
            } while (isNotValid);
            
            Arrays.fill(arrInt, indexA, indexB + 1, spam);

            indexA = indexB;

        } while (indexA < n - 1);
        
        System.out.println(Arrays.toString(arrInt));
    }
}
