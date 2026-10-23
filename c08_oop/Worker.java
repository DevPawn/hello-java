package c08_oop;

public class Worker {
    
    // Features
    String name;
    double salary;

    // Builder
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method
    public void showSalary() {
        System.out.println(name + " tu salario es de: " + salary);
    }
}
