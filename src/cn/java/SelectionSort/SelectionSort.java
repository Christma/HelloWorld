package cn.java.SelectionSort;

public class SelectionSort {

    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] data = {1, 4, 2, 3, 5};
        String[] str = {"a","z","t","b","q"};
        SelectionSort.sort(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
