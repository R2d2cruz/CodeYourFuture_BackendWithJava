package ClassTwentyfive;

/**
 * This code was create by the entiry class group and its a smallest version of the activity.
 */

import ClassTwentyfive.models.Empleado;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    static Empleado[] empleados = new Empleado[0];
    static Empleado[] empleadosFiltrados = new Empleado[0];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int opc;

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Elija una opción");
            System.out.println("1. Crear empleado");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados ");
            System.out.println("5. Incrementar salario ");
            System.out.println("6. Limpiar filtros");
            System.out.println("7. Salir");
            opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
                case 1 -> {
                    System.out.println("Crear empleado");
                    crearEmpleado();

                }
                case 2 -> {
                    System.out.println("Mostrar todos los empleados");
                    mostrarEmpleados(empleadosFiltrados.length > 0 ? empleadosFiltrados : empleados);
                }
                case 3 -> {
                    System.out.println("filtrar empleados");
                    filtrarEmpleados();

                }
                case 4 -> {
                    System.out.println("Ordenar empleados");
                    ordenarEmpleados(empleadosFiltrados.length > 0 ? empleadosFiltrados : empleados);
                }
                case 5 -> {
                    System.out.println("Incrementar salario");
                    incrementarSalario(empleadosFiltrados.length > 0 ? empleadosFiltrados : empleados);
                }
                case 6 -> {
                    System.out.println("Limpiar filtros");
                    limpiarFiltro();
                }
                case 7 -> {
                    System.out.println("Saliendo del programa");
                }

                default -> {
                    System.out.println("Ingrese una opción valida");
                }
            }
            scanner.nextLine();
        } while (opc != 7);

    }

    public static void limpiarFiltro() {
        empleadosFiltrados = new Empleado[0];
        System.out.println("Limpiado el filro...");
    }

    public static void incrementarSalario(Empleado[] listaEmpleados) {
        System.out.println("Ingrese nombre del empleado: ");
        String nombre = scanner.nextLine();
        int index = buscarEmpleado(listaEmpleados, nombre);

        if (index != -1) {
            listaEmpleados[index].imprimirEmpleado();
            System.out.println("Ingrese cuanto % desea aumentar el salario, en negativo si desea decrementarlo: ");
            int porc = scanner.nextInt();
            scanner.nextLine();
            listaEmpleados[index]
                    .setSalario(listaEmpleados[index].getSalario() + listaEmpleados[index].getSalario() * porc);
            listaEmpleados[index].imprimirEmpleado();
        } else {
            System.out.println("No hay ningun empleado registrado con ese nombre...");
        }

    }

    public static void ordenarEmpleados(Empleado[] listaEmpleados) {
        Empleado empleadoAux;
        System.out.println("Opciones de ordenamiento:");
        System.out.println("1. Nombre ");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        System.out.println("5. Salir");
        System.out.println("Por que parametro desea ordenar: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                for (int i = 0; i < listaEmpleados.length - 1; i++) {
                    for (int j = 0; j < listaEmpleados.length - i - 1; j++) {
                        if (listaEmpleados[j].getNombre().compareToIgnoreCase(listaEmpleados[j + 1].getNombre()) > 1) {
                            empleadoAux = listaEmpleados[j];
                            listaEmpleados[j] = listaEmpleados[j + 1];
                            listaEmpleados[j + 1] = empleadoAux;
                        }
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < listaEmpleados.length - 1; i++) {
                    for (int j = 0; j < listaEmpleados.length - i - 1; j++) {
                        if (listaEmpleados[j].getEdad() > listaEmpleados[j + 1].getEdad()) {
                            empleadoAux = listaEmpleados[j];
                            listaEmpleados[j] = listaEmpleados[j + 1];
                            listaEmpleados[j + 1] = empleadoAux;
                        }
                    }
                }
            }
            case 3 -> {
                for (int i = 0; i < listaEmpleados.length - 1; i++) {
                    for (int j = 0; j < listaEmpleados.length - i - 1; j++) {
                        if (listaEmpleados[j].getSalario() > listaEmpleados[j + 1].getSalario()) {
                            empleadoAux = listaEmpleados[j];
                            listaEmpleados[j] = listaEmpleados[j + 1];
                            listaEmpleados[j + 1] = empleadoAux;
                        }
                    }
                }
            }
            case 4 -> {
                for (int i = 0; i < listaEmpleados.length - 1; i++) {
                    for (int j = 0; j < listaEmpleados.length - i - 1; j++) {
                        if (listaEmpleados[j].getDepartamento()
                                .compareToIgnoreCase(listaEmpleados[j + 1].getDepartamento()) > 1) {
                            empleadoAux = listaEmpleados[j];
                            listaEmpleados[j] = listaEmpleados[j + 1];
                            listaEmpleados[j + 1] = empleadoAux;
                        }
                    }
                }
            }
            default -> {
                return;
            }
        }
        mostrarEmpleados(listaEmpleados);
    }

    public static void crearEmpleado() {
        Empleado myEmpleado = new Empleado();
        System.out.println("Ingrese el Nombre del Empleado: ");
        String nomString = scanner.nextLine().trim();
        if (buscarEmpleado(empleados, nomString) == -1) {
            System.out.println("Ingrese la Edad: ");
            int edadInt = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese Salario: ");
            double salarioDouble = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ingrese el Departamento de Trabajo: ");
            String depaString = scanner.nextLine().trim();
            myEmpleado.setNombre(nomString);
            myEmpleado.setEdad(edadInt);
            myEmpleado.setSalario(salarioDouble);
            myEmpleado.setDepartamento(depaString);
            empleados = Arrays.copyOf(empleados, empleados.length + 1);
            empleados[empleados.length - 1] = myEmpleado;
        } else {
            System.out.println("El Empleado ya Existe!!!");
        }
        System.out.println("Empleado creado...");
    }

    public static void mostrarEmpleados(Empleado[] empleados) {
        for (Empleado empleado : empleados) {
            empleado.imprimirEmpleado();
        }
    }

    public static void filtrarEmpleados() {
        int filt;

        System.out.println("Elija un filtro");
        System.out.println("1. Nombre ");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        System.out.println("5. Salir");
        filt = scanner.nextInt();
        scanner.nextLine();
        switch (filt) {
            case 1 -> {
                System.out.println("Ingresa el nombre");
                String nombre = scanner.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getNombre().contains(nombre)) {
                        empleadosFiltrados = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
                        empleadosFiltrados[empleadosFiltrados.length - 1] = empleado;
                    }
                }
            }
            case 2 -> {
                System.out.println("Ingrese un edad maximo");
                int edadMax = scanner.nextInt();
                System.out.println("Ingrese un edad minimo ");
                int edadMin = scanner.nextInt();
                for (Empleado empleado : empleados) {
                    if (empleado.getEdad() > edadMin && empleado.getEdad() < edadMax) {
                        empleadosFiltrados = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
                        empleadosFiltrados[empleadosFiltrados.length - 1] = empleado;
                    }
                }
            }
            case 3 -> {
                System.out.println("Ingrese una salario maximo");
                int salMax = scanner.nextInt();
                System.out.println("Ingrese una salario minimo");
                int salMin = scanner.nextInt();
                for (Empleado empleado : empleados) {
                    if (empleado.getSalario() > salMax && empleado.getSalario() < salMin) {
                        empleadosFiltrados = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
                        empleadosFiltrados[empleadosFiltrados.length - 1] = empleado;
                    }
                }
            }
            case 4 -> {
                System.out.println("Ingresa el departamento");
                String departamento = scanner.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getDepartamento().contains(departamento)) {
                        empleadosFiltrados = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
                        empleadosFiltrados[empleadosFiltrados.length - 1] = empleado;
                    }
                }
            }
            default -> {
                return;
            }
        }
        mostrarEmpleados(empleadosFiltrados);

    }

    public static int buscarEmpleado(Empleado[] listaEmpleados, String nombre) {
        for (int i = 0; i < listaEmpleados.length; i++) {
            if (listaEmpleados[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;

            }
        }
        return -1;

    }
}