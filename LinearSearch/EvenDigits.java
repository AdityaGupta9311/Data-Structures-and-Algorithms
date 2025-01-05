public class EvenDigits {
    static int findNum(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int i) {
        int number = digits(i);
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int i) {
        int count = 0;
        while (i > 0) {
            count++;
            i /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 4, 65, 67, 98 ,33};

        System.out.println(findNum(arr));
    }
}
