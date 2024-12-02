package ClassTwentyfour;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * 
 * 1. La clase "Libro" debe tener tres atributos privados: "titulo", "autor" y "paginas".
 * 
 * 2. Debes proporcionar métodos públicos para establecer y obtener el título y el autor.
 * 
 * 3. Crea un método para establecer el número de páginas, 
 *    teniendo en cuenta que este número surge del cálculo entre un número ingresado por el usuario multiplicado por 7. 
 *    Ej: Si el usuario ingresa 20, la cantidad de páginas que tendrá ese libro es 140 (7*20).
 * 
 * 4. Además, la clase debe tener un método público llamado "imprimirDetalles" que imprime por consola todos los detalles del libro, 
 *    incluyendo el título, el autor y el número de páginas.
 * 
 * 5. Almacena cada instancia creada  de Libro en un array.
 * 
 * 6. Crea un método para imprimir TODOS los libros disponibles (solo su título).
 */

import ClassTwentyfour.models.Book;
import Utils.TerminalFunctions;
import java.util.Arrays;

public class ComplementOne {
    private static Book[] books = new Book[0];

    public static void main(String[] args) {
        TerminalFunctions.init();
        library();
        TerminalFunctions.close();
    }

    public static void library() {
        int option;
        System.out.println("Bienvenido a la biblioteca Golden Oak");
        TerminalFunctions.waitEnter();
        do {
            TerminalFunctions.clearTerminal();
            menu();
            option = TerminalFunctions.inputInt(3, "Que deseas hacer? ", "Perdon, no puedo hacer eso");
            switch (option) {
                case 1 -> addBook();
                case 2 -> showInventary();
                case 3 -> showBook();
                case 0 -> System.out.println(
                            "Espero que tu estadia en la biblioteca Golden Oak haya sido agradable, ten un buen dia...");
                default -> {
                }
            }
            TerminalFunctions.waitEnter();
        } while (option != 0);
    }

    private static void addBook() {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = new Book(TerminalFunctions.inputString("Ingresa el titulo del libro: "),
                TerminalFunctions.inputString("Ingresa el autor del libro: "),
                TerminalFunctions.inputNatural("Ingresa el numero de paginas: "));
    }

    private static void showInventary() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void showBook(){
        showInventary();
        int bookId = TerminalFunctions.inputInt(books.length - 1, "Ingresa el id del libro que deseas: ", "Lo siento, creo que no tengo ese libro, prueba otro...");
        if (bookId < books.length) {
            books[bookId].printDetails();
        } else {
            System.out.println("Id no corresponde a ningun libro");
        }
    }

    private static void menu() {
        System.out.println("""
                Menu:
                1. Añadir un libro
                2. Revisar inventario
                3. Revisar un libro
                0. Salir
                """);
    }
}
