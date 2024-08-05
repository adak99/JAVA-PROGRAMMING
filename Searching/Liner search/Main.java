import java.util.Arrays;

public class Main {
    public static void linerSearch(int[] arr, int size, int searchItem) {
        // print array
        System.out.println("Array elements: " + Arrays.toString(arr));
        System.out.println("Seraching item: " + searchItem);

        for (int i = 0; i < size; i++) {
            if (searchItem == arr[i]) {
                System.out.println("Location found at index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int size = arr.length;
        int searchItem = 3;

        linerSearch(arr, size, searchItem);

    }
}
