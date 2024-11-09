package ClassEighteen;

import Utils.TerminalFunctions;
import java.util.Arrays;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa en Java que permita al usuario llevar un registro de alumnos.
 * 
 * El programa debe cumplir con los siguientes requisitos:
 * 
 * 1. Muestra un menú de opciones al usuario donde podrá:
 * 2. Registrar alumno: Permitir al usuario registrar un nuevo alumno ingresando su nombre y nota. 
 * 💡 Para lograr esto, te recomendamos utilizar un array de tipo String para almacenar los nombres de los alumnos 
 *    y un array de tipo Double para guardar las notas correspondientes. De esta manera, podrás asociar los nombres con las notas utilizando los índices de los arrays
 * a. Mostrar todos los alumnos: Mostrar en pantalla el nombre 
 *    y la nota de todos los alumnos registrados hasta el momento.
 * b. Mostrar promedio de notas: Calcular 
 *    y mostrar en pantalla el promedio de las notas de todos los alumnos registrados hasta el momento.
 * c. Buscar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno 
 *    y mostrar en pantalla su nota si el alumno existe.
 * d. Modificar nota por nombre: Solicitar al usuario ingresar el nombre de un alumno 
 *    y permitir modificar su nota si el alumno existe.
 * e. Eliminar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno 
 *    y eliminar al alumno si existe.
 * f. Salir: Terminar el programa.
 * 
 * 3. El programa debe validar que el nombre no esté vacío y que la nota sea un 
 *    número válido entre 0.00 y 10.00.
 * 
 * 4. El programa debe utilizar las estructuras de control adecuadas (if, switch, for, while, do-while) 
 *    según corresponda para implementar las diferentes opciones del menú.
 * 
 * 5. El programa debe manejar excepciones utilizando bloques try-catch para manejar 
 *    posibles excepciones al leer datos de entrada del usuario.
 * 
 * 6. Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario 
 *    pueda elegir otra acción hasta que elija la opción "Salir".
 */



public class ActivityOne {
    public static void schoolScores() {
        String[] nombres = new String[0];
        double[] notas = new double[0];
        String[] auxNombres;
        double[] auxNotas;
        int opcion, i;
        double nota = 0, promedio;
        String nombre = "";
        boolean noValido, encontrado;

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");
            opcion = TerminalFunctions.inputInt("Elige una opción: ");
            

            switch (opcion) {
                case 1 -> {
                    do {
                        try {
                            nombre = TerminalFunctions.inputString("Ingrese nombre del alumno: ").trim();
                            noValido = nombre.isEmpty();
                            if (noValido) {
                                System.out.println("No se permiten valores vacios");
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada no valida");
                            noValido = true;
                        }
                    } while (noValido);
                    do {
                        try {
                            nota = TerminalFunctions.inputDouble("Ingrese la nota: ");
                        noValido = nota > 10 || nota < 1;
                        if (noValido) {
                            System.out.println("Debe ingresar una calificacion entre 1 y diez");
                        }
                        } catch (Exception e) {
                            System.out.println("Entrada no valida");
                            noValido = true;
                        }
                    } while (noValido);
                    nombres = Arrays.copyOf(nombres, nombres.length + 1);
                    nombres[nombres.length - 1] = nombre;
                    notas = Arrays.copyOf(notas, notas.length + 1);
                    notas[notas.length - 1] = nota;
                }
                case 2 -> {
                    if (nombres.length > 0 && nombres.length == notas.length) {
                        for (i = 0; i < notas.length; i++) {
                            System.out.printf("Nombre: %s \t Nota: %.2f%n", nombres[i], notas[i]);
                        }
                    } else {
                        if (notas.length < nombres.length) {
                            System.out.println("La cantidad de notas no corresponde a la cantidad de alumnos.");
                        } else {
                            System.out.println("No existen alumnos registrados.");
                        }
                    }
                }
                case 3 -> {
                    if (notas.length > 0) {
                        promedio = 0;
                        for (double n : notas) {
                            promedio += n;
                        }
                        promedio /= notas.length;
                        System.out.printf("El promedio de notas es %.2f%n", promedio);
                    } else {
                        System.out.println("No hay notas registradas.");
                    }
                }
                case 4 -> {
                    encontrado = false;
                    do {
                        try {
                            nombre = TerminalFunctions.inputString("Ingrese nombre del alumno: ").trim();
                            noValido = nombre.isEmpty();
                            if (noValido) {
                                System.out.println("No se permiten valores vacios");
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada no valida");
                            noValido = true;
                        }
                    } while (noValido);
                    for (i = 0; i < notas.length; i++) {
                        if (nombres[i].toLowerCase().equals(nombre.toLowerCase())) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.printf("El estudiante %s tiene de nota %.2f%n", nombres[i], notas[i]);
                    } else {
                        System.out.println("No existe el estudiante.");
                    }
                }
                case 5 -> {
                    encontrado = false;
                    do {
                        try {
                            nombre = TerminalFunctions.inputString("Ingrese nombre del alumno: ").trim();
                            noValido = nombre.isEmpty();
                            if (noValido) {
                                System.out.println("No se permiten valores vacios");
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada no valida");
                            noValido = true;
                        }
                    } while (noValido);
                    for (i = 0; i < notas.length; i++) {
                        if (nombres[i].toLowerCase().equals(nombre.toLowerCase())) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        do {
                            try {
                                nota = TerminalFunctions.inputDouble("Ingrese la nota: ");
                            noValido = nota > 10 || nota < 1;
                            if (noValido) {
                                System.out.println("Debe ingresar una calificacion entre 1 y diez");
                            }
                            } catch (Exception e) {
                                System.out.println("Entrada no valida");
                                noValido = true;
                            }
                        } while (noValido);
                        notas[i] = nota;
                        System.out.println("Nota actualizada.");
                    } else {
                        System.out.println("No existe el estudiante.");
                    }
                }
                case 6 -> {
                    encontrado = false;
                    do {
                        try {
                            nombre = TerminalFunctions.inputString("Ingrese nombre del alumno: ").trim();
                            noValido = nombre.isEmpty();
                            if (noValido) {
                                System.out.println("No se permiten valores vacios");
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada no valida");
                            noValido = true;
                        }
                    } while (noValido);
                    for (i = 0; i < notas.length; i++) {
                        if (nombres[i].toLowerCase().equals(nombre.toLowerCase())) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        auxNombres = Arrays.copyOf(nombres, nombres.length - 1);
                        auxNotas = Arrays.copyOf(notas, notas.length - 1);
                        for (int j = i; j < auxNotas.length; j++) {
                            auxNombres[j] = nombres[j + 1];
                            auxNotas[j] = notas[j + 1];
                        }
                        nombres = auxNombres;
                        notas = auxNotas;
                    } else {
                        System.out.println("No existe el estudiante.");
                    }
                }
                case 7 -> System.out.println("Que tenga buen dia :)");
                default -> System.out.println("Opcion no valida.");
            }
            System.out.println("Presione enter para continuar...");
            TerminalFunctions.waitEnter();

        } while (opcion != 7);
    }
}
