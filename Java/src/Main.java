import Utils.TerminalFunctions;

public class Main {

    public static void main(String[] args) throws Exception {
        TerminalFunctions.init();
        boolean inLoop = true;
        do {
            menu();
            switch (TerminalFunctions.inputInt(11, "Ingrese la opcion que prefiere: ")) {
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
                case 3 -> {
                    thirdClass();
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
        TerminalFunctions.close();
    }

    public static void menu() {
        TerminalFunctions.clearTerminal();
        System.out.println("Menu de clases, seleccione una: ");
        System.out.println("1. Clase Uno");
        System.out.println("2. Clase Dos");
        System.out.println("3. Clase Tres");
        System.out.println("10. Clase diez");
        System.out.println("11. Clase Once");
        System.out.println("0. Salir");
    }

    public static int menuActivities(int nActivities, int nComplement, String classNumber) {
        String[] labelNumber = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        TerminalFunctions.clearTerminal();
        System.out.println("Que actividad de la clase " + classNumber + " quiere ejecutar: ");
        int i = 0;

        for (; i < nActivities; i++) {
            System.out.println((i + 1) + ". Actividad " + labelNumber[i]);
        }

        for (i = 0; i < nComplement; i++) {
            System.out.println((nActivities + i) + ". Actividad complementaria " + labelNumber[i]);
        }
        System.out.println("0. Ninguna."); 
        
        int option = TerminalFunctions.inputInt(nActivities + nComplement, "Ingrese que actividad desea: ");
        if (option == 0) {
            System.out.println("Entendido, regresando al menu...");
        } else {
            TerminalFunctions.clearTerminal();
        }
        return option;
    }

    public static void firstClass() {
        int option = menuActivities(2, 1,"uno");
        if (option != 0) {
            switch (option) {
                case 1 -> FirstClass.ActivityOne.printHelloWorld();
                case 2 -> FirstClass.ActivityTwo.dataType();
                case 3 -> FirstClass.Complement.complementOuts();
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }
          
          
    public static void secondClass() {
        int option = menuActivities(3, 2,"dos");
        if (option != 0) {
            switch (option) {
                case 1 -> SecondClass.ActivityOne.scannerFunction();
                case 2 -> SecondClass.ActivityTwo.calculator();
                case 3 -> SecondClass.ActivityThree.comparations();
                case 4 -> SecondClass.ComplementOne.AgeVerification();
                case 5 -> SecondClass.ComplementTwo.rectangle();
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }


    public static void thirdClass() {
        int option = menuActivities(2, 0,"tres");
        if (option != 0) {
            switch (option) {
                case 1 -> ThirdActivity_IntegrativeActivity.ActivityOne.evenOrOdd();
                case 2 -> ThirdActivity_IntegrativeActivity.ActivityTwo.calculator();
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }
  
  
    public static void arrayClass() {
        int option = menuActivities(5, 3,"diez");
        if (option != 0) {
            switch (option) {
                case 1 -> ArrayClass.ActivityOne.printSumList();
                case 2 -> ArrayClass.ActivityTwo.average();
                case 3 -> ArrayClass.ActivityThree.maxValue();
                case 4 -> ArrayClass.ActivityFour.arrayInts();
                case 5 -> ArrayClass.ActivityFive.copingInArray();
                case 6 -> ArrayClass.ComplementOne.pairElements();
                case 7 -> ArrayClass.ComplementTwo.pairIndex();
                case 8 -> ArrayClass.ComplementThree.alfabetic();
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }
                

    public static void elevenClass() {
        int option = menuActivities(6, 3,"diez");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassEleven.ActivityOne.printArrayLn();
                case 2 -> ClassEleven.ActivityTwo.minVal();
                case 3 -> ClassEleven.ActivityThree.printInv();
                case 4 -> ClassEleven.ActivityFour.pairCounting();
                case 5 -> ClassEleven.ActivityFive.floatAverage();
                case 6 -> ClassEleven.ActivitySix.concatenateStrings();
                case 7 -> ClassEleven.ComplementOne.invertArray();
                case 8 -> ClassEleven.ComplementTwo.sumArray();
                case 9 -> ClassEleven.ComplementThree.searchLetter();
                default -> throw new AssertionError();
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }
}
