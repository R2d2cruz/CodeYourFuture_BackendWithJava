package ClassSixteen;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Realiza un programa para crear un cuadrado de N elementos por lado utilizando el carácter “*”.
 * 
 * Para ello  simplemente dibuja una línea de N asteriscos. Repite este proceso N veces para completar el cuadrado. 
 */

public class ActivityFour {
    public static void printSquare() {
        int side = TerminalFunctions.inputInt("Ingrese lado del cuadrado: ");
        int side1 = side - 1;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side1 || j == 0 || j == side1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
