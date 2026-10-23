package c10_extras;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class ExtrasExercises {
    
    public static String message = "Soy una variable global de tipo string.";

    public static class Configuration {
        static String lenguaje = "Mi idoma es español.";
    }

    public static class User {
        final static String APP_NAME = "PlayStore";
        static String username = "Yahir";
        
        public static void showNames() {
            System.out.println("El nombre de tu app es: " + APP_NAME + " y el tu nombre de usuario es " + username);
        }
    }

    public static void main(String[] args) {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        String text = null;
        if (text != null && !text.isEmpty()) {
            System.out.println("Tiene un valor");
        } else {
            System.out.println("no tiene valor");
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        /*
        var scanner = new Scanner(System.in);
        System.out.println("Digita tu nombre: ");
        var name = scanner.nextLine();
        System.out.println("Digita tu edad: ");
        var age = scanner.nextInt();
        System.out.println("Tu nombre es " + name + " y tienes " + age + " años.");
        scanner.close();
        */

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        String message = "Soy una variable local tipo string";
        System.out.println(message);
        System.out.println(ExtrasExercises.message);

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        /* 
        var scanner = new Scanner(System.in);
        System.out.println("Digita un numero positivo o negativo:");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("Tu numero es positivo.");
        } else {
            System.out.println("Tu numero es negativo.");
        }

        scanner.close();
        */

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        System.out.println(Configuration.lenguaje);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        Random generador = new Random();
        int num1 = generador.nextInt(10) + 1;
        System.out.println("Tu número aleatorio es: " + num1);

        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
        Commentaries myExplainedClass = new Commentaries();
        myExplainedClass.showState();

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        User.showNames();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
        // Ejercicio completado
    }
}
