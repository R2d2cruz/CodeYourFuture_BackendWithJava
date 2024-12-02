package ClassTwentyfive.models;

import Utils.TerminalFunctions;
import java.util.Arrays;

public class Employee {
    private String name;
    private String departament;
    private int age;
    private double salary;

    public Employee(String name, String departament, int age, double salary) {
        this.name = name;
        this.departament = departament;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\tEdad: %d\nDepartamento: %s\nSalario: %.2f", name, age, departament, salary);
    }

    public static void showEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("========================================");
            System.out.println(employee);
            System.out.println("========================================\n");
        }
    }

    public static Employee[] sortingEmployees(Employee[] employees, int option) {
        Employee[] sortdEmployees = Arrays.copyOf(employees, employees.length);
        Employee employeeAux;
        switch (option) {
            case 1 -> {
                for (int i = 0; i < sortdEmployees.length - 1; i++) {
                    for (int j = 0; j < sortdEmployees.length - i - 1; j++) {
                        if (sortdEmployees[j].getName().compareToIgnoreCase(sortdEmployees[j + 1].getName()) > 1) {
                            employeeAux = sortdEmployees[j];
                            sortdEmployees[j] = sortdEmployees[j + 1];
                            sortdEmployees[j + 1] = employeeAux;
                        }
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < sortdEmployees.length - 1; i++) {
                    for (int j = 0; j < sortdEmployees.length - i - 1; j++) {
                        if (sortdEmployees[j].getAge() > sortdEmployees[j + 1].getAge()) {
                            employeeAux = sortdEmployees[j];
                            sortdEmployees[j] = sortdEmployees[j + 1];
                            sortdEmployees[j + 1] = employeeAux;
                        }
                    }
                }
            }
            case 3 -> {
                for (int i = 0; i < sortdEmployees.length - 1; i++) {
                    for (int j = 0; j < sortdEmployees.length - i - 1; j++) {
                        if (sortdEmployees[j].getSalary() > sortdEmployees[j + 1].getSalary()) {
                            employeeAux = sortdEmployees[j];
                            sortdEmployees[j] = sortdEmployees[j + 1];
                            sortdEmployees[j + 1] = employeeAux;
                        }
                    }
                }
            }
            case 4 -> {
                for (int i = 0; i < sortdEmployees.length - 1; i++) {
                    for (int j = 0; j < sortdEmployees.length - i - 1; j++) {
                        if (sortdEmployees[j].getDepartament()
                                .compareToIgnoreCase(sortdEmployees[j + 1].getDepartament()) > 1) {
                            employeeAux = sortdEmployees[j];
                            sortdEmployees[j] = sortdEmployees[j + 1];
                            sortdEmployees[j + 1] = employeeAux;
                        }
                    }
                }
            }
            default -> {
            }

        }

        return sortdEmployees;
    }

    public static Employee[] filterEmployees(Employee[] employees, int option) {
        Employee[] filtedEmployees = new Employee[0];
        switch (option) {
            case 1 -> {
                String name = TerminalFunctions.inputString("Ingrese nombre por el que desea filtrar: ");
                for (Employee employee : employees) {
                    if (employee.getName().contains(name)) {
                        filtedEmployees = Arrays.copyOf(filtedEmployees, filtedEmployees.length + 1);
                        filtedEmployees[filtedEmployees.length - 1] = employee;
                    }

                }
            }
            case 2 -> {
                String department = TerminalFunctions.inputString("Ingrese el departamento por el que desea filtrar: ");
                for (Employee employee : employees) {
                    if (employee.getDepartament().contains(department)) {
                        filtedEmployees = Arrays.copyOf(filtedEmployees, filtedEmployees.length + 1);
                        filtedEmployees[filtedEmployees.length - 1] = employee;
                    }
                }
            }
            case 3 -> {
                int min = TerminalFunctions.inputNatural("Ingrese edad minima: ");
                int max = TerminalFunctions.inputNatural("Ingrese edad maxima: ");
                for (Employee employee : employees) {
                    if (employee.getAge() >= min && employee.getAge() <= max) {
                        filtedEmployees = Arrays.copyOf(filtedEmployees, filtedEmployees.length + 1);
                        filtedEmployees[filtedEmployees.length - 1] = employee;
                    }
                }
            }
            case 4 -> {
                int min = TerminalFunctions.inputNatural("Ingrese edad minima: ");
                int max = TerminalFunctions.inputNatural("Ingrese edad maxima: ");
                for (Employee employee : employees) {
                    if (employee.getSalary() >= min && employee.getSalary() <= max) {
                        filtedEmployees = Arrays.copyOf(filtedEmployees, filtedEmployees.length + 1);
                        filtedEmployees[filtedEmployees.length - 1] = employee;
                    }
                }
            }
            default -> throw new AssertionError();
        }

        return filtedEmployees;
    }

    public static int searchEmployee(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public static Employee incrementSalary(Employee employee, double porcIncrement){
        if (porcIncrement >= 0) {
            employee.setSalary(employee.getSalary() * (1 + (porcIncrement / 100)));
        }

        return employee;
    }
}
