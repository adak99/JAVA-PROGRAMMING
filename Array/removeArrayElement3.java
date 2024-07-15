import java.util.HashSet;

public class removeArrayElement3 {
    public static void printOriginalArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void removeDuplicate(int arr[], HashSet<Integer> duplicate) {
        for (int i = 0; i < arr.length; i++)
            duplicate.add(arr[i]);

        for (int result : duplicate)
            System.out.print(result + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 2, 4, 2, 4, 5, 4 };
        HashSet<Integer> duplicate = new HashSet<>();

        System.out.print("Print origina array: ");
        printOriginalArray(arr);
        System.out.print("\nAfter removing the duplicate element: ");
        removeDuplicate(arr, duplicate);
    }
}
