package BasicSort;

import java.util.Arrays;

public class SortingInJava {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 4, 5};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    // bubble sort
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        return arr;
    }

    // selection sort
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest])
                    smallest = j;
            }

            swap(arr, i, smallest);
        }
        return arr;
    }

    // insertion sort
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[i] > arr[j])
                    swap(arr, i, j);
                else break;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
