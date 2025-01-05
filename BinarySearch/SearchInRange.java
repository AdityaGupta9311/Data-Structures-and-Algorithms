package BinarySearch;

public class SearchInRange {

    static int search(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 34, 54, 74, 76, 99 };
        int start = 1;
        int end =10;
        int target = 99;

        System.out.println(search(arr, start, end, target));

    }
}
