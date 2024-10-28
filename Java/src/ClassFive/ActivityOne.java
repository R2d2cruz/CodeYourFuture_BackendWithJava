package ClassFive;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, 
 * que representará un día de la semana. 
 * Luego, el programa mostrará en pantalla el nombre correspondiente a ese día. 
 * Utilizaremos la estructura "switch" para implementar este programa.
 */

public class ActivityOne {
    public static void weekDay() {
        int numDay = TerminalFunctions.inputInt("Ingrese un numero del 1 al 7: ");

        switch (numDay) {
            case 1 -> System.out.println("Este número corresponde al día lunes");
            case 2 -> System.out.println("Este número corresponde al día martes");
            case 3 -> System.out.println("Este número corresponde al día miércoles");
            case 4 -> System.out.println("Este número corresponde al día jueves");
            case 5 -> System.out.println("Este número corresponde al día viernes");
            case 6 -> System.out.println("Este número corresponde al día sábado");
            case 7 -> System.out.println("Este número corresponde al día domingo");
            default -> System.out.println("Este Número no corresponde a un día");
        }
        
    }
}
