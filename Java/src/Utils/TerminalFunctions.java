package Utils;

import java.util.Scanner;

/**
 * The TerminalFunctions class provides methods to interact with the console.
 * It includes methods to initialize and close the Scanner, clear the terminal,
 * wait for user input, and read different data types (String, double, int) with
 * error handling.
 */
public class TerminalFunctions {
    private static Scanner scanner;

    /**
     * Initializes the Scanner for input from System.in.
     * This method should be called before using other methods that require user
     * input.
     */
    public static void init() {
        scanner = new Scanner(System.in);
    }

    /**
     * Closes the Scanner if it is open and sets it to null to prevent further
     * usage.
     * It is recommended to call this method at the end of the program to release
     * the resource.
     */
    public static void close() {
        if (scanner != null) {
            scanner.close();
            scanner = null;
        }
    }

    /**
     * Clears the terminal using an ANSI escape command to move the cursor to the
     * top
     * and clear the screen. Works on ANSI-compatible systems (e.g., Linux and
     * macOS).
     */
    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Waits for the user to press Enter before proceeding.
     * Uses the Scanner to read the newline and pause execution momentarily.
     */
    public static void waitEnter() {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Retrieves the Scanner instance, initializing it if not already created.
     * 
     * @return Scanner the Scanner instance for reading from the console.
     */
    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    /**
     * Pauses the execution of the program for a specified number of milliseconds.
     * If the thread is interrupted during the sleep, an error message is printed to
     * the console.
     * 
     * @param milisec The duration of the pause in milliseconds.
     */
    public static void sleep(int milisec) {
        try {
            Thread.sleep(milisec);
        } catch (InterruptedException e) {
            System.out.println("Error inesperado");
        }
    }

    /**
     * Prompts the user to enter a single character.
     * The method calls `inputString` to read input and extracts the first
     * character.
     * 
     * @param message The message displayed to the user before input.
     * @return char The first character entered by the user.
     */
    public static char inputChar(String message) {
        return (inputString(message, "Please enter a single character")).toCharArray()[0];
    }

    /**
     * Prompts the user to enter a string of text.
     * If input is invalid (empty), displays a default error message and requests
     * new input.
     * 
     * @param message The message displayed to the user before input.
     * @return String The user's input as a trimmed string.
     */
    public static String inputString(String message) {
        return inputString(message, "Invalid input. Please enter text.");
    }

    /**
     * Prompts the user to enter a string of text with error handling.
     * If input is invalid (empty), displays the specified error message and
     * requests new input.
     * 
     * @param message      The message displayed to the user before input.
     * @param errorMessage The error message displayed if input is invalid.
     * @return String The user's input as a trimmed string.
     */
    public static String inputString(String message, String errorMessage) {
        String outString;
        boolean isNotValid;
        do {
            System.out.print(message);
            outString = scanner.nextLine();
            isNotValid = outString.trim().isEmpty();
            if (isNotValid) {
                System.out.println(errorMessage);
            }
        } while (isNotValid);
        return outString.trim();
    }

    /**
     * Prompts the user to enter a decimal number.
     * In case of invalid input, displays an error message and requests new input.
     * 
     * @param message The message displayed to the user before input.
     * @return double the decimal number entered by the user.
     */
    public static double inputDouble(String message) {
        return inputDouble(message, "Numero invalido. Por favor, vuelva a intentar...");
    }

    /**
     * Prompts the user to enter a decimal number with error handling.
     * In case of invalid input, displays the specified error message.
     * 
     * @param message      The message displayed to the user before input.
     * @param errorMessage The error message displayed if input is invalid.
     * @return double the decimal number entered by the user.
     */
    public static double inputDouble(String message, String errorMessage) {
        double val = 0;
        boolean isNotValid;
        do {
            System.out.print(message);
            try {
                val = scanner.nextDouble();
                scanner.nextLine(); // Consumes the newline
                isNotValid = false;
            } catch (Exception e) {
                System.out.println(errorMessage);
                scanner.nextLine(); // Clears the buffer in case of error
                isNotValid = true;
            }
        } while (isNotValid);
        return val;
    }

    /**
     * Prompts the user to enter an double within a minimum and maximum range.
     * In case of out-of-range or invalid input, displays an error message and
     * requests new input.
     * 
     * @param minValue The minimum allowed value.
     * @param maxValue The maximum allowed value.
     * @param message  The message displayed to the user before input.
     * @return double the double entered by the user within the specified range.
     */
    public static double inputDouble(double minValue, double maxValue, String message) {
        return inputDouble(minValue, maxValue, message, "Numero invalido. Por favor, vuelva a intentar...");
    }

    /**
     * Prompts the user to enter an double within a maximum range.
     * In case of out-of-range or invalid input, displays an error message and
     * requests new input.
     * 
     * @param maxValue     The maximum allowed value.
     * @param message      The message displayed to the user before input.
     * @param errorMessage The error message displayed if input is invalid.
     * @return double the double entered by the user within the specified range.
     */
    public static double inputDouble(double maxValue, String message, String errorMessage) {
        return inputDouble(0, maxValue, message, errorMessage);
    }


    /**
     * Prompts the user to enter an double within a minimum and maximum range, with
     * error
     * handling.
     * In case of out-of-range or invalid input, displays the specified error
     * message.
     * 
     * @param minValue     The minimum allowed value.
     * @param maxValue     The maximum allowed value.
     * @param message      The message displayed to the user before input.
     * @param errorMessage The error message displayed if input is invalid.
     * @return double the double entered by the user within the specified range.
     */
    public static double inputDouble(double minValue, double maxValue, String message, String errorMessage) {
        double val = 0;
        boolean isNotValid = false;
        do {
            System.out.print(message);
            try {
                val = scanner.nextDouble();
                scanner.nextLine(); // Consumes the newline
                isNotValid = val < minValue || val > maxValue;
                if (isNotValid) {
                    System.out.println(errorMessage);
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida. Intente nuevamente.");
                scanner.nextLine(); // Clears the buffer in case of error
            }
        } while (isNotValid);
        return val;
    }

    /**
     * Prompts the user to enter an integer.
     * In case of invalid input, displays an error message and requests new input.
     * 
     * @param message The message displayed to the user before input.
     * @return int the integer entered by the user.
     */
    public static int inputInt(String message) {
        return inputInt(message, "Numero invalido. Por favor, vuelva a intentar...");
    }

    /**
     * Prompts the user to enter an integer with error handling.
     * In case of invalid input, displays the specified error message.
     * 
     * @param message      The message displayed to the user before input.
     * @param errorMessage The error message displayed if input is invalid.
     * @return int the integer entered by the user.
     */
    public static int inputInt(String message, String errorMessage) {
        int val = 0;
        boolean isNotValid;
        do {
            System.out.print(message);
            try {
                val = scanner.nextInt();
                scanner.nextLine(); // Consumes the newline
                isNotValid = false;
            } catch (Exception e) {
                System.out.println(errorMessage);
                scanner.nextLine(); // Clears the buffer in case of error
                isNotValid = true;
            }
        } while (isNotValid);
        return val;
    }

    /**
     * Prompts the user to enter an integer within a maximum range.
     * In case of out-of-range or invalid input, displays an error message and
     * requests new input.
     * 
     * @param maxValue The maximum allowed value.
     * @param message  The message displayed to the user before input.
     * @return int the integer entered by the user within the specified range.
     */
    public static int inputInt(int maxValue, String message) {
        return inputInt(maxValue, message, "Numero invalido. Por favor, vuelva a intentar...");
    }

    /**
     * Prompts the user to enter an integer within a minimum and maximum range.
     * In case of out-of-range or invalid input, displays an error message and
     * requests new input.
     * 
     * @param minValue The minimum allowed value.
     * @param maxValue The maximum allowed value.
     * @param message  The message displayed to the user before input.
     * @return int the integer entered by the user within the specified range.
     */
    public static int inputInt(int minValue, int maxValue, String message) {
        return inputInt(minValue, maxValue, message, "Numero invalido. Por favor, vuelva a intentar...");
    }

    /**
     * Prompts the user to enter an integer within a maximum range.
     * In case of out-of-range or invalid input, displays an error message and
     * requests new input.
     * 
     * @param maxValue     The maximum allowed value.
     * @param message      The message displayed to the user before input.
     * @param errorMessage The error message displayed if input is invalid.
     * @return int the integer entered by the user within the specified range.
     */
    public static int inputInt(int maxValue, String message, String errorMessage) {
        return inputInt(0, maxValue, message, errorMessage);
    }

    /**
     * Prompts the user to enter an integer within a minimum and maximum range, with
     * error
     * handling.
     * In case of out-of-range or invalid input, displays the specified error
     * message.
     * 
     * @param minValue     The minimum allowed value.
     * @param maxValue     The maximum allowed value.
     * @param message      The message displayed to the user before input.
     * @param errorMessage The error message displayed if input is invalid.
     * @return int the integer entered by the user within the specified range.
     */
    public static int inputInt(int minValue, int maxValue, String message, String errorMessage) {
        int val = 0;
        boolean isNotValid = false;
        do {
            System.out.print(message);
            try {
                val = scanner.nextInt();
                scanner.nextLine(); // Consumes the newline
                isNotValid = val < minValue || val > maxValue;
                if (isNotValid) {
                    System.out.println(errorMessage);
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida. Intente nuevamente.");
                scanner.nextLine(); // Clears the buffer in case of error
            }
        } while (isNotValid);
        return val;
    }
}
