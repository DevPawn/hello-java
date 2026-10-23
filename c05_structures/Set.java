package c05_structures;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();
        
        // tamaño 
        System.out.println(names.size());

        // Añadir elementos

        names.add("Yahir");
        names.add("Yozhura");
        names.add("YozhuraDev");
        names.add("yozhura130@gmail.com");
        System.out.println(names.size());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        // Eliminar elementos

        names.remove("Yahir");
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Yahir"));
        System.out.println(names.contains("yozhura130@gmail.com"));

        names.add("Yozhura");
        names.add("Yozhura");
        names.add("Yozhura");
        System.out.println(names);
 
        // Conjuntos

        //names.addAll(numbers.toString());

        var countries = new HashSet<String>();
        countries.add("Ecuador");
        countries.add("México");
        countries.add("Argentina");
        countries.add("Yozhura");
        
        names.addAll(countries);
        
        System.out.println(names);

        names.removeAll(countries);
        
        System.out.println(names);

        names.retainAll(countries);

        System.out.println(names);
    }
}