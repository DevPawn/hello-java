package c08_test_oop;

public class Car {

    // Feature
    private int speed;

    // Builder
    public Car(int speed) {
        if(speed > 0 && speed <= 120){
            this.speed = speed;
        } else {
            this.speed = 0;
            System.out.println("Tu velocidad es 0 por tu seguridad");
        }
    }

    // Method
    public void accelerate(int amount) {
        if(amount > 0 && speed + amount <= 120) {
            speed += amount;
            System.out.println("Tu velocidad es de : " + speed);
        } else {
            System.out.println("No se puede acelerar");
        }
    }

    public void brake(int amount) {
        if(amount > 0 && speed - amount >= 0) {
            speed -= amount;
            System.out.println("Tu velocidad es de: " + speed);
        } else {
            System.out.println("No se puede reducir");
        }
    }
}
