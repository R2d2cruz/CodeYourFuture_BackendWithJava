package ClassTen;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * Escribe un programa en el que se cree una variable de tipo array 
 * que contenga seis elementos de tipo entero. 
 * El programa debe contar la cantidad de elementos pares presentes 
 * en el array y mostrar el resultado por consola utilizando 
 * solo las herramientas aprendidas hasta el momento.
 */

public class ComplementOne {
    public static void pairElements(){
        int[] arrInt = new int[6];

        arrInt[0] = (int) (Math.random() * 101);
        arrInt[1] = (int) (Math.random() * 101);
        arrInt[2] = (int) (Math.random() * 101);
        arrInt[3] = (int) (Math.random() * 101);
        arrInt[4] = (int) (Math.random() * 101);
        arrInt[5] = (int) (Math.random() * 101);

        int pair = arrInt[0] % 2 == 0 ? 1 : 0;
        pair += arrInt[1] % 2 == 0 ? 1 : 0;
        pair += arrInt[2] % 2 == 0 ? 1 : 0;
        pair += arrInt[3] % 2 == 0 ? 1 : 0;
        pair += arrInt[4] % 2 == 0 ? 1 : 0;
        pair += arrInt[5] % 2 == 0 ? 1 : 0;

        printArray(arrInt);

        System.out.println("El numero de pares es " + pair);
    }

    public static void printArray(int[] arrInt) {
        System.out.print("[");
        for (int i : arrInt) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}
