package c02_operators;
public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int sum = 24 + 1;
        int difference = 41 - 20;
        int product = 4 * 2;
        int quotient = 40 / 6;
        int remainder = 20 % 2;

        // 2. Crea una variable para cada tipo de operación de asignación.
        int a = 2;
        a += 3; // a + 3
        a -= 2; // a - 2
        a *= 4; // a * 4
        a /= 2; // a / 2
        a %= 3; // a % 3
        System.out.println(a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a == 0);
        System.out.println(a != 2);
        System.out.println(a < 59);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a <= -1);
        System.out.println(a > 2);
        System.out.println(a >= 69);
        // 5. Utiliza el operador lógico and.
        System.out.println(a == 0 && 10 > 2);
        System.out.println(4 != 25 && 10 + 5 == 15);
        System.out.println(2 >5 && 0 != 2);

        // 6. Utiliza el operador lógico or.
        System.out.println(20 > 12 || true);
        System.out.println(5 > 8 || 2 != 2);
        System.out.println(90 < 1 || 4 * 2 == 8);

        // 7. Combina ambos operadores lógicos.
        System.out.println(3 < 2 && 0 != a || 4 * 2 == 2); // El operador AND se evalúa antes que el OR
        System.out.println(10 > 8 || false && 3 != a);

        // 8. Añade alguna negación.
        System.out.println(!true);
        System.out.println(1 == 0  || !(10 < 5 + 6));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int u = 3;
        System.out.println(++u);
        System.out.println(u++);
        System.out.println(u);
        System.out.println(--u);
        System.out.println(u--);
        System.out.println(u);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(2 % 4 == 2 && 6 + 3 < 2 || !(8 * 3 >= 24));
    }
}