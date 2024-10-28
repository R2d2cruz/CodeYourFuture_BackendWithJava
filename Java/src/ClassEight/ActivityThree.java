package ClassEight;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Escribe un programa que genere y muestre en pantalla un número aleatorio 
 * en el rango del 1 al 355  utilizando el método random() de la clase Math. 
 * Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
 */

public class ActivityThree {
    public static void random() {
        int num = (int) Math.floor(Math.random() * 355 + 1);
        System.out.println("numero aleatorio entre 1 y 355: " + num);
    }
}
