package HomeWork6;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String username, String position, String email, String numberPhone, int age) {
        this.fullName = username;
        this.position = position;
        this.email = email;
        this.phoneNumber = numberPhone;
        this.age = age;
    }

    public String getUsername() {
        return fullName;
    }

    public void setUsername(String username) {
        this.fullName = username;
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
        return phoneNumber;
    }

    public void setNumberPhone(String numberPhone) {
        this.phoneNumber = numberPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
