package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped=false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10,9,8,7,6,5,4,3,2,1,0 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
