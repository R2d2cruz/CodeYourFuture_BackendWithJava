import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean inLoop = true;
        do {
            menu();
            switch (inputInt(1, "Ingrese la opcion que prefiere: ")) {
                case 0 -> {
                    System.out.println("Muchas gracias, que tenga buen dia.");
                    inLoop = false;
                }
                case 1 -> {
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
        System.out.println("0. Salir");
    }

    public static int inputInt(int maxValue, String message) {
        return inputInt(maxValue, message, "Numero no valido, ingrese nuevamente");
    }

    public static int inputInt(int maxValue, String message, String errorMessage) {
        int val = 0;
        boolean isNotvalid;
        do {
            System.out.print(message);
            val = scanner.nextInt();
            isNotvalid = val < 0 || val > maxValue;
            if (isNotvalid) {
                System.out.println(errorMessage);
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

    }
}
