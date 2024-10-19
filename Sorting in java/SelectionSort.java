// selection sort in java
public class SelectionSort {
    public static void printArr(int[] arr) {
        for (int resutl : arr) {
            System.out.print(resutl + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 2, 1, 3 };

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArr(arr);
    }
}
