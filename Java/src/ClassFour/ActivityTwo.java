package ClassFour;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. 
 * Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:
 * 
 * 1. Si la puntuación está entre 90 y 100, se mostrará "A".
 * 2. Si la puntuación está entre 80 y 89, se mostrará "B".
 * 3. Si la puntuación está entre 70 y 79, se mostrará "C".
 * 4. Si la puntuación está entre 60 y 69, se mostrará "D".
 * 5. Si la puntuación es menor a 60, se mostrará "F".
 * 6. Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.
 * 
 * El programa mostrará en la consola el valor de la calificación obtenida.
 */

public class ActivityTwo {
    public static void rating(){
        int score = TerminalFunctions.inputInt( 100,"Ingrese calificacion (0-100): ");
        char alfScore = 'E';

        if (score < 60) {
            alfScore = 'F';
        } else if (score < 70) {
            alfScore = 'D';            
        } else if (score < 80) {
            alfScore = 'C';            
        } else if (score < 90) {
            alfScore = 'B';            
        } else if (score <= 100) {
            alfScore = 'A';            
        }

        System.out.println("La calificacion corresponde a una " + alfScore);
    }
}
