package cn.java.LinkedList;

import cn.java.Stack.ArrayStack;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> linkedList;

    public LinkedListStack() {
        linkedList = new LinkedList<E>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack Top: ");
        sb.append(linkedList);
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> as = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            as.push(i);
            System.out.println(as);
        }

        as.pop();
        System.out.println(as);
    }
}
