package ClassTwentythree;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * Crea un menú de opciones en consola donde el usuario pueda crear un objeto “Auto”. 
 * 
 * ¡Atención! El usuario puede dejar algunos atributos sin completar 
 * y tendrá una opción para poder imprimir los atributos del objeto en consola.
 */

import Utils.TerminalFunctions;
import java.util.Arrays;

public class ComplementOne {

    private static Car[] cars = new Car[0];

    public static void carFactory() {
        int option;

        String user = TerminalFunctions.inputString("Ingrese nombre del usuario:");
        System.out.println("Bienvenido " + user);
        TerminalFunctions.sleep(500);

        do {
            TerminalFunctions.clearTerminal();
            menu();
            option = TerminalFunctions.inputInt(2, "Que accion desea realizar: ");

            switch (option) {
                case 0 -> {
                    System.out.println("Cerrando sesion...");
                    TerminalFunctions.sleep(500);
                    TerminalFunctions.clearTerminal();
                    System.out.println("Tenga buen dia :)");
                }
                case 1 -> showCars();
                case 2 -> createCar();
                default -> throw new AssertionError();
            }
        } while (option != 0);

    }

    private static void menu() {
        System.out.println("""
                Acciones disponibles:
                1- Mostar modelos existentes de auto
                2- Crear un nuevo modelo de auto.
                0- Salir
                """);
    }

    private static void showCars() {
        for (Car car : cars) {
            car.printData();
        }
    }

    private static void addCar(Car car){
        cars = Arrays.copyOf(cars, cars.length + 1);
        cars[cars.length - 1] = car;
    }

    private static int inputYear(){
        int n;
        do {
            n = TerminalFunctions.inputNatural("");
            if (Car.verifyYear(n)) {
                return n;
            } else {
                System.out.println("Año no valido, ingrese un año valido");
            }
        } while (true);
    }

    private static void createCar() {
        System.out.println("Creando carro...");
        TerminalFunctions.sleep(500);
        System.out.println("""
                Opciones de informacion:
                1- Marca
                2- Marca y modelo
                3- Marca, modelo y año
                0- Salir
                """);
        int option = TerminalFunctions.inputInt(3, "Elija una opcion: ");
        switch (option) {
            case 1 -> addCar(new Car(TerminalFunctions.inputString("Ingrese marca del vehiculo: ")));
            case 2 -> addCar(new Car(TerminalFunctions.inputString("Ingrese marca del vehiculo: "), TerminalFunctions.inputString("Ingrese modelo del vehiculo: ")));
            case 3 -> addCar(new Car(TerminalFunctions.inputString("Ingrese marca del vehiculo: "), TerminalFunctions.inputString("Ingrese modelo del vehiculo: "), inputYear()));
            default -> {
            }
        }
        TerminalFunctions.sleep(500);
        System.out.println("Regresando al menu...");
    }
}
