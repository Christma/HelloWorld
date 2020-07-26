package cn.java.Array;

import java.util.Arrays;

public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index error");
        }
        return data[index];
    }

    public void set(int index, int e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index error");
        }
        data[index] = e;
    }

    public void addLast(int e) {
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }


    public void add(int index, int e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index error");
        }
        if (size == getCapacity()) {
            throw new IllegalArgumentException("array is full");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;

    }


    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", capacity=" + getCapacity() +
                '}';
    }
}
