import java.util.Scanner;

public class findSecondLargestNum {

    private static void calculateArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int num = 0;
        for (int i = 0; i < size - 1; i++) {
            num = arr[i];
        }
        System.out.print("Second largest number is: " + num);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        calculateArray(arr, size);
        scan.close();
    }
}
