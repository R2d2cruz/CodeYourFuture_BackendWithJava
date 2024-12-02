package ClassTwentyfour;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * 
 * 1. Crea una clase llamada  'Punto' que representa un punto en un plano bidimensional.
 * 
 * 2. Define 2 atributos para la clase del tipo private: x e y que representan las coordenadas del punto.
 * 
 * 3. Crea los métodos getter y setter de todos los atributos de la clase. 
 * 
 * 4. Crea un método de instancia llamado 'distanciaDesdeOrigen', 
 *    que calcula y devuelve la distancia del punto desde el origen (0,0).
 * 
 * 5. Crea un método para cálculos entre puntos, estático, llamado 'calcularDistancia' en la clase 'Punto'. 
 *    Este método recibe dos objetos de la misma clase y calcula la distancia entre ellos.
 * 
 * 6. Crea un método estático para cálculos entre puntos, llamado 'estanAlineados' en la clase 'Punto'. 
 *    Este método recibe tres objetos de la clase 'Punto' y determina si los puntos dados están alineados en la misma recta
 * 
 * 7. En la clase ejecutable, declara una variable global como un arreglo de objetos 'Punto' para almacenar las instancias creadas."
 */

import ClassTwentyfour.models.Point;
import java.util.Arrays;

public class ActivityTwo {
    private static Point[] points = new Point[0];
    private static final int MID = 10;
    private static final int SIDE = MID * 2 + 1;
    private static final char[][] screen = new char[SIDE][SIDE];

    public static void main(String[] args) {
        theGrid();
    }

    public static void createPoints(){
        for (int i = 0; i < 9; i++) {
            addPoint((int) (Math.random() * SIDE - MID), (int) (Math.random() * SIDE - MID));
        }
    }

    public static void printStatues(){
        for (Point point : points) {
            System.out.println(point);
        }
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    if (Point.areAlign(points[i], points[j], points[k])) {
                        System.out.printf("Los puntos %d, %d, %d estan alineados\n", i, j, k);
                    }
                }
            }
        }
    }

    public static void theGrid() {
        createPoints();
        fillScreen();
        printScreen();
        printStatues();
    }

    public static void addPoint(Point point) {
        int n = points.length;
        points = Arrays.copyOf(points, n + 1);
        points[n] = point;
    }

    public static void addPoint(int x, int y) {
        addPoint(new Point(x, y));
    }

    public static void fillScreen() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (i == MID || j == MID) {
                    if (i == MID) {
                        if (j == MID) {
                            screen[i][j] = '\u253C';
                        } else {
                            screen[i][j] = '\u2500';
                        }
                    } else {
                        screen[i][j] = '\u2502';
                    }
                } else {
                    screen[i][j] = ' ';
                }
            }
        }
        for (Point point : points) {
            screen[MID + point.getY()][MID + point.getX()] = point.getdraw();
        }
    }

    public static void printScreen() {
        System.out.println("\u2554" + ("\u2550".repeat(MID * 3 + 1))
                + "\u2564" + ("\u2550".repeat(MID * 3 + 1))
                + "\u2557");

        for (char[] line : screen) {
            System.out.print("\u2551");
            for (char pixel : line) {
                if ("0123456789".indexOf(pixel) >= 0 || pixel == '\u2502') {
                    System.out.print(" " + pixel + " ");
                } else {
                    if (pixel == '\u253C') {
                        System.out.print("\u2500" + pixel + "\u2500");
                    } else {
                        System.out.print(("" + pixel).repeat(3));
                    }
                }
            }
            System.out.println("\u2551");
        }

        System.out.println("\u255A" + ("\u2550".repeat(MID * 3 + 1))
                + "\u2567" + ("\u2550".repeat(MID * 3 + 1))
                + "\u255D");
    }
}