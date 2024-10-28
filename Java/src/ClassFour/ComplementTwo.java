package ClassFour;

import Utils.TerminalFunctions;

/*
 * The {@code ComplementTwo} class contain method related to the activity:
 * En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto 
 * y determinará si tiene derecho a un descuento. 
 * Si el precio es igual o mayor a $100, se aplicará un descuento del 10% 
 * y se mostrará el nuevo precio con descuento. 
 * De lo contrario, se mostrará el precio original sin descuento.
 */

public class ComplementTwo {
    public static void discount(){
        double price = TerminalFunctions.inputDouble("Ingrese precio: ");

        if (price >= 100) {
            System.out.println("El producto tiene descuento. Su precio final es " + (0.9 * price));
        } else {
            System.out.println("El producto no tiene descuento. Su precio final es " + price);
        }
    }
}
