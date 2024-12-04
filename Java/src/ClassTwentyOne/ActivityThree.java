package ClassTwentyOne;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Crea un método llamado "esPrimo()" que reciba por parámetro un "int" 
 * y devuelva un valor booleano que verifique si el número es primo o no. 
 * Luego, intenta modificar la lógica para resolverlo utilizando recursividad.
 */

import java.util.Scanner;

public class ActivityThree {
    public static void primos() {

        try (Scanner scanner = new Scanner(System.in)) {
            int num;
            boolean esPrimo;

            do {
                esPrimo = true;
                System.out.println("Introduce un número para verificar si es primo (0 para salir)");
                num = scanner.nextInt();

                if (esPrimo(num) && num > 1) {
                    System.out.println("Es primo.");
                } else {
                    System.out.println("No es primo.");
                }

                if (esPrimoRecursivo(num) && num > 1) {
                    System.out.println("Es primo (Recursivo).");
                } else {
                    System.out.println("No es primo (Recursivo).");
                }

            } while (!esPrimo || num != 0);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero % 2 == 0) {
            return numero == 2;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean esPrimoRecursivo(int numero) {

        if (numero % 2 == 0) {
            return numero == 2;
        }
        return esPrimoRecursivo(numero,
                ((int) Math.sqrt(numero)) % 2 == 0 ? (int) Math.sqrt(numero) + 1 : (int) Math.sqrt(numero));
    }

    public static boolean esPrimoRecursivo(int numero, int divisor) {
        if (divisor < 3) {
            return true;
        }
        return numero % divisor != 0 && esPrimoRecursivo(numero, divisor - 2);
    }
}
