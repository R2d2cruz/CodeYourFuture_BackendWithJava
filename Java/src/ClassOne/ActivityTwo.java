package ClassOne;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * 1. Declara una variable por cada uno de los siguientes tipos de dato, 
 * asignando un valor (nombre y valor de tu preferencia):
 * 
 *  boolean
 *  char
 *  String
 *  Int
 *  long
 *  float
 * 
 * 2. Imprime en consola el contenido de al menos tres de las variables que declaraste en el paso anterior.
 * 
 * 3. Declara una nueva variable para almacenar tu edad y otra para almacenar tu nombre e imprimir en 
 *    pantalla un texto que diga “Mi nombre es [nombre], y tengo [edad] años”.
 */

public class ActivityTwo {
    
    public static void dataType() {
        int intVal = 10;
        char charVal = 'C';
        boolean booleanVar = true;
        String stringVal = "Carlos Cruz";
        long longVal = 1000;
        float floatVal = 3.14159f;
        System.out.println("El int es : " + intVal);
        System.out.println("El char es : " + charVal);
        System.out.println("El boolean es : " + booleanVar);
        System.out.println("El string es : " + stringVal);
        System.out.println("El long es : " + longVal);
        System.out.println("El float es : " + floatVal);

        int age = 22;
        String name = "Carlos A Cruz U";
        System.out.println("Mi nombre es " + name + ", y tengo " + age + " años");
    }

    
}
