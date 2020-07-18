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

    public static <E extends Comparable<E>> void preOrder(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i; j >= 0; j--) {
                if (arr[j].compareTo(arr[maxIndex]) > 0) {
                    maxIndex = j;
                }
            }
            swap(arr, i, maxIndex);
        }
    }


    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {10000, 100000};
        for (int n : nums) {
            Integer[] data = ArrayGenerator.generatorRandomArray(n, n);
            SortingHelper.testSorted("SelectionSort", data);
        }
        for (int n : nums) {
            Integer[] data = ArrayGenerator.generatorRandomArray(n, n);
            SortingHelper.testSorted("SelectionSortpre", data);
        }
    }
}
