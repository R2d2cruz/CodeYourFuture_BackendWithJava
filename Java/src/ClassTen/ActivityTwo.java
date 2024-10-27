package ClassTen;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * Escribe un programa en el cual se cree una variable de tipo array que 
 * contenga cuatro elementos de tipo entero. Estos elementos deben ser 
 * ingresados por el usuario. El programa debe sumar y promediar los cuatro 
 * elementos de forma manual e imprimir por consola el resultado, utilizando 
 * solamente las herramientas adquiridas hasta el momento.
 */

public class ActivityTwo {
    public static void average() {
        int[] nums = new int[4];
        nums[0] = TerminalFunctions.inputInt("Ingrese numero 1: ");
        nums[1] = TerminalFunctions.inputInt("Ingrese numero 2: ");
        nums[2] = TerminalFunctions.inputInt("Ingrese numero 3: ");
        nums[3] = TerminalFunctions.inputInt("Ingrese numero 4: ");
        double prom = (nums[0] + nums[1] + nums[2] + nums[3]) / 4;
        System.out.println("El promedio es " + prom);
    }
}
