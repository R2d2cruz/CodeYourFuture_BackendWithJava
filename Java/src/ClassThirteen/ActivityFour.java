package ClassThirteen;

import Utils.TerminalFunctions;
import java.util.Arrays;

/*
 * The {@code ActivityFour} class contain method related to the activity:
 * Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. 
 * Luego, solicita al usuario dos índices: un índice inicial y un índice final. 
 * Con estos dos índices, copia la parte del arreglo original comprendida entre ellos (inclusive) 
 * en un nuevo arreglo utilizando el método Arrays.copyOfRange(). 
 * Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final 
 * y que ambos índices están dentro del rango válido del arreglo original. Finalmente, 
 * imprime el nuevo arreglo por consola.
 */

public class ActivityFour {
    public static void arrayChange() {
        int[] arrInt = new int[10];
        int[] arrIndex = new int[arrInt.length];
        int indexA;
        int indexB;
        boolean indexValid;

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int)(Math.random() * 100 + 1);
        }

        System.out.println(Arrays.toString(arrInt));
        for (int i = 0; i < arrIndex.length; i++) {
            arrIndex[i] = i;
        }

        System.out.println(Arrays.toString(arrIndex));

        do {
            System.out.print("Ingrese indice inicial para copiar: ");
            indexA = TerminalFunctions.getScanner().nextInt();
            indexValid = indexA >= 0 && indexA < arrInt.length;
            if (!indexValid) {
                System.out.println("Indice no valido");
            }
        } while (!indexValid);

        do {
            System.out.print("Ingrese indice final para copiar: ");
            indexB = TerminalFunctions.getScanner().nextInt();
            indexValid = indexB >= indexA && indexB < arrInt.length;
            if (!indexValid) {
                System.out.println("Indice no valido");
            }
        } while (!indexValid);
        
        int[] newArrInt = Arrays.copyOfRange(arrInt, indexA, indexB + 1);
        System.out.println(Arrays.toString(newArrInt));
    }
}
