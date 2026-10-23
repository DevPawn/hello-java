package c08_oop;

public class Student {

    // Features
    int score;

    // Builder
    public Student(int score) {
        this.score = score;
    }

    // Method
    public void approved() {
        if(score >= 60) {
            System.out.println("FELICIDAD APROBASTE");
        } else {
            System.out.println("REPROBADO");
        }
    }
    
}
