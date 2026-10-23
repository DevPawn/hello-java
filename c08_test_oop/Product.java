package c08_test_oop;

public class Product {

    // Features
    private double price;

    // Builder
    public Product(double price) {
        this.price = price;
    }

    // Method
    // Setter
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else{
            System.out.println("PRECIO ERRADO");
        }
    }
    
}
