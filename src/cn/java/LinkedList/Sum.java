package cn.java.LinkedList;

public class Sum {
    public static int sum(int [] arr){
        return sum(arr,0);
    }

    private static int sum(int[] arr, int i) {
        if(i == arr.length){
            return 0;
        }
        return arr[i] + sum(arr,i+1);
    }
}
