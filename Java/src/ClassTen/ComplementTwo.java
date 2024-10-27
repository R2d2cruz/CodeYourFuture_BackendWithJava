package ClassTen;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * Desarrolla un programa que cree un array de tamaño 5 que almacene números enteros. 
 * Luego, suma los elementos ubicados en las posiciones pares del array (es decir, 
 * las posiciones 0, 2 y 4) y muestra por consola el resultado de la suma. 
 * Utiliza exclusivamente las herramientas aprendidas hasta el momento.
 */

public class ComplementTwo {
    public static void pairIndex() {
        int[] arrInt = new int[5];

        arrInt[0] = (int) (Math.random() * 101);
        arrInt[1] = (int) (Math.random() * 101);
        arrInt[2] = (int) (Math.random() * 101);
        arrInt[3] = (int) (Math.random() * 101);
        arrInt[4] = (int) (Math.random() * 101);

        int sum = arrInt[0] + arrInt[2] + arrInt[4];

        printArray(arrInt);

        System.out.println("La suma de indices pares es " + sum);
    }

    public static void printArray(int[] arrInt) {
        System.out.print("[");
        for (int i : arrInt) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}
