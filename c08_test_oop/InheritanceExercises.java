package c08_test_oop;

import java.util.ArrayList;

/*
Clase 62 - Ejercicios: Herencia
Vídeo: https://youtu.be/JOAqpdM36wI?t=24373
*/

public class InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var vehicle = new Vehicle();
        vehicle.move();

        var car = new Car();
        car.move();
        car.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        var student = new Student("Yahir",22);
        student.grade(10);
        student.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        var animal = new Animal();
        animal.makeSound();
        var dog = new Dog();
        dog.makeSound();
        var cat = new Cat();
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        var manager = new Manager("Sebastian", 400, "Basico");

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        var circle = new Circle(20);
        circle.calculateArea();
        var rectangle = new Rectangle(10,5);
        rectangle.calculateArea();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var eagle = new Eagle();
        eagle.fly();
        
        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        var phone = new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        var savingsAccount = new SavingsAccount(400);
        savingsAccount.deposit(30);
        savingsAccount.withdraw(10);
        savingsAccount.addInterest( 14);

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        var car2 = new Car2();
        var bike = new Bike();
        var truck = new Truck();
        car2.describe();
        bike.describe();
        truck.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        ArrayList<Animal2> myAnimals = new ArrayList<>();
        myAnimals.add(new Dog2());
        myAnimals.add(new Cat2());
        myAnimals.add(new Bird2());

        for (Animal2 animal2 : myAnimals) {
            animal2.makeSound();
        }
        /*
        for (DataType TemporalName : ListToIterate) {
            TheMethod
        } */

    }
    // Ejercicio 1
    public static class Vehicle {
        // Method
        public void move(){
            System.out.println("Tu vehiculo se esta moviendo.");
        }
    }

    public static class Car extends Vehicle {
        
        @Override
        public void move() {
            System.out.println("Tu carro se esta moviendo.");
        }
        // Mehtod
        public void honk() {
            System.out.println("PIIIIII");
        }  
    }
    // Ejercicio 2
    public static class Person{
        // Attributes / Features
        String name;
        int age;

        // Builder
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Student extends Person {
        // Builder
        public Student(String name, int age) {
            super(name, age);
        }
        // Method
        public void grade(int grade) {
            System.out.println("La nota de " + name + " es de " + grade);
        }

        public void study() {
            System.out.println(name + " esta estudiando.");
        }
    }
    // Ejercicio 3
    public static class Animal {
        public void makeSound(){
            System.out.println("Ruido animal");
        }
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
            System.out.println("Meow");
        }
    }
    // Ejercicio 4
    public static class Employee {
        String name;
        double salary;
        // Builder
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {
        String department;
        public Manager(String name, double salary, String department) {
            super(name,salary);
            this.department = department;
        }
    }
    // Ejercicio 5
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
            double area = Math.PI * radio * radio;
            System.out.println("El area de tu circulo es " + area);
        }
    }

    public static class Rectangle extends Shape {
        double length; // Base
        double width; // Altura
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        public void calculateArea() {
            double area = length * width;
            System.out.println("El area de tu rectangulo es de " + area);
        }
    }
    // Ejercicio 6
    public static  class Bird {
        public  void fly() {
            System.out.println("El ave esta volando");
        }
    }

    public static class Eagle extends Bird {
        @Override
        public void fly() {
            super.fly();
            System.out.println("Y tambien tiene buena vista.");
        }
    }
    // Ejercico 7
    public static abstract class Device {
        public Device() {
            System.out.println("Device created");
        }
    }

    public static class Phone extends Device {
        public Phone() {
            System.out.println("Phone Ready");
        }
    }
    // Ejercicio 8
    public static class Account {
        double saldo;
        public Account(double saldo) {
            this.saldo = saldo;
        }    

        public void deposit(double amount) {
            saldo += amount;
            System.out.println("Tu saldo Actual es de: " + saldo);
        }
        public void withdraw(double amount) {
            saldo -= amount;
            System.out.println("Tu saldo Actual es de: " + saldo);
        }
    }
    
    public static class SavingsAccount extends Account {
        public SavingsAccount(double amount){
            super(amount);
        }
        public void addInterest(double tasaInteres) {
            double earn = saldo * tasaInteres;
            System.out.println("Tu dinero con interes es de " + earn);
        }
    }
    // Ejercicio 9
    public static abstract class Vehicle2 {
        public abstract void describe();
    }
    public static class Car2 extends Vehicle2 {
        @Override
        public void describe() {
            System.out.println("Tu entidad es un carro.");
        }    
    }

    public static class Bike extends Vehicle2 {
        @Override
        public void describe() {
            System.out.println("Tu entidad es una bicicleta.");
        }
    }
    
    public static class Truck extends Vehicle2 {
        @Override
        public void describe() {
            System.out.println("Tu entidad es un camion.");
        }
    }
    // Ejercicio 10
    public static abstract class Animal2 {
        public abstract void makeSound();
    }

    public static class Dog2 extends Animal2 {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }
    
    public static class Cat2 extends Animal2 {
        @Override
        public void makeSound() {
            System.out.println("Miau");
        }
    }

    public static class Bird2 extends Animal2 {
        @Override
        public void makeSound() {
            System.out.println("Pio Pio");
        }
    }
    
}