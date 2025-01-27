public class Pratice1 {

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static int singlevalue(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique ^= i;
        }
        return unique;
    }

    public static void main(String[] args) {
        // int n = 21;
        // System.out.println(isOdd(n));

        int[] arr = { 2, 3, 4, 5, 3, 2, 4 };
        System.out.println(singlevalue(arr));
    }
}
