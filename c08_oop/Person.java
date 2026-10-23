package c08_oop;

public class Person {

    // Atributos
    protected String name;
    int age;
    final private String id;

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    // Métodos (o funciones)
    public void sayHello() {
        System.out.println("Hola, me llamo: " + name + ", tengo " + age + " años y mi ID es " + id + ".");
    }


    // Getter
    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("EDAD NO VALIDA");
        }
    }

    @Override
    public String toString() {
        return name + " (" + age + " años)";
    }
}