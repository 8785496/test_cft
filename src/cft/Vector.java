package cft;

import cft.Exception.OrderException;
import cft.Exception.VectorException;

public class Vector<T extends Comparable<T>> {
    private final String orderAsc= "-a";
    private final String orderDesc= "-d";

    private Object[] data;
    private int length;

    public Vector(int capacity) {
        data = new Object[capacity];
        length = 0;
    }

    public void sort(String order) throws OrderException {
        if (length < 2)
            return;
        if (order.equals(orderAsc)) {
            sortByAsc();
        } else if (order.equals(orderDesc)) {
            sortByDesc();
        } else {
            throw new OrderException("Unknown order " + order);
        }
    }

    private void sortByAsc() {
        for (int j = 1; j < length; j++) {
            T key = (T) data[j];
            int i = j - 1;
            while (i > -1 && ((T)data[i]).compareTo(key) > 0) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
    }

    private void sortByDesc() {
        for (int j = 1; j < length; j++) {
            T key = (T) data[j];
            int i = j - 1;
            while (i > -1 && ((T)data[i]).compareTo(key) < 0) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
    }

    void add(T value) throws VectorException {
        if (length < data.length) {
            data[length] = value;
            length++;
        } else {
            throw new VectorException("Vector index out of bounds");
        }
    }

    T get(int index) {
        return (T)data[index];
    }

    public int getLength() {
        return length;
    }
}
