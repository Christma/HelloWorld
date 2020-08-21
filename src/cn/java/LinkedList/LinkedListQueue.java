package cn.java.LinkedList;

import cn.java.Queue.ArrayQueue;

public class LinkedListQueue<E> implements Queue<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
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
    public void enqueue(E e) {

        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty, Can not dequeue");
        }
        Node delNode = head;
        head = head.next;
        delNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;

        return delNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty, Can not dequeue");
        }
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue front: ");
        Node cur = head;
        while (cur != null) {
            sb.append(cur.e + " ->");
            cur = cur.next;
        }
        sb.append("Null tail");

        return sb.toString();
    }
    public static void main(String[] args) {
        LinkedListQueue<Integer> aq = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            aq.enqueue(i);
            System.out.println(aq);

            if (i % 3 == 2) {
                aq.dequeue();
                System.out.println(aq);
            }
        }
    }
}
