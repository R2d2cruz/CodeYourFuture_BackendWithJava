package ClassFive;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityFour} class contain method related to the activity:
 * Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un número 
 * del 1 al 3 para seleccionar una figura geométrica: 1 para círculo, 2 para cuadrado y 3 para triángulo. 
 * Después, solicitará al usuario los datos necesarios para calcular el área de la figura seleccionada. 
 * Estos datos serán:
 * 
 * 1. Para el círculo: el radio.
 * 
 * 2. Para el cuadrado: el lado.
 * 
 * 3.Para el triángulo: la base y la altura.
 * 
 * Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada.
 */

public class ActivityFour {
    public static void figuresAreas() {
        System.out.println("Figuras:");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        int figure = TerminalFunctions.inputInt(1, 3, "Elija la figura que desea calcular el area: ");
        double area = 0;

        switch (figure) {
            case 1 -> {
                double r = TerminalFunctions.inputDouble("Ingrese el radio del circulo: ");
                area = Math.PI * Math.pow(r, 2);
            }
            case 2 -> {
                double side = TerminalFunctions.inputDouble("Ingrese el lado del cuadrado: ");
                area = Math.pow(side, 2);
            }
            case 3 -> {
                double base = TerminalFunctions.inputDouble("Ingrese base del triangulo: ");
                double height = TerminalFunctions.inputDouble("Ingrese altura del triangulo: ");
                area = base * height / 2;
            }
            default -> System.out.println("How did we get here?");
        }

        System.out.println("El area de la figura es " + area + " unidades arbitrarias.");
    }
}
