package c04_conditionals;
public class Conditionals {
    public static void main(String[] args) {
        
        // Condicionales

        var age = 18;

        System.out.println(age >= 18);

        if (age > 18) {
            System.out.println("El usuario es mayor de edad.");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir 18 años.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }

        // switch
        var day = 4;

        switch (day) {
            case 1 :
                System.out.println( "Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
            System.out.println("No es Lunes, Martes o Miercoles.");
        }
    }    
}
