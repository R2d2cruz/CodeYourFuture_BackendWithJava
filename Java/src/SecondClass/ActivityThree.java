package SecondClass;

import java.util.Scanner;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * 1. Pide al usuario que ingrese dos números, y:
 *    a. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado.
 *    b. Verifica si el primer número ingresado  es distinto al segundo número ingresado . 
 *       Muestra el resultado en consola.
 *    c. Verifica si el primer número ingresado  es divisible por 2 . 
 *       Muestra el resultado en consola.
 * 2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
 *    a. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
 *    b. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
 */

public class ActivityThree {
    public static void comparations(Scanner scanner){
        System.out.print("Ingrese un numero entero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int b = scanner.nextInt();
        System.out.println("El numero " + a + " es mayor a " + b + "? = " + (a > b));
        System.out.println("El numero " + a + " es distinto a " + b + "? = " + (a != b));
        System.out.println("El numero " + a + " es divisible por 2? = " + (a % 2 == 0));
        System.out.print("Ingrese otro numero entero: ");
        int c = scanner.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int d = scanner.nextInt();
        System.out.println("El numero " + a + " es mayor a" + b + "y el numero " + c + " es mayor al numero " + d + "? " + (a > b && c > d));
        System.out.println("El numero " + a + " es mayor a" + b + "y el numero " + c + " es mayor al numero " + d + "? " + (a > b || c > d));


    }
}
