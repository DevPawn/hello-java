package c05_structures;
/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        // Arrays de tipo numerico
        int[] value = new int[5];
        value[0] = 3;

        System.out.println(value);
        System.out.println(value[0]);
        System.out.println(value.length);

        // Arrays de tipo caracteres
        String[] names = {"Excalibur", "Executor", "Shadow", "Eater", "Avalon"};
        System.out.println(names);
        System.out.println(names.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(names[0]);
        names[0] = "Rosario";
        System.out.println(names[0]);
        
        // 3. Crea un ArrayList vacío.
        ArrayList<String> list1 = new ArrayList<String>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        // Creación de los 4 valores en el ArrayList
        list1.add("Hola");
        list1.add("todo");
        list1.add("mundo");
        list1.add("bello");

        System.out.println(list1.size());

        // Eliminación de un valor en el ArrayList
        list1.remove(3);
        System.out.println(list1.size());

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> set1 = new HashSet<>();
        
        set1.add("Yahir");
        set1.add("ratatata");

        System.out.println(set1.size());

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet..
        set1.add("Yahir");
        set1.add("Yozhura");
        System.out.println(set1.size());

        // 7. Elimina uno de los elementos del HashSet.
        set1.remove("Yahir");
        System.out.println(set1.size());

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> peoples = new HashMap<>();
        peoples.put("Yahir", "0998321611");
        peoples.put("Arara","02938477121");
        peoples.put("Koy","942145234342");
        System.out.println(peoples);

        // 9. Modifica uno de los contactos y elimina otro.
        peoples.put("Yahir", "948123"); // Reemplaza el valor de una clave
        System.out.println(peoples);

        peoples.remove("Koy"); // Eliminación de una clave y su elemento
        System.out.println(peoples);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] array = new String[2];
        array[0] = "9";
        array[1] = "6";

        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : array) {
            arrayList.add(s);
        }
        System.out.println(arrayList);

        // Transformar ArrayList en HashSet
        HashSet<String> set = new HashSet<>(arrayList);
        System.out.println(set);

        // Transformar HashSet en HashMap
        HashMap<String, String> map = new HashMap<>();
        for (String s : set) {
            map.put(s, s);
        }
        System.out.println(map);

    }
}