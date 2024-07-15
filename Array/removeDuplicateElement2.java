import java.util.Arrays;

public class removeDuplicateElement2 {
    public static void printOriginalArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void removeDuplicate(int arr[]) {
        Arrays.sort(arr);

        int j = 0;
        int dulicateElement = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
                dulicateElement++;
            }
        }

        for (int i = 0; i < dulicateElement; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 4, 5 };

        System.out.print("Print original array: ");
        printOriginalArray(arr);

        System.out.print("\nAfter remove duplicate elements: ");
        removeDuplicate(arr);
    }
}
