package c08_oop;

import c08_oop.Inheritance.Animal;

public class Inheritance {
    
    public static void main(String[] args) {
        
        // Herencia ("es un")
        
        var animal = new Animal("Qachi");
//        animal.name = "Qachi";
        animal.eat();
        
        var dog = new Dog("Cooper", 9);
//        dog.name = "Cooper";
        dog.eat();

        var cat = new Cat("Gatita");
//        cat.name = "Gatita";
        cat.eat();
        // cat.fly();

        var bird = new Bird("Pajarito");
//        bird.name = "Pajarito";
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("El animal con nombre " + name + " esta comiendo.");
        }
    }

    public static class Dog extends Animal {

        int age;
        
        public Dog(String name, int age) {
            super(name); // El super(name) llama al constuctor de la clase padre para usar su constructor y asignar el valor de name.
            // si fuera super sin ()  
            this.age = age;
            //TODO Auto-generated constructor stub
        }

        /* El super. (con punto) es para acceder a los metodos o atributos de la clase padre / ejemplo de atribujo super.name llama al name de la clase padre.
        @Override
        public void eat() {
            // TODO Auto-generated method stub
            super.eat();
        } */

        @Override // esto es para verificar la el nombre exacto de los metodos de su clase superior y ver si es el mismo. 
        public void eat() {
            System.out.println("El perro con nombre " + name + " esta comiendo.");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
            //TODO Auto-generated constructor stub
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
            //TODO Auto-generated constructor stub
        }

        public void fly() {
            System.out.println("Tu pajaro llamado " + name + " esta volando.");
        }
    }
}
