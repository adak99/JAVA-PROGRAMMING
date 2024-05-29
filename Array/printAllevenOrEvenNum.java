import java.util.Scanner;

public class printAllevenOrEvenNum {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        countOddEven(arr, size);
        scan.close();
    }

    private static void countOddEven(int arr[], int size) {

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        // print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
