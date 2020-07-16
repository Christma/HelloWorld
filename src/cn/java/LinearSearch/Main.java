package cn.java.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] dataSize = {10000, 100000, 1000000, 10000000};
        for (int n : dataSize) {
            Integer[] datas = ArrayGenerator.generatorOrderArray(n);
            long startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                LinearSearch.search(datas, n);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", 100 runs : " + time + " s");
        }
    }

}
