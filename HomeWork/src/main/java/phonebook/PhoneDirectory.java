package phonebook;

import arraylist.RepetitionAmount;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneDirectory {

    private List<Record> records = new ArrayList<>();

    public List<Record> getRecords() {
        return records;
    }

    public List<Record> add(Record record) {
        records.add(record);
        return records;
    }

    public Record find(String name) {
        Objects.requireNonNull(name);
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        Objects.requireNonNull(name);
        List<Record> requestedData = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                requestedData.add(record);
            }
        }
        return requestedData.isEmpty() ? null : requestedData;
    }
}
