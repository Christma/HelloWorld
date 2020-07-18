package cn.java.SelectionSort;

import cn.java.InsertSort.InsertSort;

public class SortingHelper {
    private SortingHelper() {
    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void testSorted(String sortName, E[] arr) {
        long startTime = System.nanoTime();
        if (sortName.equals("SelectionSort")) {
            SelectionSort.sort(arr);
        } else if (sortName.equals("SelectionSortpre")) {
            SelectionSort.preOrder(arr);
        } else if (sortName.equals("InsertSort")) {
            InsertSort.sort(arr);
        } else if (sortName.equals("InsertSort2")) {
            InsertSort.sort2(arr);
        }else if (sortName.equals("InsertSortPre2")) {
            InsertSort.sortPre2(arr);
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!SortingHelper.isSorted(arr)) {
            throw new RuntimeException(String.format("%s fail!", sortName));
        }
        System.out.println(String.format("%s : 数据规模： %d ， 用时：%f", sortName, arr.length, time));
    }
}
