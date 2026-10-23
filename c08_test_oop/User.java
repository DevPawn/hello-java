package c08_test_oop;

public class User {

    // Features
    private String username;
    private String password;

    // Builder
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method
    // Setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void checkPassword(String inputPassword) {
        if(password == inputPassword) {
            System.out.println("Las contraseñas son iguales.");
        } else {
            System.out.println("Las contraseñas son diferentes.");
        }
    }

}
