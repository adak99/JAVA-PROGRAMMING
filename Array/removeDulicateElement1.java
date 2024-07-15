import java.util.Arrays;

public class removeDulicateElement1 {
    public static void printOriginalArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void removeDuplicate(int arr[], int temp[]) {
        Arrays.sort(arr);

        int j = 0;
        int dulicateElement = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
                dulicateElement++;
            }
        }

        for (int i = 0; i < dulicateElement; i++)
            System.out.print(temp[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 4, 5 };
        int temp[] = new int[arr.length];

        System.out.print("Print original array: ");
        printOriginalArray(arr);

        System.out.print("\nAfter remove duplicate elements: ");
        removeDuplicate(arr, temp);
    }
}