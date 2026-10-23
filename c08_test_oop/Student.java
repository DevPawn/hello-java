package c08_test_oop;

public class Student {
    
    // Feature
    private int grade;

    // Builder
    public Student(int grade) {
        this.grade = grade;
    }

    // Method
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void isPassed() {
        if(grade >= 60) {
            System.out.println("Pasaste con una nota de: " + grade);
        } else {
            System.out.println("No pasaste con: " + grade);
        }
    }
}