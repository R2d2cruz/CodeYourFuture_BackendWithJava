package ClassFifteen;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Escribe un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. 
 * La serie de Fibonacci es una secuencia en la que cada número es la suma de los dos anteriores.
 * 
 * La serie de Fibonacci comienza de la siguiente manera:
 * 
 * Posición 0: 0
 * Posición 1: 1
 * Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)
 * Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)
 * Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)
 * 
 * Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2, 3.
 */

public class ActivityThree {
    public static void fibonaci() {
        int prev = 1;
        int actual = 0;
        int next;
        int i = 0;

        do {
            System.out.print(actual + " ");
            next = prev + actual;
            prev = actual;
            actual = next;
        } while (7 > i++);

        System.out.println("");
    }
}
