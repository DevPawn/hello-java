package c01_beginner;
public class DataTypes {
    public static void main(String[] args) {

        // Tipos de datos primitivos

        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.23;
        System.out.println(myDouble);

        char myChar = 'S'; // Para caracteres se usan las comillas simples y no las dobles
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, soy un String";
        System.out.println(myString);

        // Tipo de dato en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());
    }
}
