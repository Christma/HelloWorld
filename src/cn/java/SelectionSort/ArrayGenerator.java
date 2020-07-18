package cn.java.SelectionSort;

import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator() {
    }


    public static Integer[] generatorOrderArray(int n) {
        Integer[] gener = new Integer[n];
        for (int i = 0; i < n; i++) {
            gener[i] = i;
        }
        return gener;
    }

    public static Integer[] generatorRandomArray(int n, int bound) {
        Integer[] gener = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            gener[i] = random.nextInt(bound);
        }
        return gener;
    }
}
