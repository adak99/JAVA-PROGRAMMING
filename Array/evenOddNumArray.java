import java.util.Scanner;

public class evenOddNumArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        countOddEven(arr, size);
        scan.close();
    }

    public static void countOddEven(int arr[], int size) {
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Total number of even number: " + evenNumber);
        System.out.println("Total number of odd number: " + oddNumber);
    }
}
