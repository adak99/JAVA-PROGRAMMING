import java.util.Arrays;

public class removeDuplicateLogic2 {
    public static void printOriginalArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void removeDuplicateElement(int[] arr) {
        Arrays.sort(arr);// sorting the array

        int j = 0;
        int storeOriginalValue = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
                storeOriginalValue++;
            }
        }

        arr[j] = arr[arr.length - 1];

        for (int i = 0; i < storeOriginalValue; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 3, 4, 4 };

        System.out.print("Original array: ");
        printOriginalArray(arr);

        System.out.print("\nAfter removing duplicate element: ");
        removeDuplicateElement(arr);
    }
}
