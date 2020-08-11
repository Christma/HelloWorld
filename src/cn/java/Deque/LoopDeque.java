package cn.java.Deque;

import cn.java.Queue.LoopQueue;

public class LoopDeque<E> implements Deque<E> {

    private E[] data;
    private int front, tail;
    private int size;

    public LoopDeque(int capacity) {
        data = (E[]) new Object[capacity];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopDeque() {
        this(10);
    }

    public int getCapacity() {
        return data.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addLast(E e) {

        if (size == getCapacity()) {
            resize(getCapacity() * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public void addFront(E e) {

        if (size == getCapacity()) {
            resize(getCapacity() * 2);
        }

        front = front == 0 ? data.length - 1 : front - 1;
        data[front] = e;
        size++;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Deque is Empty!!!");
        }
        tail = tail == 0 ? data.length - 1 : tail - 1;
        E ans = data[tail];
        data[tail] = null;
        size--;

        if (getSize() == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ans;
    }

    @Override
    public E removeFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Deque is Empty!!!");
        }
        E ans = data[front];
        data[front] = null;
        size--;
        if (getSize() == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ans;
    }

    public E getLast() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Deque is Empty!!!");
        }
        tail = tail == 0 ? data.length - 1 : tail - 1;
        return data[tail];
    }

    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Deque is Empty!!!");
        }

        return data[front];
    }


    private void resize(int newCapacity) {

        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
            data = newData;
            front = 0;
            tail = size;
        }
    }


    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        ans.append(String.format("Queue : size %d, capacity %d \n", size, getCapacity()));
        ans.append("front [ ");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            ans.append(data[i]);
            if ((i + 1) % data.length != tail) {
                ans.append(", ");
            }
        }
        ans.append("] tail");
        return ans.toString();
    }
}
