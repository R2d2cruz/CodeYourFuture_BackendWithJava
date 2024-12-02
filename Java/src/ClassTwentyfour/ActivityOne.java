package ClassTwentyfour;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * 
 * 1. Crea una carpeta llamada modelos donde crearas todas tus clases personalizadas.
 * 
 * 2. Dentro de la carpeta, crea una clase llamada Rectangulo.
 * 
 * 3. Define 2 atributos para la clase del tipo private: ancho y alto. Pueden ser números decimales o enteros.
 * 
 * 4. Diseña  2 constructores, uno con todos los parámetros y otro sin parámetros.
 * 
 * 5. Crea los métodos getter y setter de todos los atributos de la clase. 
 * 
 * 6. Implementa un método llamado 'area()' y otro método llamado 'perimetro()', 
 *    responsables de calcular el área y el perímetro del rectángulo, respectivamente.
 * 
 * 7. Implementa un método para imprimir los datos de dicha figura.
 * 
 * 8. Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' 
 *    y acceder a sus métodos para obtener información relevante.
 * 
 * 9. En la misma carpeta modelos, crea una nueva  clase llamada Triangulo. 
 *    Define los atributos necesarios para calcular el área de la figura geométrica. 
 *    Implementa los modificadores de acceso adecuados para estos atributos y crea getters y setters según sea necesario. 
 *    Además, desarrolla el método para calcular el área del triángulo. Implementa un método para imprimir los datos de dicha figura. 
 *    Asegúrate de especificar los parámetros necesarios y el tipo de retorno de estos métodos.
 * 
 * 10. En la misma carpeta modelos, crea una nueva  clase llamada Circulo. 
 *     Define los atributos necesarios para calcular el área y el perímetro de la figura geométrica. 
 *     Implementa los modificadores de acceso adecuados para estos atributos y crea getters y setters según sea necesario. 
 *     Además, desarrolla métodos para calcular el área y el perímetro del círculo. 
 *     Asegúrate de especificar los parámetros necesarios y el tipo de retorno de estos métodos.
 * 
 * 11. Genera un menú para que el usuario pueda seleccionar la figura geométrica que desea crear, 
 *     ingresar los datos necesarios para la misma, y obtener en consola los datos de dicha figura. 
 */

import ClassTwentyfour.models.*;
import Utils.TerminalFunctions;
import java.util.Arrays;

public class ActivityOne {
    private static Figure[] figures = new Figure[0];

    public static void main(String[] args) {
        TerminalFunctions.init();
        int option;

        System.out.print("Bienvenido.");
        TerminalFunctions.sleep(500);
        System.out.print(".");
        TerminalFunctions.sleep(500);
        System.out.println(".");
        TerminalFunctions.sleep(500);
        do {
            TerminalFunctions.clearTerminal();
            menu();
            option = TerminalFunctions.inputInt("Elija una opcion: ");
            switch (option) {
                case 1 -> createFigure();
                case 2 -> {
                    showFigures();
                    TerminalFunctions.waitEnter();
                }
                case 3 -> viewFigure();
                case 0 -> System.out.println("Tenga buen dia...");

                default -> System.out.println("Opcion no valida");
            }
        } while (option != 0);

        TerminalFunctions.close();
    }

    private static void addRectangle() {
        figures = Arrays.copyOf(figures, figures.length + 1);
        double width = TerminalFunctions.inputPositiveDouble("Ingrese ancho del rectangulo: ");
        double height = TerminalFunctions.inputPositiveDouble("Ingrese alto del rectangulo: ");
        if (width == 0 || height == 0) {
            figures[figures.length - 1] = new Rectangle(Math.max(width, height));
        } else {
            figures[figures.length - 1] = new Rectangle(width, height);
        }
        System.out.print("Creando rectangulo.");
        TerminalFunctions.sleep(500);
        System.out.print(".");
        TerminalFunctions.sleep(500);
        System.out.println(".");
        TerminalFunctions.sleep(500);

        System.out.println("Rectangulo creado...");
    }

    private static void addCircle() {
        figures = Arrays.copyOf(figures, figures.length + 1);
        double radius = TerminalFunctions.inputPositiveDouble("Ingrese radio del circulo: ");
        figures[figures.length - 1] = new Circle(radius);
        System.out.print("Creando circulo.");
        TerminalFunctions.sleep(500);
        System.out.print(".");
        TerminalFunctions.sleep(500);
        System.out.println(".");
        TerminalFunctions.sleep(500);

        System.out.println("Circulo creado...");
    }

    private static void createFigure() {
        int option;
        System.out.println("""
                Figuras disponibles:
                1. Rectangulo
                2. Circulo
                0. Ninguno
                """);
        option = TerminalFunctions.inputInt(2, "Escoja una figura: ");
        switch (option) {
            case 1 -> addRectangle();
            case 2 -> addCircle();
            case 0 -> System.out.println("Volviendo al menu principal...");

            default -> System.out.println("Figura no disponible...");
        }
        TerminalFunctions.waitEnter();
    }

    private static void showFigures() {
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }

    private static void viewFigure() {
        showFigures();
        int option = TerminalFunctions.inputInt(figures.length - 1, "Ingrese el id de la figura que desea: ");

        if (option < figures.length) {
            System.out.println(figures[option].information());
        } else {
            System.out.println("Figura no existente...");
        }
        TerminalFunctions.waitEnter();
    }

    private static void menu() {
        System.out.println("""
                Menu:
                1. Crear figura
                2. Ver listado de figuras
                3. Ver una figura
                0. Salir
                """);
    }
}
