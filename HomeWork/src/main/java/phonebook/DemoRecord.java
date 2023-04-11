package phonebook;

public class DemoRecord {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        Record record = new Record("Anton Shevchenko", "3422355");
        Record record2 = new Record("Sergey Medvedev", "5668");
        Record record3 = new Record("Maksim Pogorelov", "13344");
        Record record4 = new Record("Anton Shevchenko", "123");
        phoneDirectory.add(record);
        phoneDirectory.add(record2);
        phoneDirectory.add(record3);
        phoneDirectory.add(record4);

    }
}
