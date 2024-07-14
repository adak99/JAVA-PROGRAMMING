import java.util.HashSet;

public class removeDuplicate {
    public static void printOriginalArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void removeDuplicateElement(int arr[], HashSet<Integer> uniqeElement) {
        for (int i = 0; i < arr.length; i++)
            uniqeElement.add(arr[i]);

        for (int result : uniqeElement)
            System.out.print(result + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 3, 5, 4, 3, 6, 5 };
        HashSet<Integer> uniqueElement = new HashSet<>();

        System.out.println("Original Array: ");
        printOriginalArray(arr);
        System.out.println("\nAfter removing duplicate elements: ");
        removeDuplicateElement(arr, uniqueElement);
    }
}
