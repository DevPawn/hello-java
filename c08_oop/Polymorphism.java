package c08_oop;

public class Polymorphism {
    public static void main(String[] args) {

        // Polimorfismo

        // - Polimorfismo por herencia (sobrescritura)
        
        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        // - Polimorfismo por sobrecarga (sobrecarga de métodos)
        var calculator = new Calculator();
        calculator.sum(3,5);
        calculator.sum(3.4,1.4);
    }
    
    public static class Animal {
        public void sound() {
            System.out.println("Algún sonido");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Woof");
        }
    }

    // - Polimorfismo por sobrecarga (sobrecarga de métodos)

    public static class Calculator {
        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return a + b + c;
        }

        public double sum(double a, double b) {
            return a + b;
        }
    }
}
