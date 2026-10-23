package c08_oop;

public class Classes {
    public static void main(String[] args) {
     
        var person = new Person("Yahir", -22, "12DDR32A3");
        
//        person.name = "Yahir";
//        person.age = 22;

        person.sayHello();

        person.name = "Yahir Flores";
    
        System.out.println(person.name);

        var person2 = new Person("Fool", 30, "34H23I5HA6");
        person2.sayHello();

        System.out.println(person.getId());

        person.setAge(22);
        System.out.println(person.getAge());
    }
}
