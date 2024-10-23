package ClassEleven;

/*
 * The {@code ActivityFive} class contain method related to the activity:
 * Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu elección. 
 * Luego, suma todos los elementos del array y calcula su promedio. Finalmente, 
 * muestra por consola tanto el resultado de la suma como el promedio de los elementos.
 * Te sugerimos implementar el uso de la sintaxis de for-each.
 */

public class ActivityFive {
    public static void floatAverage() {
        float[] arrFloat = new float[20];

        for (int i = 0; i < arrFloat.length; i++) {
            arrFloat[i] = (float) (Math.random() * 101);
        }

        printArray(arrFloat);

        float average = 0;
        for (float f : arrFloat) {
            average += f;
        }
        average /= arrFloat.length;

        System.out.println("El promedio es " + average);
    }

    public static void printArray(float[] arrFloat) {
        System.out.print("[");
        for (float i : arrFloat) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}
