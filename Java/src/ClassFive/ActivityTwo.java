package ClassFive;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * En esta actividad, desarrollarás un programa que solicitará al usuario ingresar una calificación numérica del 1 al 5. 
 * Luego, mostrará en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:
 * 
 * 1: "Muy deficiente"
 * 2: "Deficiente"
 * 3: "Suficiente"
 * 4: "Notable"
 * 5: "Sobresaliente"
 */

public class ActivityTwo {
    public static void rating() {
        int score = TerminalFunctions.inputInt(5, "Ingrese una calificacion del 1 al 5: ");

        System.out.print("Su desempeño fue ");

        switch (score) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");

            default -> System.out.println("... hum.... creo que no podemos puntuar eso");
        }
    }
}
