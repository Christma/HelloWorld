package cn.java.LinearSearch;

public class Main {
    public static void main(String[] args) {
        Integer[] datas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0,9};
        System.out.println(LinearSearch.search(datas, 6));

        Student[] students = {new Student("chuanmu"), new Student("Bobo"), new Student("Alice")};
        Student student = new Student("chuanmu");

        System.out.println(LinearSearch.search(students, student));

    }
}
