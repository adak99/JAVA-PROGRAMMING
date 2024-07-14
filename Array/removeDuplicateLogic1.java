import java.util.Arrays;

public class removeDuplicateLogic1 {
    public static void printOriginalArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void removeDuplicateElement(int[] arr, int[] temp) {
        Arrays.sort(arr);// sorting the array

        int j = 0; // j indicates index of temp array
        int storeOriginalValue = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
                storeOriginalValue++;
            }
        }

        temp[j] = arr[arr.length - 1];

        for (int i = 0; i < storeOriginalValue; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 3, 4 };
        int temp[] = new int[arr.length];

        System.out.print("Original array: ");
        printOriginalArray(arr);

        System.out.print("\nAfter removing duplicate element: ");
        removeDuplicateElement(arr, temp);
    }
}
