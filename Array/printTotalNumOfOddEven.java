import java.util.Scanner;

public class printTotalNumOfOddEven {
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
        int even = 0, odd = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Total number of even number is: " + even);
        System.out.println("Total number of odd number is: " + odd);
    }
}
