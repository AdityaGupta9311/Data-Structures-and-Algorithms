import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = s1.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.nextInt();
        }

        int[] even;
        int[] odd;

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.print(i);
            }
        }
    }
}
