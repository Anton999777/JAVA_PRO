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

    public Record find(String name) {
        Objects.requireNonNull(name);
        for (Record find : nameAndPhoneNumber) {
            if (find.getName().contains(name)) {
                return find;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        Objects.requireNonNull(name);
        List<Record> requestedData = new ArrayList<>();
        for (Record findAll : nameAndPhoneNumber) {
            if (findAll.getName().contains(name)) {
                requestedData.add(findAll);
            }
        }
        return requestedData.isEmpty() ? null : requestedData;
    }
}
