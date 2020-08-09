package cn.java.Queue;

public class ArrayQueue<E> implements Queue<E> {

    Array<E> arrayQueue;

    public ArrayQueue(int capacity) {
        arrayQueue = new Array<>(capacity);
    }

    public ArrayQueue() {
        arrayQueue = new Array<>();
    }


    @Override
    public int getSize() {
        return arrayQueue.getSize();
    }

    @Override
    public boolean isEmpty() {
        return arrayQueue.isEmpty();
    }


    public int getCapacity() {
        return arrayQueue.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        arrayQueue.addLast(e);
    }

    @Override
    public E dequeue() {
        return arrayQueue.removeFirst();
    }

    @Override
    public E getFront() {
        return arrayQueue.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        ans.append("Queue : front [");
        for (int i = 0; i < arrayQueue.getSize(); i++) {
            ans.append(arrayQueue.get(i));
            if (i != arrayQueue.getSize() - 1) {
                ans.append(", ");
            }
        }
        ans.append("] tail");
        return ans.toString();
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> aq = new ArrayQueue<>();
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
