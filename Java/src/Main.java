import Utils.TerminalFunctions;

public class Main {

    public static void main(String[] args) throws Exception {
        TerminalFunctions.init();
        boolean inLoop = true;
        do {
            menu();
            switch (TerminalFunctions.inputInt(16, "Ingrese la opcion que prefiere: ")) {
                case 0 -> {
                    System.out.println("Muchas gracias, que tenga buen dia.");
                    inLoop = false;
                }
                case 1 -> {
                    classOne();
                }
                case 2 -> {
                    classTwo();
                }
                case 3 -> {
                    classThree();
                }
                case 4 -> {
                    classFour();
                }
                case 5 -> {
                    classFive();
                }
                case 6 -> {
                    classSix();
                }
                case 7 -> {
                    classSeven();
                }
                case 8 -> {
                    classEight();
                }
                case 9 -> {
                    classNine();
                }
                case 10 -> {
                    classTen();
                }
                case 11 -> {
                    classEleven();
                }
                case 13 -> {
                    classThirteen();
                }
                case 15 -> {
                    classFifteen();
                }
                case 16 -> {
                    classSixteen();
                }
                default -> throw new AssertionError("How did we get here?");
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
        System.out.println("4. Clase Cuatro");
        System.out.println("5. Clase Cinco");
        System.out.println("6. Clase Seis");
        System.out.println("7. Clase Siete");
        System.out.println("8. Clase Ocho");
        System.out.println("9. Clase Nueve");
        System.out.println("10. Clase diez");
        System.out.println("11. Clase Once");
        System.out.println("15. Clase Quince");
        System.out.println("16. Clase Dieciseis");
        System.out.println("0. Salir");
    }

    public static int menuActivities(int nActivities, int nComplement, String classNumber) {
        String[] labelNumber = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez" };
        TerminalFunctions.clearTerminal();
        System.out.println("Que actividad de la clase " + classNumber + " quiere ejecutar: ");
        int i = 0;

        for (; i < nActivities; i++) {
            System.out.println((i + 1) + ". Actividad " + labelNumber[i]);
        }

        for (i = 0; i < nComplement; i++) {
            System.out.println((nActivities + i + 1) + ". Actividad complementaria " + labelNumber[i]);
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

    public static void classOne() {
        int option = menuActivities(2, 1, "uno");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassOne.ActivityOne.printHelloWorld();
                case 2 -> ClassOne.ActivityTwo.dataType();
                case 3 -> ClassOne.Complement.complementOuts();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classTwo() {
        int option = menuActivities(3, 2, "dos");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassTwo.ActivityOne.scannerFunction();
                case 2 -> ClassTwo.ActivityTwo.calculator();
                case 3 -> ClassTwo.ActivityThree.comparations();
                case 4 -> ClassTwo.ComplementOne.AgeVerification();
                case 5 -> ClassTwo.ComplementTwo.rectangle();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classThree() {
        int option = menuActivities(2, 0, "tres");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassThree.ActivityOne.evenOrOdd();
                case 2 -> ClassThree.ActivityTwo.calculator();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classFour() {
        int option = menuActivities(3, 3, "cuatro");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassFour.ActivityOne.determineNumber();
                case 2 -> ClassFour.ActivityTwo.rating();
                case 3 -> ClassFour.ActivityThree.divisible35();
                case 4 -> ClassFour.ComplementOne.security();
                case 5 -> ClassFour.ComplementTwo.discount();
                case 6 -> ClassFour.ComplementThree.ageVerification();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classFive() {
        int option = menuActivities(4, 2, "cinco");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassFive.ActivityOne.weekDay();
                case 2 -> ClassFive.ActivityTwo.rating();
                case 3 -> ClassFive.ActivityThree.pauseMenu();
                case 4 -> ClassFive.ActivityFour.figuresAreas();
                case 5 -> ClassFive.ComplementOne.workingDay();
                case 6 -> ClassFive.ComplementTwo.areaPer();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classSix() {
        int option = menuActivities(3, 0, "cinco");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassSix.ActivityOne.division();
                case 2 -> ClassSix.ActivityTwo.inputTry();
                case 3 -> ClassSix.ActivityThree.intToString();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classSeven() {
        int option = menuActivities(5, 4, "siete");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassSeven.ActivityOne.stringLength();
                case 2 -> ClassSeven.ActivityTwo.concatName();
                case 3 -> ClassSeven.ActivityThree.cutString();
                case 4 -> ClassSeven.ActivityFour.searchChar();
                case 5 -> ClassSeven.ActivityFive.upToDown();
                case 6 -> ClassSeven.ComplementOne.changeChar();
                case 7 -> ClassSeven.ComplementTwo.trimString();
                case 8 -> ClassSeven.ComplementThree.compareString();
                case 9 -> ClassSeven.ComplementFour.countingChars();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classEight() {
        int option = menuActivities(5, 2, "siete");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassEight.ActivityOne.absInt();
                case 2 -> ClassEight.ActivityTwo.rounding();
                case 3 -> ClassEight.ActivityThree.random();
                case 4 -> ClassEight.ActivityFour.powNumbers();
                case 5 -> ClassEight.ActivityFive.sqrtnumbers();
                case 6 -> ClassEight.ComplementOne.randomRange();
                case 7 -> ClassEight.ComplementTwo.primeNumber();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classNine() {
        int option = menuActivities(2, 0, "siete");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassNine.ActivityOne.tempConvertion();
                case 2 -> ClassNine.ActivityTwo.securityVerification();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classTen() {
        int option = menuActivities(5, 3, "diez");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassTen.ActivityOne.printSumList();
                case 2 -> ClassTen.ActivityTwo.average();
                case 3 -> ClassTen.ActivityThree.maxValue();
                case 4 -> ClassTen.ActivityFour.arrayInts();
                case 5 -> ClassTen.ActivityFive.copingInArray();
                case 6 -> ClassTen.ComplementOne.pairElements();
                case 7 -> ClassTen.ComplementTwo.pairIndex();
                case 8 -> ClassTen.ComplementThree.alfabetic();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classEleven() {
        int option = menuActivities(6, 3, "diez");
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
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classThirteen() {
        int option = menuActivities(5, 1, "trece");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassThirteen.ActivityOne.sortingReverse();
                case 2 -> ClassThirteen.ActivityTwo.searchRandom();
                case 3 -> ClassThirteen.ActivityThree.arrayCompare();
                case 4 -> ClassThirteen.ActivityFour.arrayChange();
                case 5 -> ClassThirteen.ActivityFive.fillingArray();
                case 6 -> ClassThirteen.ComplementOne.fillingPersonalized();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classFifteen() {
        int option = menuActivities(4, 0, "quince");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassFifteen.ActivityOne.passwordGenerator();
                case 2 -> ClassFifteen.ActivityTwo.rating();
                case 3 -> ClassFifteen.ActivityThree.fibonaci();
                case 4 -> ClassFifteen.ActivityFour.isPrime();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }

    public static void classSixteen() {
        int option = menuActivities(5, 0, "dieciseis");
        if (option != 0) {
            switch (option) {
                case 1 -> ClassSixteen.ActivityOne.factorial();
                case 2 -> ClassSixteen.ActivityTwo.searchFibonaci();
                case 3 -> ClassSixteen.ActivityThree.primo();
                case 4 -> ClassSixteen.ActivityFour.printSquare();
                case 5 -> ClassSixteen.ActivityFive.dots();
                default -> throw new AssertionError("How did we get here?");
            }
            System.out.println("Funcion finalizada, volviendo al menu...");
        }
        TerminalFunctions.waitEnter();
    }
}
