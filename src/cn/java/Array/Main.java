package cn.java.Array;

public class Main {

    public static void main(String[] args) {
        Array<Integer> arr = new Array();
        for (int i = 0; i < 20; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(2, -1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);
        arr.remove(10);
        System.out.println(arr);
    }
}
