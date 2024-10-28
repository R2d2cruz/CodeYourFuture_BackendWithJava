package ClassFive;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, 
 * representando un día de la semana. El programa determinará si ese día es hábil o no. 
 * Se mostrará el resultado en pantalla. Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). 
 * Utilizaremos la estructura "switch" para implementar este programa. 
 * ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).)
 */

public class ComplementOne {
    public static void workingDay() {
        int numDay = TerminalFunctions.inputInt(1, 7,
                "Ingrese un numero del 1 al 7, correspondiendo al dia de la semana: ");

        switch (numDay) {
            case 1, 2, 3, 4, 5 -> System.out.println("El dia es habil");
            case 6, 7 -> System.out.println("El dia no es habil");
            default -> System.out.println("Este Número no corresponde a un día");
        }

    }
}
