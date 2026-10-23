package c05_structures;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<String>();
        var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Yahir");
        names.add("Yozhura");
        names.add("Ash");

        System.out.println(names.size());

        // Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar los elementos

        names.set(2, "Ket");
        System.out.println(names.getLast());

        // Eliminar elementos

        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // Buscar elementos

        System.out.println(names.contains("Yahir"));
        System.out.println(names.contains("Ket"));

        // Limpiar ArrayList
        names.add("Yahir");
        System.out.println(names);
         
        names.clear();
        System.out.println(names.size());

       

    }
}