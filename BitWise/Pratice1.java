public class Pratice1 {

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        int n = 21;
        System.out.println(isOdd(n));
    }
}
