package Utils;

import java.util.Scanner;

/**
 * The TerminalFunctions class provides methods to interact with the console.
 * It includes methods to initialize and close the Scanner, clear the terminal, 
 * wait for user input, and read different data types (String, double, int) with error handling.
 */
public class TerminalFunctions {
    private static Scanner scanner;

    /**
     * Initializes the Scanner for input from System.in.
     * This method should be called before using other methods that require user input.
     */
    public static void init() {
        scanner = new Scanner(System.in);
    }

    /**
     * Closes the Scanner if it is open and sets it to null to prevent further usage.
     * It is recommended to call this method at the end of the program to release the resource.
     */
    public static void close() {
        if (scanner != null) {
            scanner.close();
            scanner = null;
        }
    }

    /**
     * Clears the terminal using an ANSI escape command to move the cursor to the top
     * and clear the screen. Works on ANSI-compatible systems (e.g., Linux and macOS).
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
     * @return Scanner the Scanner instance for reading from the console.
     */
    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    /**
     * Prompts the user to enter a string of text.
     * @param message The message displayed to the user before input.
     * @return String the user's input as a string.
     */
    public static String inputString(String message) {
        System.out.println(message);
        String outString = scanner.nextLine();
        return outString;
    }

    /**
     * Prompts the user to enter a decimal number.
     * In case of invalid input, displays an error message and requests new input.
     * @param message The message displayed to the user before input.
     * @return double the decimal number entered by the user.
     */
    public static double inputDouble(String message) {
        return inputDouble(message, "Invalid number, please enter again");
    }

    /**
     * Prompts the user to enter a decimal number with error handling.
     * In case of invalid input, displays the specified error message.
     * @param message The message displayed to the user before input.
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
                scanner.nextLine();  // Consumes the newline
                isNotValid = false;
            } catch (Exception e) {
                System.out.println(errorMessage);
                scanner.nextLine();  // Clears the buffer in case of error
                isNotValid = true;
            }
        } while (isNotValid);
        return val;
    }

    /**
     * Prompts the user to enter an integer.
     * In case of invalid input, displays an error message and requests new input.
     * @param message The message displayed to the user before input.
     * @return int the integer entered by the user.
     */
    public static int inputInt(String message) {
        return inputInt(message, "Invalid number, please enter again");
    }

    /**
     * Prompts the user to enter an integer with error handling.
     * In case of invalid input, displays the specified error message.
     * @param message The message displayed to the user before input.
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
                scanner.nextLine();  // Consumes the newline
                isNotValid = false;
            } catch (Exception e) {
                System.out.println(errorMessage);
                scanner.nextLine();  // Clears the buffer in case of error
                isNotValid = true;
            }
        } while (isNotValid);
        return val;
    }

    /**
     * Prompts the user to enter an integer within a maximum range.
     * In case of out-of-range or invalid input, displays an error message and requests new input.
     * @param maxValue The maximum allowed value.
     * @param message The message displayed to the user before input.
     * @return int the integer entered by the user within the specified range.
     */
    public static int inputInt(int maxValue, String message) {
        return inputInt(maxValue, message, "Invalid number, please enter again");
    }

    /**
     * Prompts the user to enter an integer within a maximum range, with error handling.
     * In case of out-of-range or invalid input, displays the specified error message.
     * @param maxValue The maximum allowed value.
     * @param message The message displayed to the user before input.
     * @param errorMessage The error message displayed if input is invalid.
     * @return int the integer entered by the user within the specified range.
     */
    public static int inputInt(int maxValue, String message, String errorMessage) {
        int val = 0;
        boolean isNotValid = false;
        do {
            System.out.print(message);
            try {
                val = scanner.nextInt();
                scanner.nextLine();  // Consumes the newline
                isNotValid = val < 0 || val > maxValue;
                if (isNotValid) {
                    System.out.println(errorMessage);
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
                scanner.nextLine();  // Clears the buffer in case of error
            }
        } while (isNotValid);
        return val;
    }
}
