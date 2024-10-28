package ClassFour;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementOne} class contain method related to the activity:
 * En este ejercicio, escribirás un programa que pida al usuario una contraseña 
 * y verificará si coincide con una contraseña predefinida. 
 * Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido". 
 * En caso contrario, se mostrará un mensaje de "Acceso denegado".
 */

public class ComplementOne {
    public static void security(){
        final String PASSWORD = "Rainbow";

        String password = TerminalFunctions.inputString("Ingrese la Contraseña: ");

        if (PASSWORD.equals(password)) {
            System.out.println("Contraseña verificada. Acceso concedido.");
        } else {
            System.out.println("Contraseña erronea. Acceso no autorizado.");
        }
    }
}
