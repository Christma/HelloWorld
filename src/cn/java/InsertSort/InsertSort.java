package cn.java.InsertSort;

import cn.java.SelectionSort.ArrayGenerator;
import cn.java.SelectionSort.SortingHelper;

public class InsertSort {
    private InsertSort() {
    }


    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
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
            SortingHelper.testSorted("InsertSort", data);
        }
    }
}
