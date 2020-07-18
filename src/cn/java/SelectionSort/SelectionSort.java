package cn.java.SelectionSort;

public class SelectionSort {

    private SelectionSort() {
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] data = {1, 4, 2, 3, 5};
        SelectionSort.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
