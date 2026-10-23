package c08_test_oop;

public class Person {

    // Features
    private String name;
    private int age;

    // Builder
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    
    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
