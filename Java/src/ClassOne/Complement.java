package ClassOne;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * 
 * Refinando la definición del tipo de variable más adecuado:
 * 1. Declara una variable llamada mensajeBienvenida y asigna como valor "Bienvenido a Java". 
 *    Asegúrate de elegir el tipo de variable más apropiado para almacenar un mensaje de texto.
 * 2. Declara una variable llamada temperaturaActual y asigna como valor "19". 
 *    Selecciona el tipo de variable que permita representar la temperatura de manera precisa.
 * 3. Declara una variable llamada datoLogico y asigna como valor "true". 
 *    Elige el tipo de variable adecuado para almacenar valores lógicos.
 * 4. Utiliza la función System.out.println() para imprimir cada variable declarada, 
 *    concatenándola con un mensaje descriptivo que aporte contexto.
 */


public class Complement {
    public static void complementOuts(){
        String welcomeMessage = "Bienvenido a Java";
        double actualTemperature = 19;
        boolean logicData = true;

        System.out.println(welcomeMessage);
        System.out.println("La temperatura actual es " + actualTemperature);
        System.out.println("Su dato logico es " + logicData);
    }
}
