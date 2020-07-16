package cn.java.LinearSearch;

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
}
