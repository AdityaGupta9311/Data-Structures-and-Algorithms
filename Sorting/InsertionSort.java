package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    // Another Way
    static void sort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 42, 4, 556, 75, -2, 30, 0 };
        sort1(arr);
        // sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
