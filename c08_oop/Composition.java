package c08_oop;

public class Composition {

    public static void main(String[] args) {

        // Composición ("tiene un")

        var car = new Car();
        // car.engine.on();
        car.on();
    }

    public static class Engine {
        public void on() {
            System.out.println("Motor encendido.");
        }
    }

    public static class Car {
        private Engine engine = new Engine();

        public void on() {
            engine.on();
        }
    }
}