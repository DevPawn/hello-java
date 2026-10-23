package c05_structures;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tramaño

        System.out.println(names.size());

        // Añadir elementos

        names.put("Yahir", "yahir@gmail.com");
        names.put("Yozhura","yozhura@gmail.com");
        names.put("Antonio","antonio@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos

        System.out.println(names.get("Yahir"));
        System.out.println(names.get("moure"));

        // Verificar elementos

        System.out.println(names.containsKey("Yahir"));
        System.out.println(names.containsKey("moure"));

        System.out.println(names.containsValue("yahir@gmail.com"));
        
        // Eliminar elementos

        System.out.println(names.remove("Yahir"));
        System.out.println(names.remove("Yozhura"));
        System.out.println(names);

        // Limpiar HashMap
        names.clear();
        System.out.println(names);

        // Madificación de elementos

        names.put("Yahir", "yahir@gmai.com");
        System.out.println(names);
       
        names.put("Yahir", "yahir130@gmai.com");
        System.out.println(names);

        names.replace("Yozhura","yozhura@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Yozhura", "yohzura@gmail.com"); // Solo si no existe
        System.out.println(names);

        // Otras operaciones
        
        System.out.println(names.isEmpty());
        System.out.println(names.values());
        System.out.println(names.keySet());
    }
    
}
