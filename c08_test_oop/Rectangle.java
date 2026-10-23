package c08_test_oop;

public class Rectangle {
    
    // Features
    private double width;
    private double height;

    // Builder
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method
    // Setter
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateArea() {
        double result = width * height;
        System.out.println("El area de tu rectangulo es de: " + result);
    }

}
