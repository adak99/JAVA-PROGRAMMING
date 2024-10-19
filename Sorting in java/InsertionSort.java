// Insertion Sort in java

public class InsertionSort {
    public static void printArr(int[] arr) {
        for (int resutl : arr) {
            System.out.print(resutl + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 2, 1, 3 };

        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int j = i - 1;
            while (j >= 0 && currentElement < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentElement;
        }

        printArr(arr);
    }
}
