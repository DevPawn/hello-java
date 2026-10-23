package c04_conditionals;
public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int age = 22;
        
        if (age > 18) {
            System.out.println("Puedes votar.");
        } else if (age == 18) {
            System.out.println("Felicidades, puedes votar por primera vez.");
        } else {
            System.out.println("No puedes votar aún.");
        }
        
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 1;
        int num2 = 1;
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El número " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los números son iguales.");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int number = -1;
        if (number > 0) {
            System.out.println(number + " es un número positivo.");
        } else if (number < 0) {
            System.out.println(number + " es un número negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int num = 2;
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int n = 34;
        if (n >= 1 && n <= 100) {
            System.out.println("El número " + n + " está en el rango de 1 a 100.");
        } else {
            System.out.println("El número " + n + " no está en el rango de 1 a 100.");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var day = 7;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día no válido.");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int grade = 74;

        if (grade == 100) {
            System.out.println("Sobresaliente");
        } else if (grade >= 75){
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspendido");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad = 1;
        var comp = true;

        if (edad >= 15) {
            System.out.println("Permitida la entrada.");
        } else if (comp == true) {
            System.out.println("Permitida la entrada.");
        } else {
            System.out.println("Entrada no permitida.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String letter = "U";

        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
            System.out.println(letter + " es una vocal.");
        } else {
            System.out.println(letter + " es una consonante.");
        }
        
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int nu1 = 1113;
        int nu2 = 382;
        int nu3 = 239;

        if (nu1 > nu2 && nu1 > nu3) {
            System.out.println(nu1 + " es el mayor número de los tres.");
        } else if (nu2 > nu1 && nu2 > nu3) {
            System.out.println(nu2 + " es el mayor número de los tres.");
        } else {
            System.out.println(nu3 + " es el mayor número de los tres.");
        }

    }
}