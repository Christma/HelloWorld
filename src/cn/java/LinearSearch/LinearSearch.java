package cn.java.LinearSearch;

public class LinearSearch {

    public int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] datas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(new LinearSearch().search(datas, 6));
    }
}
