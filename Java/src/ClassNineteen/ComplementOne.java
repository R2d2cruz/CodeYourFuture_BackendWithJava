package ClassNineteen;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número (incluida la lógica en un método llamado pedirNumero())  
 * y luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()). 
 * Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la tabla de multiplicar correspondiente.
 */

import java.util.Scanner;

public class ComplementOne {
    public static Scanner scanner = new Scanner(System.in);

    public static void tablaDeMultiplicar() {
        System.out.println("\033\143"); // Limpia la consola
        imprimirTablaMultiplicar(pedirNumero());
    }

    public static int pedirNumero() {
        System.out.println("Indica un número a multiplicar");
        int num = scanner.nextInt();
        scanner.nextLine();

        return num;
    }

    public static void imprimirTablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }
}
