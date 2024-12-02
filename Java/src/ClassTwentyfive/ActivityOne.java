package ClassTwentyfive;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * 
 * Tu misión será desarrollar un programa de administración de empleados que incluya una interfaz de menú para el usuario. 
 * Inicialmente, los usuarios tendrán la capacidad de añadir nuevos empleados al sistema, ingresando datos como el nombre, 
 * la edad, el salario y el departamento en el que trabajan. 
 * Posteriormente, podrán optar por visualizar un resumen en forma de tabla que muestra información sobre todos los empleados, 
 * asignando a cada uno un número de fila.
 * 
 * Adicionalmente, el sistema brindará la opción de filtrar y ordenar la lista de empleados. 
 * Los usuarios podrán establecer criterios de búsqueda basados en atributos como el nombre, la edad, el salario y el departamento. 
 * Además, tendrán la flexibilidad de definir límites mínimos y máximos para la edad y el salario. 
 * La funcionalidad para ordenar la lista de empleados según diferentes parámetros como el nombre, la edad o el salario también estará disponible.
 * 
 * En este paso escribirás los métodos que necesites para ejecutar tu sistema. 
 * Estos métodos tendrás que escribirlos como métodos estáticos dentro de la clase “Empleado”. 
 * El nombre de los métodos debe ser representativo de su funcionamiento. 
 */

import ClassTwentyfive.models.Employee;
import Utils.TerminalFunctions;
import java.util.Arrays;

public class ActivityOne {
    private static Employee[] employees = new Employee[0];
    private static Employee[] filtedEmployees = new Employee[0];
    private static boolean isFilterOn = false;

    public static void main(String[] args) {
        TerminalFunctions.init();
        gestionSystem();
        TerminalFunctions.close();
    }

    public static void gestionSystem() {
        int option;

        do {
            TerminalFunctions.clearTerminal();
            menu();
            option = TerminalFunctions.inputInt(1, 7, "Elija una accion: ");
            switch (option) {
                case 1 -> {
                    showEmployees();
                }
                case 2 -> {
                    createEmployee();
                }
                case 3 -> {
                    filteringEmployees();
                }
                case 4 -> {
                    sortingEmployees();
                }
                case 5 -> {
                    incrementSalary();
                }
                case 6 -> {
                    clearFilter();
                }
                case 7 -> {
                    System.out.println("Saliendo del programa. Tenga buen dia.");
                }
                default -> throw new AssertionError();
            }
            TerminalFunctions.waitEnter();
        } while (option != 7);
    }

    private static void menu() {
        System.out.println("""
                Menu:
                1. Ver todos los empleados
                2. Crear empleado
                3. Filtrar empleados
                4. Ordenar empleados
                5. Incrementar salario
                6. Limpiar filtros
                7. Salir del programa.
                """);
    }

    private static void sortingEmployees(){
        menuFiltering();
        int option = TerminalFunctions.inputNatural("Por cual desea ordenar: ");
        Employee[] employeesAux = Employee.sortingEmployees(isFilterOn ? filtedEmployees : employees, option);
        showEmployees();

        char charOption = TerminalFunctions.inputString("Desea guardar la lista? (S/N)").toLowerCase().toCharArray()[0];

        if (charOption == 's') {
            if (isFilterOn) {
                filtedEmployees = employeesAux;
            } else {
                employees = employeesAux;
            }
            System.out.println("Lista guardada.");
        }
    }

    private static void showEmployees() {
        Employee.showEmployees(isFilterOn ? filtedEmployees : employees);
        TerminalFunctions.waitEnter();
    }

    private static void createEmployee() {
        String name = TerminalFunctions.inputString("Ingrese nombre del empleado: ");
        if (Employee.searchEmployee(employees, name) == -1) {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = new Employee(name,
                    TerminalFunctions.inputString("Ingrese departamento del empleado: "),
                    TerminalFunctions.inputNatural("Ingrese edad del empleado: "),
                    TerminalFunctions.inputPositiveDouble("Ingrese salario del empleado: "));
        } else {
            System.out.println("El empleado ya existe");
        }
    }

    private static void menuFiltering() {
        System.out.println("""
                Agregar filtros:
                1. Nombres
                2. Edad
                3. Departamento
                4. Salario
                """);
    }

    private static void filteringEmployees() {
        menuFiltering();
        int option = TerminalFunctions.inputInt(1, 4, "Por cual desea filtrar: ");
        filtedEmployees = Employee.filterEmployees(employees, option);
        isFilterOn = true;
        System.out.println("Cantidad de empleados resultantes: " + filtedEmployees.length);
        showEmployees();
    }

    private static void incrementSalary() {
        showEmployees();
        Employee[] employeesAux = isFilterOn ? filtedEmployees : employees;
        int index = Employee.searchEmployee(employeesAux, TerminalFunctions.inputString("Introduzca nombre: "));

        if (index >= 0) {
            employeesAux[index] = Employee.incrementSalary(employeesAux[index], TerminalFunctions.inputDouble("Ingrese aumento en porcentaje: "));
        } else {
            System.out.println("Empledo no encontrado...");
        }
    }

    private static void clearFilter(){
        System.out.print("Limpiando el filtro");
        TerminalFunctions.sleep(500);
        System.out.print(".");
        TerminalFunctions.sleep(500);
        System.out.print(".");
        TerminalFunctions.sleep(500);
        System.out.print(".");
        TerminalFunctions.sleep(500);
        System.out.println("");
        isFilterOn = false;
        filtedEmployees = new Employee[0];
        System.out.println("Filtro limpiado...");
    }
}
