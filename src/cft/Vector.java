package cft;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vector<T> {
    private Object[] data;

    public Vector(int size) {
        data = new Object[size];
    }

    public void sort() {

    }

    void set(int index, T value) {
        data[index] = value;
    }

    T get(int index) {
        return (T)data[index];
    }
}
