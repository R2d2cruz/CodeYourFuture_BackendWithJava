package ClassFifteen;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Vas a desarrollar un programa en Java que genere una contraseña aleatoria. 
 * Esta contraseña estará compuesta por una mezcla de letras mayúsculas, 
 * letras minúsculas y dígitos. 
 * La contraseña será almacenada en un arreglo de caracteres.
 * 
 * Para generar la contraseña, utilizarás un bucle for que repetirá la 
 * operación tantas veces como la longitud de la contraseña especificada por el usuario.
 * 
 * Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula, 
 * una letra minúscula y un dígito, usaré bucles do-while 
 * y while junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.
 * 
 * Finalmente, convertirás el arreglo de caracteres en un String con un bucle for 
 * y luego imprimirás la contraseña generada en la consola.
 */

public class ActivityOne {
    public static void passwordGenerator() {
        // Cambiar por un scanner.nextInt()
        int length = TerminalFunctions.inputInt(3, 20, "Ingrese longitud de la contraseña: ");

        char[] passwordChar = new char[length];
        boolean hayMayuscula;
        boolean hayMinisculas;
        boolean hayDigito;
        int typeOf;
        char charRandom;
        do {
            for (int i = 0; i < length; i++) {
                typeOf = (int) (Math.random() * 3);
                switch (typeOf) {
                    case 0 -> // char lower
                        charRandom = (char) (Math.random() * 26 + 97);
                    case 1 -> // char upper
                    charRandom = (char) (Math.random() * 26 + 65);
                    case 2 -> // digit
                    charRandom = (char) (Math.random() * 10 + 48);
                    default -> throw new AssertionError();
                }
                passwordChar[i] = charRandom;
            }
            hayDigito = false;
            hayMayuscula = false;
            hayMinisculas = false;
            for (char c : passwordChar) {
                hayDigito = hayDigito || Character.isDigit(c);
                hayMayuscula = hayMayuscula || Character.isUpperCase(c);
                hayMinisculas = hayMinisculas || Character.isLowerCase(c);
            }
        } while (!(hayDigito && hayMayuscula && hayMinisculas));

        String password = "";
        for (char c : passwordChar) {
            password += c;
        }

        System.out.println("Su nueva contraseña es: " + password);
    }
}
