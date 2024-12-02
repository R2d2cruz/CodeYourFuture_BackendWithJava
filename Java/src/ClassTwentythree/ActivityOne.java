package ClassTwentythree;

/*
 * The {@code ActivityOne} class contain method related to the activity:
 * 1. Crea una clase llamada Persona.
 * 
 * 2. Define 2 atributos para la clase: nombre y edad.
 * 
 * 3. Crea una método llamado imprimirDatos para imprimir la presentación de una persona en consola mostrando sus atributos.
 * 
 * 4. Asegúrate de incluir dentro de tu proyecto una clase que contenga un método main, el cual será el punto para ejecutar tu proyecto.
 *    En ella, crea un objeto a partir de una instancia de la clase “Persona”.
 * 
 * 5.Ejecuta el método que imprime la presentación de dicha persona en consola.
 * 
 * 6. Crea un nuevo objeto del tipo Persona.
 * 
 * 7. Imprime por consola, invocando al método correspondiente, los datos de dicho objeto. 
 */

public class ActivityOne {
    public static void personClassCreator() {
        Person person = new Person();
        person.name = "Carlos Arturo Cruz Useche";
        person.age = 22;
        System.out.println("Utilizando la funcion de la clase Person:");
        person.printData();
        System.out.println("\nSin utilizar la funcion de la clase Person:");
        System.out.printf("Nombre: %s\nEdad: %d\n", person.name, person.age);
    }
}
