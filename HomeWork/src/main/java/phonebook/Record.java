package phonebook;

public class Record {

    private String name;
    private String phoneNumber;

    public Record(String name, String numberPhone) {
        this.name = name;
        this.phoneNumber = numberPhone;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
