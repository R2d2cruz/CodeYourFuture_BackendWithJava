package ArrayClass;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementThree} class contain method related to the activity:
 * El programa debe crear un array de tamaño 3 que almacene números enteros. 
 * Luego, solicita un número al usuario y muestra por consola si ese número 
 * está presente en el array o no. 
 * Es importante utilizar únicamente las herramientas aprendidas hasta el momento, 
 * sin emplear bucles en el proceso.
 */

public class ActivityFour {
    public static void arrayInts(){
        int[] arrayInt = new int[3];
        arrayInt[0] = TerminalFunctions.inputInt("Ingrese primer numero: ");
        arrayInt[1] = TerminalFunctions.inputInt("Ingrese segundo numero: ");
        arrayInt[2] = TerminalFunctions.inputInt("Ingrese tercer numero: ");

        System.out.println("[" + arrayInt[0] + ", " + arrayInt[1] + ", " + arrayInt[2] + "]");
        
    }
}
