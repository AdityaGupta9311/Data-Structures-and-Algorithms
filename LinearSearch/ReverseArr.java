package LinearSearch;

import java.util.Scanner;

public class ReverseArr {

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int size = s1.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);

        reverse(arr);

        // Print the reversed array
        System.out.println("Reversed Array: ");
        printArray(arr);
    }
}
