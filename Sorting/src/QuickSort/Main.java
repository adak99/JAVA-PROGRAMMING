package QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 4, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int idx = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, idx);
                idx++;
            }
        }

        swap(arr, idx, high);
        return idx;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
