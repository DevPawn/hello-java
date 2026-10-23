package c01_beginner;
public class VariablesAndConstants {
    public static void main(String[] args) {
        // Variables
        String name = "Yahir";
        System.out.println(name);

        name = "Yahir Flores";
        System.out.println(name);

        // name = 22; Error (no podemos cambiar el tipo de dato)

        int age = 22;
        System.out.println(age);

        var email = "yozhura@gmail.com";
        System.out.println(email);

        var year = 2026;
        System.out.println(year);

        // Constantes

        final String EMAIL = "yahir@gmail.com"; // Las constantes se ponen en mayúscular
        // final convierte la variable en una constante
        // email = "yoz@gmail.com"; Error (no se puede cambiar el valor de una constante)
        System.out.println(EMAIL);
    }
}
