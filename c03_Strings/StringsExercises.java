package c03_Strings;
public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String firstName= "Yahir";
        String lastName = "Flores";
        System.out.println(firstName + " " + lastName);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(firstName.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(firstName.charAt(0));
        System.out.println(firstName.charAt(firstName.length() - 1));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(lastName.toUpperCase());
        System.out.println(lastName.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(firstName.contains("Yahir"));
        System.out.println(firstName.contains("Flores"));

        // 6. Formatea un string con un entero.
        var age = 22;
        System.out.println("Hola, " + firstName + ". Tengo " + age + "años.");
        System.out.println(String.format("Hola, soy %s y tengo %d años.", firstName, age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" Hola a todos ".trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Hola a todos ustedes muchachos.".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(firstName.equals(lastName));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(firstName.length() == lastName.length());
    }
}