package c08_test_oop;

import java.util.ArrayList;

public class PolymorphismExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(new Dog());
        myAnimals.add(new Cat());
        myAnimals.add(new Cow());
        for (Animal animal : myAnimals) {
            animal.makeSound();
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        ArrayList<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(4));
        myShapes.add(new Rectangle(2,4));
        for (Shape shape : myShapes) {
            shape.calculateArea();
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        var printer = new Printer();
        printer.print("Soy la primera funcion de sobrecarga");
        printer.print(2);
        printer.print(2.3);


        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        var person = new Greeter();
        person.greet();
        person.greet("Yahir");

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        ArrayList<Vehicle> myVehicle = new ArrayList<>();
        myVehicle.add(new Car());
        myVehicle.add(new Bike());
        myVehicle.add(new Truck());
        for (Vehicle vehicle : myVehicle) {
            vehicle.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        var email = new EmailNotification();
        var sms = new SMSNotification();
        sendNotification(email);
        sendNotification(sms);

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        var dog = new Dog();
        var cat = new Cat();
        var horse = new Horse();
        showAnimalType(dog);
        showAnimalType(cat);
        showAnimalType(horse);

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        var converter = new Converter();
        converter.convert(2);
        converter.convert(4.1);
        converter.convert("Soy un Texto");

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        ArrayList<Product> myProducts = new ArrayList<>();
        myProducts.add(new Book());
        myProducts.add(new Electronic());
        for (Product product : myProducts) {
            product.getPrice(23);
        }

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        ArrayList<Character> myCharacters = new ArrayList<>();
        myCharacters.add(new Warrior());
        myCharacters.add(new Archer());
        myCharacters.add(new Mage());

        for (Character character : myCharacters) {
            character.attack();
        }
    }
    // Ejercicio 1
    public static class Animal {
        public void makeSound() {
            System.out.println("Algun sonido");
        }
        public void getType() {
            System.out.println("Soy un animal");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
        @Override
        public void getType() {
            System.out.println("Soy un Perro");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Miau");
        }
        @Override
        public void getType() {
            System.out.println("Soy un gato");
        }
    }

    public static class Horse extends Animal {
        @Override
        public void getType() {
            System.out.println("Soy un caballo");
        }
    }

    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Moo");
        }
    }
    //Ejercicio 2
    public static class Shape {
        public void calculateArea() {
            System.out.println("CalcularArea Hecho");
        }
    }

    public static class Circle extends Shape {
        double radio;
        public Circle(double radio) {
            this.radio = radio;
        }
        @Override
        public void calculateArea() {
            double area = Math.PI * (radio * radio);
            System.out.println("El área de tu circulo es: " + area);
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
    // Ejercicio 3
    public static class Printer {
        public void print(String string) {
            System.out.println(string);
        }
        public void print(int integer) {
            System.out.println(integer);
        }
        public void print(double decimal) {
            System.out.println(decimal);
        }
    }
    //Ejercicio 4
    public static class Greeter {
        public void greet() {
            System.out.println("Hello");
        }
        public void greet(String name) {
            System.out.println("Hello " + name);
        }
    }
    // Ejercicio 5
    public static class Vehicle {
        public void start() {
            System.out.println("El vehiculo inicia.");
        }
    }

    public static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("El carro arranca.");
        }
    }

    public static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("La bicicleta pedalea.");
        }
    }

    public static class Truck extends Vehicle {
        @Override
        public void start() {
            System.out.println("El camion arranca.");
        }
    }
    // Ejercicio 6
    public static class Notification {
        public void send() {
            System.out.println("Enviando Notificacion");
        }
    }
    public static class EmailNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Enviando un Correo");
        }
    }

    public static class SMSNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Enviando un SMS");
        }
    }
    
    public static void sendNotification(Notification n) {
        n.send();
    }
    // Ejercicio 7
    public static void showAnimalType(Animal animal) {
        animal.getType();
    }
    // Ejercicio 8
    public static class Converter {
        public void convert(int integer) {
            System.out.println(integer);
        }
        public void convert(double decimal) {
            System.out.println(decimal);
        }
        public void convert(String cadenaDeTxt) {
            System.out.println(cadenaDeTxt);
        }
    }
    //  Ejercicio 9
    public static class Product {
        public void getPrice(double price) {
            System.out.println("Tu precio es: " + price);
        }
    }
    public static class Book extends Product {
        double discount = 20;
        @Override
        public void getPrice(double price) {
            double preTotal = price * (discount / 100); // 4.6 = 23 * 0.4
            double total = price - preTotal;    // = 23 - 4.6
            System.out.println("El precio de tu libro con " + discount + "% de descuento es de: " + total);
        }
    }
    public static class Electronic extends Product {
        double discount = 40;
        @Override
        public void getPrice(double price) {
            double preTotal = price * (discount / 100);
            double total = price - preTotal;
            System.out.println("El precio de tu aparato electonico con " + discount + "% de descuento es de: " + total);
        }     
    }
    // Ejercicio 10
    public static class Character {
        public void attack() {
            System.out.println("Ataca");
        }
    }
    public static class Warrior extends Character {
        @Override
        public void attack() {
            System.out.println("Ataca con una espada");
        }
    }

    public static class Archer extends Character {
        @Override
        public void attack() {
            System.out.println("Tira una flecha");
        }
    }

    public static class Mage extends Character {
        @Override
        public void attack() {
            System.out.println("Ataca con un hechizo");
        }
    }
}