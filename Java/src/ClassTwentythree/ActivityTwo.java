package ClassTwentythree;

/*
 * The {@code ActivityTwo} class contain method related to the activity:
 * 1. Crea una clase llamada Auto
 * 
 * 2. Define 3 atributos para la clase: marca, modelo y año. 
 * 
 * 3. Crea los siguientes constructores:
 * 
 *    a. Constructor que inicialice marca, modelo y año
 *    b. Constructor que inicialice marca y modelo 
 *    c. Constructor que inicialice solamente la marca
 *    d. Constructor sin parámetros
 * 
 * 4. Escribe el método “imprimirDatos” dentro de la clase “Auto”, que al ser invocado imprima en consola su marca, modelo y año. 
 *    Teniendo en cuenta que algunos atributos pueden no ser inicializados, 
 *    el método “print” debe detectar e imprimir sólo aquellos atributos con valor asignado o mostrar un mensaje en el caso de haber sido inicializado con el constructor sin parámetros. 
 * 
 * 5. Crea al menos 4 objetos para poder probar todos los constructores de la clase, con diferentes valores y muestra sus atributos en la consola.
 */

public class ActivityTwo {
    public static void main(String[] args) {
        carConstructor();
    }

    public static void carConstructor() {
        Car[] carArray = {
                new Car(" Dodge", " Charger", 1970),
                new Car("Chevrolet", "Camaro"),
                new Car("Aston Martin"),
                new Car()
        };
        for (Car car : carArray) {
            car.printData();
        }
    }
}
