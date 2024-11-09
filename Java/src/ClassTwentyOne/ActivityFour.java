package ClassTwentyOne;

public class ActivityFour {
    private static String sentence = "";

    public static void main(String[] args) {

    }

    public static void menu() {
        System.out.println("-----------");
        System.out.println("1. " + (sentence.isEmpty() ? "Crear oracion" : "Borrar oracion"));
        System.out.println("2. Contar caracteres");
        System.out.println("3. Contar palabras.");
        System.out.println("4. Ordenar palabras alfabeticamente.");
    }
}
