package c08_oop;
public class Abstraction {
    public static void main(String[] args) {

        // Abstracción
        
        // - Clase abstracta

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface

    }

    // - Clase abstracta

    public static abstract class Animal {

        public abstract void sound();

        public void sleep() {
            System.out.println("El animal esta durmiendo.");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Woof");
        }

        @Override
        public void sleep() {
            System.out.println("El perro esta durmiendo");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Miau");
        }
    }

    // - Interface

    public interface Flying {
        
        void fly();
    }

    

    public static class Bird extends Animal implements Flying {
        
        @Override
        public void sound() {
            System.out.println("Pio Pio");
        }

        @Override
        public void fly() {
            System.out.println("El pajaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying {
        
        @Override
        public void sound() {
            System.out.println("Soy Batman");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }
    }
}