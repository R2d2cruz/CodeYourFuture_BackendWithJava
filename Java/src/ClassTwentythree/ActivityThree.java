package ClassTwentythree;

/*
 * The {@code ActivityThree} class contain method related to the activity:
 * 
 * 1. Crea una clase llamada Rectangulo
 * 
 * 2. Define 2 atributos para la clase: ancho y alto. Pueden ser números decimales o enteros.
 * 
 * 3. Define un atributo de tipo entero, 'contadorRectangulos', 
 *    que sea estático y que lleve un registro del número total de instancias de 'Rectangulo' creadas.
 * 
 * 4. Diseña un constructor con argumentos que inicialice los valores del 'ancho' y 'alto', 
 *    y que incremente en uno el valor de 'contadorRectangulos'. 
 * 
 * 5. Implementa un método llamado 'area()' y otro método llamado 'perimetro()', 
 *    responsables de calcular el área y el perímetro del rectángulo, respectivamente.
 * 
 * 6. Implementa un método llamado imprimirArea para mostrar el resultado por consola;
 * 
 * 7. Implementa un método llamado imprimirPerimetro para mostrar el resultado por consola;
 * 
 * 8. Implementa un método estático que permita obtener el número total de rectángulos creados hasta el momento.
 * 
 * 9. Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' 
 *    y acceder a sus métodos para obtener información relevante.
 */

import Utils.TerminalFunctions;
import java.util.Arrays;

public class ActivityThree {
    private static Rectangle[] rectangles = new Rectangle[0];

    public static void main(String[] args) {
        TerminalFunctions.init();
        rectangleCreator();
        TerminalFunctions.close();
    }

    public static void rectangleCreator() {
        int option;

        do {
            option = menu();
            switch (option) {
                case 1 -> showRectangles();
                case 2 -> addRectangle();
                case 3 -> selectRectangle();
                case 0 -> {
                    System.out.println("Saliendo...");
                    TerminalFunctions.sleep(500);
                    System.out.println("Adios...");
                }
                default -> throw new AssertionError();
            }
            TerminalFunctions.waitEnter();
        } while (option != 0);
    }

    private static int menu() {
        TerminalFunctions.clearTerminal();
        System.out.println("""
                Menu de opciones:
                1- Ver rectangulos
                2- Crear rectangulo
                3- Examinar rectangulo
                0- Salir
                """);
        return TerminalFunctions.inputInt(3, "Elija una opcion: ");
    }

    private static void showRectangles(){
        System.out.println("\n\n" + "=".repeat(20));
        if (rectangles.length > 0) {
            for (Rectangle rectangle : rectangles) {
                rectangle.printMySelf();
            }
            
        } else {
            System.out.println("Lista vacia...");
        }
        System.out.println("=".repeat(20));
    }

    private static void addRectangle(){
        rectangles = Arrays.copyOf(rectangles, rectangles.length + 1);
        rectangles[rectangles.length - 1] = new Rectangle(TerminalFunctions.inputNatural("Ingrese ancho del rectangulo: "), TerminalFunctions.inputNatural("Ingrese alto del rectangulo: "));
    }

    private static void selectRectangle(){
        showRectangles();
        int id = TerminalFunctions.inputInt(Rectangle.getCountRectangle(), "Ingrese el id del rectangulo que desea revisar: ");
        TerminalFunctions.clearTerminal();
        rectangles[id].draw();
        System.out.println("\n");
        rectangles[id].printMySelf();
        rectangles[id].printArea();
        rectangles[id].printPerimeter();
        
    }
}
