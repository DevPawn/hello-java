package c08_oop;

public class Book {

    // Features
    String title;
    String author;

    // Builder
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method

    public void showData() {
        System.out.println("Tu libro es " + title + " y su autor es " + author);
    }
    

}
