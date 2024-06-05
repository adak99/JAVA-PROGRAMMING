import java.util.Scanner;

public class deleteArrayElement {

    public static void printArray(int arr[], int size, int deleteElement) {

        System.out.print("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < size; i++) {
            if (deleteElement == arr[i]) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }

        System.out.print("\nAfter delte item: ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the array elements:  ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter the delete items of the arr[]:  ");
        int deleteElement = scan.nextInt();

        printArray(arr, size, deleteElement);

        scan.close();
    }
}
