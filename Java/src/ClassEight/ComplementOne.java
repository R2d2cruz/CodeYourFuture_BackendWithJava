package ClassEight;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * Escribe un programa que pida al usuario ingresar dos números enteros: un límite inferior y un límite superior. 
 * Luego, utiliza el método random() de la clase Math para generar 
 * y mostrar en pantalla un número aleatorio dentro del rango especificado por los límites ingresados.
 */

public class ComplementOne {
    public static void randomRange() {
        int bottom = TerminalFunctions.inputInt("Ingrese un limite entero inferior: ");
        int top = TerminalFunctions.inputInt("Ingrese un limite entero superior: ");

        int randNum = (int) (Math.random() * (top - bottom + 1) + bottom);

        System.out.println("El numero aleatorio es " + randNum);
    }
}
