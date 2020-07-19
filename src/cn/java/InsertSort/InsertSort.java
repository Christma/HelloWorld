package cn.java.InsertSort;

import cn.java.SelectionSort.ArrayGenerator;
import cn.java.SelectionSort.SortingHelper;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            E e = arr[i];
            int j;
            for (j = i; j > 0 && e.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    public static <E extends Comparable<E>> void sortPre2(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            E e = arr[i];
            int j;
            for (j = i; j < arr.length - 1 && e.compareTo(arr[j + 1]) > 0; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = e;
        }
    }


    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {10000,100000};
        for (int n : nums) {
            Integer[] data = ArrayGenerator.generatorRandomArray(n, n);
            Integer[] data2 = Arrays.copyOf(data, n);
            SortingHelper.testSorted("InsertSort", data);
            SortingHelper.testSorted("InsertSort2", data2);
            SortingHelper.testSorted("InsertSortPre2", data2);

        }
    }
}
