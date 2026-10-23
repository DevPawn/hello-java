package c01_beginner;
public class BeginnerExercises {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myName = "Yahir";
        System.out.println("My name is " + myName);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myAge = 22;
        System.out.println("my age is "+ myAge);
        
        // 3. Crea una variable double con tu altura en metros.
        double myHeight = 1.67;
        System.out.println("My height is " + myHeight + " meters.");
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likesProgramming = true;
        System.out.println("Do I like programming? " + likesProgramming);

        // 5. Declara una constante con tu email.
        final String EMAIL = "yahir@gmail.com";
        System.out.println("My email is " + EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'Y';
        System.out.println("My initial is " + initial + ".");

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String city = "Guayaquil";
        System.out.println("I live in " + city + ".");
        city = "Mucho lote";
        System.out.println("In a street place " + city + ".");

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 234;
        int b = 62;
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);
        System.out.println("The sum of a and b is: " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("The type of variable a is: " + ((Object)a).getClass().getSimpleName());
        System.out.println("The type of variable city is: " + city.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int uninitializedVariable;
        uninitializedVariable = 45;
        System.out.println("The value of the uninitialized variable is: " + uninitializedVariable);
    }
}