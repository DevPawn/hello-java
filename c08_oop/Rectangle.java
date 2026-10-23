package c08_oop;

public class Rectangle {

    // Features
    double width; // Base / Ancho
    double height; // Altura

    // Builder
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method

    public void area() {
        double area = width * height;
        System.out.println("Tu area es de " + area);
    }

    public void perimeter() {
        double perimeter = width + width + height + height;
        System.out.println("Tu perímetro es de " + perimeter);
    }
    
}
