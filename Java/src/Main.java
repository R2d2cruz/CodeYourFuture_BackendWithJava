import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean inLoop = true;
        do {
            menu();
            switch (inputInt(10, "Ingrese la opcion que prefiere: ")) {
                case 0 -> {
                    System.out.println("Muchas gracias, que tenga buen dia.");
                    inLoop = false;
                }
                case 1 -> {
                    firstClass();
                }
                case 2 -> {
                    secondClass();
                }
                case 10 -> {
                    arrayClass();
                }
                case 11 -> {
                    elevenClass();
                }
                default -> throw new AssertionError();
            }
        } while (inLoop);
        scanner.close();
    }

    public static void menu() {
        clearTerminal();
        System.out.println("Menu de clases, seleccione una: ");
        System.out.println("1. Clase Uno");
        System.out.println("2. Clase Dos");
        System.out.println("10. Clase diez");
        System.out.println("11. Clase Once");
        System.out.println("0. Salir");
    }

    public static int inputInt(int maxValue, String message) {
        return inputInt(maxValue, message, "Numero no valido, ingrese nuevamente");
    }

    public static int inputInt(int maxValue, String message, String errorMessage) {
        int val = 0;
        boolean isNotvalid = false;
        do {
            System.out.print(message);
            try {
                val = scanner.nextInt();
                isNotvalid = val < 0 || val > maxValue;
                if (isNotvalid) {
                    System.out.println(errorMessage);
                }
            } catch (Exception e) {
                System.out.println("Entrada no valida, intente de nuevo");
            }
        } while (isNotvalid);
        return val;
    }

    public static void clearTerminal(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public static void waitEnter(){
        scanner.nextLine();
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
    }

    public static void firstClass() {
        clearTerminal();
        System.out.println("Que actividad quiere ejecutar: ");
        System.out.println("1. Actividad uno");
        System.out.println("2. Actividad dos");
        System.out.println("3. Actividad complementaria");
        System.out.println("0. Ninguna.");
        int option = inputInt(3, "Ingrese que actividad desea: ");
        if (option == 0) {
            System.out.println("Entendido, regresando al menu...");
        } else {
            switch (option) {
                case 1 -> FirstClass.ActivityOne.printHelloWorld();
                case 2 -> FirstClass.ActivityTwo.dataType();
                case 3 -> FirstClass.Complement.complementOuts();
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
            waitEnter();
        }
    }

    public static void secondClass() {
        clearTerminal();
        System.out.println("Que actividad quiere ejecutar: ");
        System.out.println("1. Actividad uno");
        System.out.println("2. Actividad dos");
        System.out.println("3. Actividad tres");
        System.out.println("4. Actividad complementaria uno");
        System.out.println("5. Actividad complementaria dos");
        System.out.println("0. Ninguna.");
        int option = inputInt(3, "Ingrese que actividad desea: ");
        if (option == 0) {
            System.out.println("Entendido, regresando al menu...");
        } else {
            switch (option) {
                case 1 -> SecondClass.ActivityOne.scannerFunction(scanner);
                case 2 -> SecondClass.ActivityTwo.calculator(scanner);
                case 3 -> SecondClass.ActivityThree.comparations(scanner);
                case 4 -> SecondClass.ComplementOne.AgeVerification(scanner);
                case 5 -> SecondClass.ComplementTwo.rectangle(scanner);
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
            waitEnter();
        }
    }
  
  
    public static void arrayClass() {
        clearTerminal();
        System.out.println("Que actividad quiere ejecutar: ");
        System.out.println("1. Actividad uno");
        System.out.println("2. Actividad dos");
        System.out.println("3. Actividad tres");
        System.out.println("4. Actividad cuatro");
        System.out.println("5. Actividad cinco");
        System.out.println("6. Actividad complementaria uno");
        System.out.println("7. Actividad complementaria dos");
        System.out.println("8. Actividad complementaria tres");
        System.out.println("0. Ninguna.");
        int option = inputInt(8, "Ingrese que actividad desea: ");
        if (option == 0) {
            System.out.println("Entendido, regresando al menu...");
        } else {
            switch (option) {
                case 1 -> ArrayClass.ActivityOne.printSumList(scanner);
                case 2 -> ArrayClass.ActivityTwo.average(scanner);
                case 3 -> ArrayClass.ActivityThree.maxValue(scanner);
                case 4 -> ArrayClass.ActivityFour.arrayInts(scanner);
                case 5 -> ArrayClass.ActivityFive.copingInArray(scanner);
                case 6 -> ArrayClass.ComplementOne.pairElements();
                case 7 -> ArrayClass.ComplementTwo.pairIndex();
                case 8 -> ArrayClass.ComplementThree.alfabetic(scanner);
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
            waitEnter();
        }
    }
                

    public static void elevenClass() {
        clearTerminal();
        System.out.println("Que actividad quiere ejecutar: ");
        System.out.println("1. Actividad uno");
        System.out.println("2. Actividad dos");
        System.out.println("3. Actividad tres");
        System.out.println("4. Actividad cuatro");
        System.out.println("5. Actividad cinco");
        System.out.println("6. Actividad seis");
        System.out.println("7. Actividad complementaria uno");
        System.out.println("8. Actividad complementaria dos");
        System.out.println("9. Actividad complementaria tres");
        System.out.println("0. Ninguna.");
        int option = inputInt(9, "Ingrese que actividad desea: ");
        if (option == 0) {
            System.out.println("Entendido, regresando al menu...");
        } else {
            switch (option) {
                case 1 -> ClassEleven.ActivityOne.printArrayLn();
                case 2 -> ClassEleven.ActivityTwo.minVal();
                case 3 -> ClassEleven.ActivityThree.printInv();
                case 4 -> ClassEleven.ActivityFour.pairCounting();
                case 5 -> ClassEleven.ActivityFive.floatAverage();
                case 6 -> ClassEleven.ActivitySix.concatenateStrings(scanner);
                case 7 -> ClassEleven.ComplementOne.invertArray();
                case 8 -> ClassEleven.ComplementTwo.sumArray();
                case 9 -> ClassEleven.ComplementThree.searchLetter(scanner);
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
            waitEnter();
        }
    }
}
