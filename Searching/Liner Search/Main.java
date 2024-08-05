import java.util.Arrays;

public class Main {
    public static void linerSearch(int[] arr, int n) {
        System.out.println("Array elements: " + Arrays.toString(arr));
        System.out.println("Searching item: " + n);

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("The item found at index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 4;

        linerSearch(arr, n);
    }
}
