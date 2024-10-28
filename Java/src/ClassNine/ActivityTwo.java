package ClassNine;

import Utils.TerminalFunctions;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * Escribe un programa que solicite al usuario que ingrese una contraseña 
 * y verifique si cumple con los siguientes criterios para considerarse segura:
 * -La contraseña debe tener al menos 8 caracteres.
 * -La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
 * -La contraseña debe contener al menos un número.
 * 
 * La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
 * El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. 
 * Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.
 */

public class ActivityTwo {
    public static void securityVerification() {
        String password = TerminalFunctions.inputString("Ingrese contraseña: ");

        if (password.length() >= 8) {
            if (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$")) {
                System.out.println("Contraseña suficientemente segura.");
            } else {
                if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
                    System.out.println("Debe contener mayúsculas y minúsculas.");
                }
                if (!password.matches(".*\\d.*")) {
                    System.out.println("Debe contener al menos un número.");
                }
                if (!password.matches(".*[@$!%*?&].*")) {
                    System.out.println("Debe contener al menos un carácter especial.");
                }
            }
        } else {
            System.out.println("Contraseña muy corta");
        }

    }
}
