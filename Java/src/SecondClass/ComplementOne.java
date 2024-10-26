package SecondClass;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * 1. Pide al usuario que ingrese su año de nacimiento y 
 *    almacena el dato en una variable previamente declarada llamada añoNacimiento.
 * 2. Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.
 * 3. Calcula la edad actual del usuario, considerando que la cuenta sería ANIOACTUAL - añoNacimiento. 
 *    Almacena el dato en una variable llamada calculoEdad.
 * 4. Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un mensaje apropiado.
 */

public class ComplementOne {
    public static void AgeVerification() {
        final int ACTUALYEAR = 2024;
        int birthYear = TerminalFunctions.inputInt("Ingrese año de nacimiento: ");
        int age = ACTUALYEAR - birthYear;
        System.out.println("La persona es mayor de edad? " + (age >= 18));
    }
}
