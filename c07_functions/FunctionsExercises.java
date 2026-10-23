package c07_functions;
// Librerias
import java.util.Arrays;
import java.util.ArrayList;

//

public class FunctionsExercises {
    
    // Tabla De Funciones

    // Ejercicio 1
    
    public static void welcomeToJavaCourse() {
        System.out.println("Te doy la bienvenida al curso de Java desde cero!");
    }

    // Ejercicio 2

    public static void greetingToYou(String name){
        System.out.println("Muy buenos dias " + name);
    }
    
    // Ejercicio 3

    public static void subtractionOfNumbers(int n1, int n2) {
        int subs = n1 - n2;
        System.out.println("Tu resta es: " + subs);
    }

    // Ejercicio 4
    
    public static void squareOfNumber(int n) {
        int square = n * n;
        System.out.println("Tu numero " + n + " al cuadrado es: " + square);
    }
    
    // Ejercicio 5

    public static boolean sortNumbers(int n) {
        return n % 2 == 0;
    }

    // Ejercicio 6

    public static boolean ageSort(int age) {
        return age >= 18;
    }

    // Ejercicio 7

    public static int measureStr(String cad) {
        return cad.length();
    }

    // Ejercicio 8

    public static double middleCalculate(int[] num) {
        double suma = 0;
        for (int i = 0; i < num.length; i++){
            suma += num[i]; // 1 3 4 5
        }
        return suma / num.length; // 13 / 4 = 3.25
    }

    // Ejercicio 9
    
    public static long factorialCalculate(int n) {
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    //Ejercicio 10
    
    public static void showList(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    // Ejercicios: Funciones
    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".#
        welcomeToJavaCourse();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        greetingToYou("Yahir");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        subtractionOfNumbers(5, 3);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        squareOfNumber(3);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        var state = sortNumbers(2);
        if (state) {
            System.out.println("Tu número es par.");
        } else {
            System.out.println("Tu número es impar.");
        }
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        var age = ageSort(19);
        if(age) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        int amountOfWords = measureStr("hola a todos");
        System.out.println("Tu cantidad es: " + amountOfWords);
        
        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        int[] myNumbs = {1, 3 ,4 ,5};
        double results = middleCalculate(myNumbs);
        System.out.println("Tu media es: " + results);

        // 9. Escribe un método que reciba un número y retorna su factorial.
        int num = 5;
        System.out.println("El fatorial de " + num + " es: " + factorialCalculate(num));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> words = new ArrayList<>();
        words.add("Hola");
        words.add("Buenas");
        showList(words);
        
    }
}