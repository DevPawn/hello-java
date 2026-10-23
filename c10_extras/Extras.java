package c10_extras;

import java.util.Scanner;

import c08_oop.Classes;
import c08_oop.Person;
// import c08_oop.*;

public class Extras {

    static String globalName = "Yahir";
    
    public static void main(String[] args) {

        // Extras

        // null

        String name = "Yahir";
        name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }
    
        // import
        new Person("Yahir", 13, "421412");
        new Classes();

        // Scanner
        var scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("Tu edad es: " + age);

        // Scope: variables globales y locales
        test();

        // static
    }

    public static void test() {
        System.out.println(globalName);
    }
}
