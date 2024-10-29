package ClassFifteen;

import Utils.TerminalFunctions;
import java.util.Arrays;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. 
 * Estas calificaciones se almacenarán en un arreglo de Strings.
 * 
 * Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, 
 * separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). 
 * Necesitarás convertir los String a double para lograrlo.
 * 
 * Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.
 * 
 * Por último, imprimiré los resultados en consola.
 */

public class ActivityTwo {
    public static void rating() {
        int nScores = TerminalFunctions.inputInt("Ingrese cantidad de calificaciones: ");

        String[] scores = new String[nScores];

        for (int i = 0; i < nScores; i++) {
            scores[i] = String.valueOf((int) (Math.random() * 11));
        }

        double[] reprobate = new double[0];
        double[] approved = new double[0];
        double[] excelent = new double[0];

        double scoreDouble;
        for (String score : scores) {
            scoreDouble = Double.parseDouble(score);
            if (scoreDouble < 4) {
                reprobate = Arrays.copyOf(reprobate, reprobate.length + 1);
                reprobate[reprobate.length - 1] = scoreDouble;
            } else if (scoreDouble < 10) {
                approved = Arrays.copyOf(approved, approved.length + 1);
                approved[approved.length - 1] = scoreDouble;
            } else {
                excelent = Arrays.copyOf(excelent, excelent.length + 1);
                excelent[excelent.length - 1] = scoreDouble;
            }
        }

        double aveApproved = 0;
        double aveReprobate = 0;
        double aveExcelent = 0;
        double average = 0;


        for (String score : scores) {
            average += Double.parseDouble(score);
        }

        average /= nScores;

        for (double d : reprobate) {
            aveReprobate += d;
        }

        aveReprobate /= reprobate.length;

        for (double d : approved) {
            aveApproved += d;
        }

        aveApproved /= approved.length;

        for (double d : excelent) {
            aveExcelent += d;
        }

        aveExcelent /= excelent.length;

        System.out.println("Notas: " + Arrays.toString(scores));
        System.out.println("Promedio: " + average);
        System.out.println("Reprobados: " + Arrays.toString(reprobate));
        System.out.println("Promedio: " + aveReprobate);
        System.out.println("Aprobados: " + Arrays.toString(approved));
        System.out.println("Promedio: " + aveApproved);
        System.out.println("Excelente: " + Arrays.toString(excelent));
        System.out.println("Promedio: " + aveExcelent);
    }
}
