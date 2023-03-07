package HomeWork6;

public class Employee {
    private String username;
    private String position;
    private String email;
    private String numberPhone;
    private int age;

    public Employee(String username, String position, String email, String numberPhone, int age) {
        this.username = username;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
