package c08_test_oop;

public class Temperature {

    // Features
    private double celsius;

    // Builder
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Method
    // Setter
    public void setCelsius(double celsius) {
        if(celsius >= -100 && celsius <= 100) {
            System.out.println("Exito: " + celsius);
        }else {
            System.out.println("VALOR ERRADO: " + celsius);
        }
    }
}
