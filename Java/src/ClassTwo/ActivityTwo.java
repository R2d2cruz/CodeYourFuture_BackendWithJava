package ClassTwo;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * 1. Declara dos variables, y asígnales un valor a cada una de ellas.
 * 2. Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. 
 *    Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, 
 *    Ej: La suma de las 2 variables es : “[resultado]”;
 * 3. Posteriormente, pide al usuario que ingrese dos números, 
 *    guardarlos en variables previamente declaradas, 
 *    realiza la suma de los números y muestra el resultado en la consola.
 */

public class ActivityTwo {
    public static void calculator(){
        double a = TerminalFunctions.inputDouble("Ingrese a: ");
        double b = TerminalFunctions.inputDouble("Ingrese b: ");
        System.out.println("1. a + b");
        System.out.println("2. a - b");
        System.out.println("3. a * b");
        System.out.println("4. a / b");
        System.out.println("5. a % b");
        // Debido a que lo importante es realizar operaciones, dejamos al usuario elegir la operacion a realizar
        int operation = TerminalFunctions.inputInt("Ingrese operacion que desea realizar: ");
        switch (operation) {
            case 1 -> System.out.println(a + " + " + b + " = " + (a + b));
            case 2 -> System.out.println(a + " - " + b + " = " + (a - b));
            case 3 -> System.out.println(a + " * " + b + " = " + (a * b));
            case 4 -> System.out.println(a + " / " + b + " = " + (a / b));
            case 5 -> System.out.println(a + " % " + b + " = " + (a % b));
            default -> System.out.println("Operacion no valida");
        }
    }
}
