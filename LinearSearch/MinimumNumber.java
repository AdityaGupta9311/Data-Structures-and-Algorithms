public class MinimumNumber {

    static int mini(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -23, 42, 45, 22 };
        System.out.println(mini(arr));
    }
}
