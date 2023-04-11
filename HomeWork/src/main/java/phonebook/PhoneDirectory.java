package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneDirectory {

    private List<Record> nameAndPhoneNumber = new ArrayList<>();

    public List<Record> getNameAndPhoneNumber() {
        return nameAndPhoneNumber;
    }

    public List<Record> add(Record record) {
        nameAndPhoneNumber.add(record);
        return nameAndPhoneNumber;
    }

    public String find(String name) {
        Objects.requireNonNull(name);
        for (Record find : nameAndPhoneNumber) {
            if (find.getName().contains(name)) {
                return "Requested name: [%s]  this data was found: name - [%s], phone number - [%s]"
                        .formatted(name, find.getName(), find.getPhoneNumber());
            }
        }
        return null;
    }

    public List<String> findAll(String name) {
        Objects.requireNonNull(name);
        String data;
        List<String> requestedData = new ArrayList<>();
        for (Record findAll : nameAndPhoneNumber) {
            if (findAll.getName().contains(name)) {
                data = " Requested name: [%s]  this data was found: name - [%s], phone number - [%s]%n"
                        .formatted(name, findAll.getName(), findAll.getPhoneNumber());
                requestedData.add(data);
            }
        }
        if (requestedData.isEmpty()) {
            return null;
        } else {
            return requestedData;
        }
    }
}
