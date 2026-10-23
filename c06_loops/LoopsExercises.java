/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 1;
        while (index != 11) {
            System.out.println(index);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> names = new ArrayList<String>();
        names.add("Yahir");
        names.add("Pawn");

        index = 0;
        do {
            System.out.println(names);
            index++;
        } while(index==0);

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        int numb = 1;
        for ( index = 0; index <= 10; index++) { 
            if (numb == 1) {
                System.out.println(numb);
                numb = 5;
            } else{
                System.out.println(numb);
                numb= numb + 5;
        
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("La suma total es: " + sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int ind = 0; ind < numbers.length; ind++) {
            System.out.println(numbers[ind]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> names1 = new HashSet<>();
        names1.add("Yoz");
        names1.add("Yah");

        HashMap<String, String> namesMap = new HashMap<>();
        namesMap.put("Yoz", "Yahir");
        namesMap.put("Yah", "Yahaira");

        for (String name: names1) {
            System.out.println(name);
        }   

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] numbers2 = {1, 2, 3, -4, 5};
        for (int n : numbers2) {
            if (n < 0) {
                break;
            }
            System.out.println(n);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int number = 5; // Número para calcular el factorial
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // 1, 1*2, 1*2*3, 1*2*3*4, 1*2*3*4*5
        }
        System.out.println("El factorial de " + number + " es: " + factorial);
    }
}