package c09_exceptions;

public class Exceptions {
    
    public static void main(String[] args) {

        // Manejo de excepciones

        // try con múltiples catch
        try {
            var result = 10 / 0;
            System.out.println(result);
            
            var name = "Yahir";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido un null pointer mitico.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error no esperado.");
        }

        // finally
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Fin del bloque try-catch");
        }

        // throw
        var throwExample = new ThrowExample();
        try { 
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }
        
        // Excepción personalizada
        try {
            throwExample.checkScore(45);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuación: " + e.getMessage());
        }
        
        System.out.println("Fin");
    }
}
