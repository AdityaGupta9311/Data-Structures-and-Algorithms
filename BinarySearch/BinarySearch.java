public class BinarySearch {

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // for finding middle value
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 22, 33, 43, 55, 66, 78, 78, 990, 999, 1111, 1223 };
        int ans = search(arr, 1111);
        System.out.println(ans);
    }
}
