package streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeList<T> {
    private final Object lock = new Object();
    private Object[] array;

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public ThreadSafeList() {
        setArray(new Object[0]);
    }

    private int size() {
        return getArray().length;
    }

    public void add(T element) {
        synchronized (lock) {
            Object[] ne = getArray();
            int length = size();
            ne = Arrays.copyOf(ne, length + 1);
            ne[length] = element;
            setArray(ne);
        }
    }

    public Object remove(int index) {
        synchronized (lock) {
            Object[] ar = getArray();
            int length = size();
            Object[] newValue;
            if (index == size() - 1) {
                newValue = Arrays.copyOf(ar, length - 1);
            } else {
                newValue = new Object[length - 1];
                System.arraycopy(ar, 0, newValue, 0, index);
                System.arraycopy(ar, index + 1, newValue, index, (length - index) - 1);
            }
            setArray(newValue);
            return ar[index];
        }
    }

    private <T> T elementGet(int index) {
        return (T) getArray()[index];
    }

    public T get(int index) {
        return elementGet(index);
    }
}
