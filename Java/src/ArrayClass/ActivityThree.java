package ArrayClass;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * Escribe un programa en el cual se cree una variable de tipo array que 
 * contenga cinco elementos de tipo entero, ingresados por el usuario. 
 * El programa debe buscar el máximo e imprimir por consola el resultado 
 * utilizando solamente las herramientas adquiridas hasta el momento.
 */

public class ActivityThree {
    public static void maxValue() {
        int[] nums = new int[5];
        int max;

        nums[0] = TerminalFunctions.inputInt("Ingrese numero 1: ");
        nums[1] = TerminalFunctions.inputInt("Ingrese numero 2: ");
        nums[2] = TerminalFunctions.inputInt("Ingrese numero 3: ");
        nums[3] = TerminalFunctions.inputInt("Ingrese numero 4: ");
        nums[4] = TerminalFunctions.inputInt("Ingrese numero 5: ");

        max = nums[0] >= nums[1] ? nums[0] : nums[1];
        max = max >= nums[2] ? max : nums[2];
        max = max >= nums[3] ? max : nums[3];
        max = max >= nums[4] ? max : nums[4];

        System.out.println("El valor maximo es: " + max);
    }
}
