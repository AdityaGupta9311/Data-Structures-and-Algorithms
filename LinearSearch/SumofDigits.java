import java.util.Scanner;

public class SumofDigits {

    static void sumdigits(int[] sum) {
        int sum1 = 0;
        for (int i = 0; i <= sum.length; i++) {
            sum1 += i;
        }
        System.out.println(sum1);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = s1.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of Arrays : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.nextInt();
        }
        System.out.print("Sum of arry : ");
        sumdigits(arr);
    }

}
