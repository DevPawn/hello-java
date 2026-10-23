package c03_Strings;
public class Strings {
    public static void main(String[] args) {

        // Cadenas de texto

        String name = "Yahir";
        var surname = new String("Flores");

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Yahir"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));
        System.out.println(name.contains("Yahir"));

        // Comparación
        System.out.println(name.equals("Yahir"));
        System.out.println(name.equals("yahir"));
        System.out.println(name.equalsIgnoreCase("yahir"));

        // == vs. equals

        var a = "Yahir";
        var b = "Yahir";
        var c = new String("Yahir");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Trim
        System.out.println(" Hola me llamo Yahir ".trim());

        // Replace
        System.out.println(" Hola, me llamo Yahir ".replace(" ",""));

        // Format
        var age = 37;
        System.out.println(String.format("Hola, %s. Tengo %d años.", name, age));
    }
}