package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box<T extends Fruit> {

    private List<Fruit> fruitBox = new ArrayList<>();
    private T fruit;

    public Box(T fruit) {
        this.fruit = fruit;
    }


    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }

    public List<Fruit> getFruitBox() {
        return fruitBox;
    }

    public void setFruitBox(List<Fruit> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public <O extends T> void add(O obj) {
        Objects.requireNonNull(obj);
        this.fruitBox.add(obj);
    }

    public boolean addAllFruit(List<? extends Fruit> fruitList) {
        if (fruitList.isEmpty()) {
            throw new NullPointerException("An empty list is passed to the method argument");
        }
        if (this.fruitBox.isEmpty()) {
            if (containsListFruit(fruitList)) {
                this.fruitBox.addAll(fruitList);
                return true;
            }
        }
        if (containsListFruit(fruitList) && fruit instanceof Orange) {
            this.fruitBox.addAll(fruitList);
            return true;
        } else if (containsListFruit(fruitList) && fruit instanceof Apple) {
            this.fruitBox.addAll(fruitList);
            return true;
        }
        throw new IllegalArgumentException("The current box contains a different fruit than the one you pass as an argument.");
    }

    public boolean containsListFruit(List<? extends Fruit> list) {
        if (list.get(0) instanceof Orange) {
            for (Fruit ar : list) {
                boolean or = ar instanceof Orange;
                if (!or) {
                    throw new IllegalArgumentException("The list contains different types of fruits");
                }
            }
        } else if (list.get(0) instanceof Apple) {
            for (Fruit checkedClass : list) {
                boolean ap = checkedClass instanceof Apple;
                if (!ap) {
                    throw new IllegalArgumentException("The list contains different types of fruits");
                }
            }
        }
        return true;
    }

    public Float getWeight() {
        float boxWeight = 0.0f;
        if (this.fruitBox.isEmpty()) {
            throw new NullPointerException("Fruit list is empty");
        }
        for (Fruit ar : this.fruitBox) {
            boxWeight = boxWeight + ar.getWeightFruit();
        }
        return boxWeight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        Objects.requireNonNull(fruitBox);
        int result = this.getWeight().compareTo(box.getWeight());
        if (result == 0) {
            return true;
        }
        return false;
    }

    public boolean merge(Box<? extends T> boxFruit) {
        Objects.requireNonNull(boxFruit);
        return this.fruitBox.addAll(boxFruit.getFruitBox());
    }
}
