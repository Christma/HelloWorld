package cn.java.Stack;

public interface Stack<E> {

    int getSize();

    int getCapacity();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
