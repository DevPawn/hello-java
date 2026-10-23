package c09_exceptions;

public class ExceptionsExercises {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println("El resultado de tu division es " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error detectado: " + e);
        } finally {
            System.out.println("Fin de try-catch 1.");
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        int[] myArray = new int[3];
        myArray[0] = 4;
        myArray[1] = 2;
        myArray[2] = 8;

        try {
            System.out.println(myArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error detectado: " + e);
        } finally {
            System.out.println("Fin de try-catch 2.");
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        String cadena = null;

        try {
            System.out.println(cadena.length());
        } catch (NullPointerException e) {
            System.out.println("Error detectado: " + e);
        } finally {
            System.out.println("Fin de try-catch 3.");
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        textToNum("e");

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        int r = 53;
        int r1 = 1;
        try {
            int re = (r + r1) * -2;
            System.out.println("Tu numero es " + re);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Fin obligatorio de try-catch 5");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        checkAge(15);

        try {
            checkAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        TemperatureChecker temp = new TemperatureChecker();
        temp.checker(42);
        
        try {
            temp.checker(54);
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        int numerador = 10;
        int[] divisores = {2,0,5};

        int indiceElegido = 1;

        try {
            int divisor = divisores[indiceElegido];
            int resultado = numerador / divisor;
            System.out.println("el resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error atrapado: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Fin de try-catch con 2 catch doble.");
        }
 
        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        try {
            checkPassword("a");
        } catch (ShortPassword e) {
            System.out.println("Error: " + e);
        }

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        var user1 = new LoginSystem("Yahir","2131");
        
        try {
            user1.checkLogin("Yahir","2131");
        } catch (LoginFailedException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("fin de ultimo try-catch.");
        }
    }

    // Ejercicio 4
    public static void textToNum(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Exito, tu texto ahora es tun entero: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Fallo, tu metodo dio: " + e);
        } finally {
            System.out.println("Fin de funcion try-catch");
        }
    }

    // Ejercicio 6
    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Error: No se puede ser un numero negativo");
        }
        System.out.println("Registro exitoso: Tu edad es " + age);
    }

    // Ejercicio 7
    public static class InvalidTemperatureException extends RuntimeException {
        public InvalidTemperatureException(String message) {
            super(message);
        }
    }
    
    public static class TemperatureChecker {
        public void checker(double degree) {
            if (degree < -50 || degree > 50) {
                throw new InvalidTemperatureException("Alerta tu temperatura es de: " + degree + " grados.");
            }
            System.out.println("La temperatura " + degree + " es segura.");
        }
    }

    // Ejercicio 9
    public static class ShortPassword extends RuntimeException {
        public ShortPassword(String message) {
            super(message);
        }
    }

    public static void checkPassword(String pass) {
        if (pass.length() < 8) {
            throw new ShortPassword("Tu contraseña es muy corta.");
        }
        System.out.println("Tu contraseña es perfecta");
    }

    // Ejercicio 10
    public static class LoginFailedException extends RuntimeException {
        public LoginFailedException(String message) {
            super(message);
        }
    }

    public static class LoginSystem {
        String user;
        String pass;

        public LoginSystem(String user, String pass) {
            this.user = user;
            this.pass = pass;
        }

        public void checkLogin(String user, String pass) {
            if (!this.user.equals(user) || !this.pass.equals(pass)) {
                throw new LoginFailedException("Tu usuario o contraseña es incorrecta.");
            }
            System.out.println("Te registraste perfectamente.");
        }
    }
}