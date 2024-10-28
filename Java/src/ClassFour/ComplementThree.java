package ClassFour;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementThree} class contain method related to the activity:
 * En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se encuentra. 
 * Las categorías son las siguientes:
 * 
 * 1. Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".
 * 2. Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".
 * 3.Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".
 * 
 * El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario.
 */


public class ComplementThree {
    public static void ageVerification(){
        int age = TerminalFunctions.inputInt("Ingrese su edad: ");

        if (age >= 0) {
            if (age < 18) {
                System.out.println("Eres menor de edad");
            } else {
                if (age < 64) {
                    System.out.println("Eres adulto");
                } else {
                    System.out.println("Eres un adulto mayor");
                }
            }
        } else {
            System.out.println("Esa edad no es posible");
        }
    }
}
