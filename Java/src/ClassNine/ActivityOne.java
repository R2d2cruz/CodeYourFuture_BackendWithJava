package ClassNine;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa que cumpla con las siguientes condiciones:
 * 
 * 1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).
 * 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.
 *    De Celsius a Fahrenheit	De Fahrenheit a Celsius
 *    [°F] = ([°C] × 9 ⁄ 5) + 32	[°C] = ([°F] − 32) × 5 ⁄ 9
 * 3. El programa debe manejar al menos las siguientes situaciones:
 * 
 * Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
 * Si ingresa una temperatura no válida, mostrará un mensaje de error.
 */

public class ActivityOne {
    public static void tempConvertion() {
        double temperature;
        char um = TerminalFunctions.inputChar("Ingrese unidad de medida: ");
        double c;
        double f;
        double k;
        switch (um) {
            case 'c', 'C' -> {
                temperature = TerminalFunctions.inputDouble(-273.15, 1000000000, "Ingresa la temperatura (ºC): ",
                        "Temperatura no valida");
                f = (temperature * 9 / 5) + 32;
                k = temperature + 273.15;
                System.out.println(temperature + "ºC corresponde a " + f + " ºF, o tambien a " + k + " K");
            }
            case 'k', 'K' -> {
                temperature = TerminalFunctions.inputDouble(1000000000, "Ingresa la temperatura (k): ",
                        "Temperatura no valida");
                c = temperature - 273.15;
                f = (c * 9 / 5) + 32;
                System.out.println(temperature + "k corresponde a " + f + " ºF, o tambien a " + c + " ºC");
            }
            case 'f', 'F' -> {
                temperature = TerminalFunctions.inputDouble(-459.67, 1000000000, "Ingresa la temperatura (ºF): ",
                        "Temperatura no valida");
                c = (temperature - 32) * 5 / 9;
                k = c + 273.15;
                System.out.println(temperature + "ºF corresponde a " + c + " ºC, o tambien a " + k + " K");
            }

            default -> System.out.println("Unidad de medida desconocida, no es posible convertir");
        }
    }

}
