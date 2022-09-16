package Lecture_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_6 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] array1 = new int[5];
        int[] array2 = new int[2];
        int[] array3 = new int[4];
        int[] array4 = new int[7];
        int[] array5 = new int[0];

        fillArray(array1);
        fillArray(array2);
        fillArray(array3);
        fillArray(array4);
        fillArray(array5);

        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        list.add(array5);

        return list;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}
