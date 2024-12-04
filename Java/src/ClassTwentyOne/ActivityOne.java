package ClassTwentyOne;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Reorganiza el código extrayendo la lógica en métodos sin alterar su funcionamiento. 
 * Después, intenta modificar la lógica para resolverlo de forma recursiva. 
 */

import Utils.TerminalFunctions;

public class ActivityOne {
    public static void fibonaci() {
        int search = TerminalFunctions.inputInt("Ingrese que posicion de fibonacci busca: ");
        System.out.println("Por medio de la funcion da: " + fibonaciSimple(search));
        System.out.println("Por medio de la funcion da: " + fibonaciRecursive(search));
    }

    private static int fibonaciSimple(int search) {
        int prev = 1;
        int actual = 0;
        int next;
        int i = 0;

        do {
            next = prev + actual;
            prev = actual;
            actual = next;
        } while (search > i++);

        return prev;
    }

    private static int fibonaciRecursive(int search){
        if (search < 2) {
            if (search <= 0) {
                return 0;
            }
            return 1;
            
        }
        return fibonaciRecursive(search - 1) + fibonaciRecursive(search - 2);
    }
}