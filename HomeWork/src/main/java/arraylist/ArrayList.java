package arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayList {
    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D"};
        Integer[] integers = {1, 3, 4, 5, 3, 21};
        List<Integer> list = new java.util.ArrayList<>(Arrays.asList(1, 3, 2, 7, 3, 4, 4, 10, 4, 6, 6));
        List<String> stringList = new java.util.ArrayList<>(Arrays.asList("fox", "list", "fox", "apple", "list", "cat",
                "orange", "orange", "dota", "Alex", "fox", "list", "apple", "blue"));
    }

    static public List<String> findOccurrence(List<String> elements) {
        String str;
        int counter;
        int indexDelete;
        for (int i = 0; i < elements.size(); i++) {
            counter = 1;
            str = elements.get(i);
            elements.set(i, elements.get(i) + ": " + counter);
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(i).contains(elements.get(j))) {
                    counter++;
                    elements.set(i, "name: " + str + ", occurrence: " + counter);
                    indexDelete = j;
                    elements.remove(indexDelete);
                }
            }
        }
        return elements;
    }

    static public List<String> calcOccurrence(List<String> elements) {
        String str;
        int counter;
        int indexDelete;
        for (int i = 0; i < elements.size(); i++) {
            counter = 1;
            str = elements.get(i);
            elements.set(i, elements.get(i) + ": " + counter);
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(i).contains(elements.get(j))) {
                    counter++;
                    elements.set(i, str + ": " + counter);
                    indexDelete = j;
                    elements.remove(indexDelete);
                }
            }
        }
        return elements;
    }

    public int countOccurrence(List<String> elements, String value) {
        Objects.requireNonNull(value);
        int counter = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).contains(value)) {
                counter++;
            }
        }
        return counter;
    }

    static public <T> List<T> toList(T[] elements) {
        return Arrays.asList(elements);
    }

    static public List<Integer> findUnique(List<Integer> elements) {
        List<Integer> repeatedDigits = new java.util.ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(i).equals(elements.get(j))) {
                    repeatedDigits.add(elements.get(j));
                    elements.removeAll(repeatedDigits);
                    j = elements.size();
                    i--;
                }
            }
        }
        return elements;
    }
}
