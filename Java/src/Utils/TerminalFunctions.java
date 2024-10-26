package Utils;

import java.util.Scanner;


public class TerminalFunctions {
    private  static Scanner scanner;
    public static void init(){
        scanner = new Scanner(System.in);
    }

    public static void close(){
        if (scanner != null) {
            scanner.close();
            scanner = null;
        }
    }

    public static void clearTerminal(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public static void waitEnter(){
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
    }

    public static Scanner getScanner(){
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static String inputString(String message){
        System.out.println(message);
        String outString = scanner.nextLine();
        return outString;
    }

    public static double inputDouble(String message) {
        return inputDouble(message, "Numero no valido, ingrese nuevamente");
    }

    public static double inputDouble(String message, String errorMessage) {
        double val = 0;
        boolean isNotvalid;
        do {
            System.out.print(message);
            try {
                val = scanner.nextDouble();
                scanner.nextLine();
                isNotvalid = false;
            } catch (Exception e) {
                System.out.println("Entrada no valida, intente de nuevo");
                scanner.nextLine();
                isNotvalid = true;
            }
        } while (isNotvalid);
        return val;
    }

    public static int inputInt(String message) {
        return inputInt(message, "Numero no valido, ingrese nuevamente");
    }

    public static int inputInt(String message, String errorMessage) {
        int val = 0;
        boolean isNotvalid;
        do {
            System.out.print(message);
            try {
                val = scanner.nextInt();
                scanner.nextLine();
                isNotvalid = false;
            } catch (Exception e) {
                System.out.println("Entrada no valida, intente de nuevo");
                scanner.nextLine();
                isNotvalid = true;
            }
        } while (isNotvalid);
        return val;
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
                scanner.nextLine();
                isNotvalid = val < 0 || val > maxValue;
                if (isNotvalid) {
                    System.out.println(errorMessage);
                }
            } catch (Exception e) {
                System.out.println("Entrada no valida, intente de nuevo");
                scanner.nextLine();
            }
        } while (isNotvalid);
        return val;
    }


}
