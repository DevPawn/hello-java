package c08_test_oop;
import java.util.ArrayList;

public class AbstractionExercises {

    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        var circle = new Circle(23);
        var rectangle = new Rectangle(20,10);
        circle.calculateArea();
        rectangle.calculateArea();

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        var guitar = new Guitar();
        var piano = new Piano();
        guitar.play();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(new Dog());
        myAnimals.add(new Cat());

        for (Animal animal : myAnimals) {
            animal.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        var circle2 = new Circle2();
        var square = new Square();
        var triangle = new Triangle();
        circle2.draw();
        square.draw();
        triangle.draw();

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        var fullEmployee = new FullTimeEmployee(480);
        var partEmployee = new PartTimeEmployee(1.5,8);
        fullEmployee.calculateSalary();
        partEmployee.calculateSalary();

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        var car = new Car();
        var robot = new Robot();
        car.move();
        robot.move();

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        var tv = new TV();
        var washingMachine = new WashingMachine();
        tv.turnOn();
        tv.turnOff();
        washingMachine.turnOn();
        washingMachine.turnOff();

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        var duck = new Duck();
        duck.fly();
        duck.swim();

        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        var pdf = new PDFDocument();
        var word = new WordDocument();
        pdf.print();
        word.print();

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        var invoice = new Invoice("Steam",20);
        var employeePay = new EmployeePayment("Yahir", 400);
        invoice.pay();
        employeePay.pay();
    }

    // Ejercicio 1
    public static abstract class Shape {
        public abstract void calculateArea();
    }

    public static class Circle extends Shape {
        double radio;
        public Circle(double radio) {
            this.radio = radio;
        }
        @Override
        public void calculateArea() {
            double area = Math.PI * (radio * radio);
            System.out.println("El area de tu circulo es: " + area);
        }
    }

    public static class Rectangle extends Shape {
        double width;
        double height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public void calculateArea() {
            double area = width * height;
            System.out.println("El area de tu rectangulo es de: " + area);
        }
    }
    // Ejercicio 2
    public interface Playable {
        void play();
    }

    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Estas tocando la Guitarra");
        }
    }

    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Estas tocando el Piano");
        }
    }
    // Ejercicio 3
    public abstract static class Animal {
        public abstract void makeSound();
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Miau");
        }
    }

    // Ejercicio 4
    public interface Drawable {
        void draw();
    }

    public static class Circle2 implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujaste un Circulo");
        }
    }

    public static class Square implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujaste un cuadrado");
        }
    }

    public static class Triangle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujaste un triangulo");
        }
    }
    // Ejercicio 5
    public abstract static class Employee {
        public abstract void calculateSalary();
    }

    public static class FullTimeEmployee extends Employee {
        double salary;

        public FullTimeEmployee(double salary) {
            this.salary = salary;
        }
        
        public void calculateSalary() {
            System.out.println("Tu salario es de: " + salary);
        }
    } 

    public static class PartTimeEmployee extends Employee {
        double earnForHour;
        double hours;

        public PartTimeEmployee(double earnForHour, int hours) {
            this.earnForHour = earnForHour;
            this.hours = hours;
        } 

        public void calculateSalary() {
            double salary = 20 * (earnForHour * hours);
            System.out.println("Tu salario es de: " + salary);
        }
    }
    // Ejercicio 6
    public interface Movable {
        void move();
    }
    
    public static class Car implements Movable {
        @Override
        public void move() {
            System.out.println("El auto se esta moviendo");
        }
    }

    public static class Robot implements Movable {
        @Override
        public void move() {
            System.out.println("El robot se esta moviendo");
        }
    }
    // Ejercicio 7
    public abstract static class Appliance {
        public abstract void turnOn();
        public abstract void turnOff();
    }
    
    public static class TV extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("Tu TV se prendio");
        }
        
        @Override
        public void turnOff() {
            System.out.println("Tu TV se apago.");
        }
    }

    public static class WashingMachine extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("Tu labadora se prendio.");
        }
        
        @Override
        public void turnOff() {
            System.out.println("Tu labadora se apago.");
        }
    }
    // Ejercicio 8
    public interface Flyable {
        void fly();
    }
    
    public interface Swimmable {
        void swim();
    }

    public static class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("El pato esta volando.");
        }
        
        @Override
        public void swim() {
            System.out.println("El pato esta nadando.");
        }
    }
    // Ejercicio 9
    public abstract static class Document {
        public abstract void print();
    }

    public static class PDFDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiste un PDF.");
        }
    }

    public static class WordDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiste un archivo Word.");
        }
    }
    // Ejercicio 10
    public interface Payable {
        void pay();
    }

    public static class Invoice implements Payable {
        String invoiceNumber;
        double amount;

        public Invoice(String invoiceNumber, double amount) {
            this.invoiceNumber = invoiceNumber;
            this.amount = amount;
        }

        @Override
        public void pay() {
            System.out.println("Procesando tu factura de #" + invoiceNumber + " con un monto de $" + amount);
        }
    }

    public static class EmployeePayment implements Payable {
        String eName;
        double amount;

        public EmployeePayment(String name, double amount) {
            eName = name;
            this.amount = amount;
        }

        @Override
        public void pay() {
            System.out.println("Procesando la paga de $" + amount + " a la cuenta del empleado " + eName);
        }
    }
}