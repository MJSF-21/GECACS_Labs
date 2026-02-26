import java.util.Scanner;

public class Practical2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        partitionOddEven(arr);

        System.out.println("Array after moving odd numbers to the front:");
        for (int num : arr) {
            System.out.print(num + "\t");
        }

        scanner.close();
    }

    // Method to move odd numbers to the front and even numbers to the back
    public static void partitionOddEven(int[] arr) {

        int leftPointer = 0; // Tracks where the next odd number should go

        for (int rightPointer = 0; rightPointer < arr.length; rightPointer++) {
            if (arr[rightPointer] % 2 != 0) { // If current element is odd
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
                leftPointer++;
            }
        }
    }
}