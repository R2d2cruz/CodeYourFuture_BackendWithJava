package ClassFive;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementTwo} class contain method related to the activity:
 * Implementando el uso de la estructura "switch expression", solicita al usuario que elija entre una de las siguientes dos figuras geométricas:
 * 
 * Opción 1: "Circulo"
 * Opción 2: "Rectangulo"
 * 
 * Según la figura seleccionada, deberás solicitar que ingrese los valores necesarios para calcular el área o el perímetro de cada figura:
 * 
 * Para el Círculo: Solicita el valor del radio, ya que PI es una constante.
 * Para el Rectángulo: Solicita el valor de la base y de la altura.
 * 
 * Dentro de la opción elegida, permite al usuario seleccionar si desea conocer el área o el perímetro de dicha figura.
 * Realiza los cálculos necesarios y muestra el resultado por consola junto con un mensaje adecuado.
 */

public class ComplementTwo {
    public static void areaPer() {
        System.out.println("Las figuras geometricas disponibles son: ");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        int figure = TerminalFunctions.inputInt(1, 2, "Escoja una opcion: ");
        double area = 0;
        double perimeter = 0;
        String figureString = "punto";

        switch (figure) {
            case 1 -> {
                double r = TerminalFunctions.inputDouble("Ingrese el radio del circulo: ");
                area = Math.PI * Math.pow(r, 2);
                perimeter = 2 * Math.PI * r;
                figureString = "circulo";
            }
            case 2 -> {
                double base = TerminalFunctions.inputDouble("Ingrese base del rectangulo: ");
                double height = TerminalFunctions.inputDouble("Ingrese altura del rectangulo: ");
                area = base * height;
                perimeter = (2 * base) + (2 * height);
                figureString = "rectangulo";
            }
            default -> System.out.println("How did we get here?");
        }

        System.out.println("El area del " + figureString + " es " + area + " unidades arbitrarias^2");
        System.out.println("El perimetro del " + figureString + " es " + perimeter + " unidades arbitrarias");
    }
}
