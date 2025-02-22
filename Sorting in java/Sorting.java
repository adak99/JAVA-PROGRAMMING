public class Sorting {

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // bubble sort
    public static int[] bubbleSort(int[] arr) { // complexity: O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
        return arr;
    }

    // selection sort
    public static int[] selectionSort(int[] arr) { // complexity: O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIdx]) {
                    smallestIdx = j;
                }
            }

            swap(arr, i, smallestIdx);
        }
        return arr;
    }

    // insertion sort
    public static int[] insertionSort(int[] arr) { // complexity: O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                else
                    break;
            }
        }
        return arr;
    }
}
