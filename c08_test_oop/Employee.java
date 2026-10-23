package c08_test_oop;

public class Employee {

    // Feature
    private double salary;

    // Builder
    public Employee(double salary) {
        this.salary = salary;
    }
    
    // Method
    // Setter
    public void raiseSalary(double percent) {
        if(percent > 0) {
            salary += percent;
        } else {
            System.out.println("Unicamente se puede aumentar el efectivo.");
        }
    }

    // Getter
    public double getSalary() {
        return salary;
    }

}
