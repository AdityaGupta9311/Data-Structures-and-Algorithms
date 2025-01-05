package BinarySearch;

import java.util.Arrays;

public class SearchIn2D {

    static int[] search(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 23, 54, 52, 53 },
                { 12, 66, 55, 22, 45, 68 },
                { 12, 34, 56, 78, 89, 9 }
        };
        int[] ans = search(arr, 12);
        System.out.println(Arrays.toString(ans));
    }
}
