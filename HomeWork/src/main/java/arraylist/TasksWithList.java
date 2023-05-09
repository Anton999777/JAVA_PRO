package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TasksWithList {
    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D"};
        Integer[] integers = {1, 3, 4, 5, 3, 21};
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 2, 7, 3, 4, 4, 10, 4, 6, 6, 6, 6));
        List<String> stringList = new ArrayList<>(Arrays.asList("fox", "list", "fox", "apple", "list", "cat",
                "orange", "orange", "dota", "Alex", "fox", "list", "apple", "blue", "fox"));


        System.out.println(findOccurrence(stringList));

    }

    public static List<RepetitionAmount> findOccurrence(List<String> elements) {
        Objects.requireNonNull(elements);
        List<RepetitionAmount> repetitionAmounts = new ArrayList<>();
        String nameElements;
        int indexDelete;

        for (int i = 0; i < elements.size(); i++) {
            int counter = 1;
            nameElements = elements.get(i);
            repetitionAmounts.add(new RepetitionAmount(nameElements, counter));
            for (int j = i + 1; j < elements.size(); j++) {
                if (nameElements.equals(elements.get(j))) {
                    counter++;
                    indexDelete = j;
                    repetitionAmounts.get(i).setOccurrence(counter);
                    elements.remove(indexDelete);
                }
            }
        }
        return repetitionAmounts;
    }

    public static List<String> calcOccurrence(List<String> elements) {
        Objects.requireNonNull(elements);
        String nameValue;
        int counter;
        int indexDelete;
        for (int i = 0; i < elements.size(); i++) {
            counter = 1;
            nameValue = elements.get(i);
            elements.set(i, elements.get(i) + ": " + counter);
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(i).contains(elements.get(j))) {
                    counter++;
                    elements.set(i, nameValue + ": " + counter);
                    indexDelete = j;
                    elements.remove(indexDelete);
                }
            }
        }
        return elements;
    }

    public int countOccurrence(List<String> elements, String value) {
        Objects.requireNonNull(elements);
        Objects.requireNonNull(value);
        int counter = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    public static <T> List<T> toList(T[] elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static List<Integer> findUnique(List<Integer> elements) {
        for (int i = 0; i < elements.size(); i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(i).equals(elements.get(j))) {
                    elements.remove(elements.get(j));
                    j--;
                }
            }
        }
        return elements;
    }
}
