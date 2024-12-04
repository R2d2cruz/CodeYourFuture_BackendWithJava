package ClassTwentyOne;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * Crea un método llamado "factorial()" que tome un parámetro de tipo "int" 
 * y devuelva un valor entero que corresponda al cálculo del factorial del número proporcionado. 
 * Posteriormente, intenta modificar la lógica para resolverlo de manera recursiva.
 */

public class ActivityTwo {
    public static void factorialWithRecursivity() {
        int n = 3;
        System.out.println("Factorial normal: " + factorial(n));
        System.out.println("Factorial recursivo: " + factorialRecursiva(n));
    }

    public static int factorial(int n){
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static int factorialRecursiva(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorialRecursiva(n - 1);
    }
}
