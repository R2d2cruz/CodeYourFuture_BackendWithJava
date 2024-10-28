package ClassEight;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementTwo} class contain method related to the activity:
 * Escribe un programa que cumpla con las siguientes condiciones:
 * 
 * 1. Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable llamada numeroLimite .
 * 
 * 2. Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLimite recibido del usuario.
 * 
 * 3. Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número aleatorio generado y muéstralo en pantalla.
 * 
 * 4. Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla indicando si lo es o no.
 * 
 * 5. Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla.
 */

public class ComplementTwo {
    public static void primeNumber() {
        int limit = TerminalFunctions.inputInt(1, 30, "Ingrese un numero entre 1 y 30: ");

        int num = (int) Math.floor(Math.random() * limit + 1);

        double sqrt = Math.sqrt(num);

        boolean isPrime = (num == 2 || num == 3 || num == 5 || (num % 2 != 0 && num % 3 != 0 && num % 5 != 0)) && (num != 1);

        System.out.println("El numero que obtuvo fue " + num + ", su raiz cuadrada es " + sqrt + " y " + (isPrime ? "es primo": "no es primo"));
    }
}
