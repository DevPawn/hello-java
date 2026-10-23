package c08_oop;

public class Product {
    
    // Features
    double price;

    // Builder
    public Product(double price){
        this.price = price;
    }

    // Method
    public void applyDiscount(double percentage) {
        double discountAmount = price * (percentage / 100);
        price -= discountAmount;
        System.out.println("tu precio con descuento es de: " + price);
    }
}
