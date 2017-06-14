package cft;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vector<T> {
    private Object[] data;
    private int length;

    public Vector(int capacity) {
        data = new Object[capacity];
        length = 0;
    }

    public void sort() {

    }

    void add(T value) throws Exception {
        if (length < data.length) {
            data[length] = value;
            length++;
        } else {
            throw new Exception("boundary");
        }
    }

    T get(int index) {
        return (T)data[index];
    }
}
