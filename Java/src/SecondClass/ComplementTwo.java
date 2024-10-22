package SecondClass;

import java.util.Scanner;

/*
 * The {@code ComplementTwo} class contain method related to the activity:
 * 1. Pide al usuario que ingrese el valor de la base y de la altura de un rectángulo.
 * 2. Almacena estos valores en variables previamente declaradas llamadas baseRectangulo y alturaRectangulo, respectivamente.
 * 3. Calcula y almacena el perímetro del rectángulo utilizando la fórmula: Perímetro = 2 × base + 2 × altura.
 * 4. Muestra el resultado del perímetro por consola junto con un mensaje adecuado.
 * 5. Calcula y almacena el área del rectángulo utilizando la fórmula: Área = base × altura.
 * 6. Muestra el resultado del área por consola junto con un mensaje adecuado.
 */

public class ComplementTwo {
    public static void rectangle(Scanner scanner) {
        double base, altura, perimetro, area;
        System.out.println("Ingrese base:");
        base = scanner.nextDouble();
        System.out.println("Ingrese altura:");
        altura = scanner.nextDouble();

        perimetro = 2 * base + 2 * altura;

        area = base * altura;

        System.out.println("El perimetro es " + perimetro);
        System.out.println("El area es " + area);
    }
}
