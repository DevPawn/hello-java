package c08_oop;

import java.util.ArrayList;


public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        /*var book = new Book();
        book.title = "Harry Potter";
        book.author = "J.K. Rowling";
        book.showData();
        */

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("Harry Potter","J.K. Rowling");
        book2.showData();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        // Method without builder
        var car = new Car();
        car.brand = "Toyota";
        car.model = "Arando";
        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student(60);
        student.approved();

        var student2 = new Student(0);
        student2.approved();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var account1 = new BankAccount(20);
        account1.deposit(14.50);
        
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle1 = new Rectangle(4, 2);
        rectangle1.area();
        rectangle1.perimeter();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker1 = new Worker("Yahir",400);
        worker1.showSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var peopleList = new ArrayList<Person>();

//        var person1 = new Person("Alexander", 22);
//        var person2 = new Person("Leonando", 24);
//        var person3 = new Person("Yahir", 22);

//        peopleList.add(person1);
//        peopleList.add(person2);
//        peopleList.add(person3);

        System.out.println(peopleList);
        
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var product1 = new Product(150);
        product1.applyDiscount(20);
    }
}