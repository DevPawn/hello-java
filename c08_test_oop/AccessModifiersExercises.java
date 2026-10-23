package c08_test_oop;

/*
Clase 60 - Ejercicios: Modificadores de acceso
Vídeo: https://youtu.be/JOAqpdM36wI?t=23202
*/

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var person1 = new Person("Yahir", 22);
        System.out.println("Tu nombre es " + person1.getName() + " y tu edad es de " + person1.getAge());

        person1.setName("Athme");
        person1.setAge(23);
        System.out.println("Tu nombre es " + person1.getName() + " y tu edad es de " + person1.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var product = new Product(22.10);
        product.setPrice(1);
        
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var account1 = new BankAccount(23.6);
        account1.deposit(2);
        account1.withdraw(0.6);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var book = new Book("Alexander sale del closet");
        // book.name = "Alexander sale del closet";
        System.out.println("Tu libro es " + book.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperature = new Temperature(23.4);
        temperature.setCelsius(-101);

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var user1 = new User("Alexander","SOY GAY");
        user1.checkPassword("SOY GAY");

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var employee1 = new Employee(430);
        System.out.println("Tu salario es de: " + employee1.getSalary());
        employee1.raiseSalary(0);
        System.out.println("Tu salario es de: " + employee1.getSalary());

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rectangle1 = new Rectangle(23,5);
        rectangle1.setWidth(3);
        rectangle1.setHeight(42.6);
        rectangle1.calculateArea();

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var student1 = new Student(20);
        student1.isPassed();
        student1.setGrade(67);
        student1.isPassed();

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var car1 = new Car(0);
        car1.accelerate(100);
        car1.brake(100);

    }
}