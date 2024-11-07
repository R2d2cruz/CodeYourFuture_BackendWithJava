package ClassSeventeen;

import Utils.TerminalFunctions;
import java.util.Arrays;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa en Java que permita al usuario realizar diversas operaciones con una oración. El programa debe cumplir con los siguientes requisitos:
 * 1. Muestra un menú de opciones al usuario donde podrá:
 * 
 * - Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".
 * - Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).
 * - Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.
 * - Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas alfabéticamente.
 * - Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".
 * - Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.
 * - Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).
 * - Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.
 * - Salir: Terminar el programa.
 * 
 * 2. Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".
 * 
 * 3. Realiza las validaciones que consideres necesarias.
 */

public class ActivityOne {
    public static void controlSentences() {
        int option, i;
        String sentence = "", palabra, palabra2;
        String[] aux, palabras = {};
        boolean vbool;

        do {
            TerminalFunctions.clearTerminal();
            System.out.println("Menú de opciones");

            System.out.println("1. " + (sentence.isEmpty() ? "Crear oración" : "Borrar oración"));
            System.out.println("2. Cantidad de caracteres");
            System.out.println("3. Cantidad de palabras");
            System.out.println("4. Ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra");
            System.out.println("7. Modificar palabra");
            System.out.println("8. Agregar contenido");
            System.out.println("9. Salir");
            option = TerminalFunctions.inputInt("Seleccione una opción: ");
            switch (option) {
                case 1 -> {
                    if (sentence.isEmpty()) {
                        sentence = TerminalFunctions.inputString("Crear una oracion: ").trim();
                        palabras = sentence.split(" ");
                    } else {
                        System.out.println("Borrando oración");
                        sentence = "";
                    }
                }
                case 2 -> System.out.println("La cantidad de caracteres es:" + sentence.length());
                case 3 -> System.out.println("La cantidad de palabras es:" + palabras.length);
                case 4 -> {
                    aux = sentence.split(" ");
                    Arrays.sort(aux);
                    System.out.println("Palabras desc:" + Arrays.toString(aux));
                }
                case 5 -> {
                    i = TerminalFunctions.inputInt("Ingrese un numero") - 1;
                    if (i < palabras.length) {
                        palabra = palabras[i];
                        System.out.println("La palabra en la posición " + (i + 1) + " es " + palabra);
                    } else {
                        System.out.println("Número inválido. Intente nuevamente.");
                    }
                }
                case 6 -> {
                    palabra = TerminalFunctions.inputString("Ingrese una palabra a buscas:").toLowerCase();
                    for (i = 0; i < palabras.length; i++) {
                        if (palabras[i].toLowerCase().contains(palabra)) {
                            System.out.println("La palabra es:" + palabras[i] + " y la posicion es:" + (i + 1));
                            break;
                        }
                    }
                    if (i == palabras.length) {
                        System.out.println("No esta tu palabra solly");
                    }
                }
                case 7 -> {
                    do {
                        palabra = TerminalFunctions.inputString("Ingrese una palabra a modificar:").toLowerCase();
                        vbool = sentence.contains(palabra);
                        if (vbool) {
                            palabra2 = TerminalFunctions.inputString("Ingresa la nueva palabra a modificar");
                            sentence = sentence.replaceFirst(palabra, palabra2);
                        }
                    } while (!vbool);
                    System.out.println("La nueva oracion:" + sentence);
                }
                case 8 -> {
                    palabra = TerminalFunctions.inputString("Ingrese nuevo contenido a la oración: ");
                    sentence = sentence.concat(" ").concat(palabra).trim();
                    System.out.println("nueva oracion:" + sentence);
                }
                case 9 -> System.out.println("chaitos chaitos");
                default -> option = 10;
            }
        } while (option != 9);
    }
}