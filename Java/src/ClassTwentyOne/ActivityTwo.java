package ClassTwentyOne;

public class ActivityTwo {
    public static void main(String[] args) {
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
