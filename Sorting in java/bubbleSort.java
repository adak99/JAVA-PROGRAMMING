public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 2, 0 };

        int i = 0;
        while (i < arr.length - 1) {
            int j = 0;
            while (j < arr.length - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                j++;
            }
            i++;
        }

        int k = 0;
        while (k < arr.length) {
            System.out.print(arr[k] + " ");
        }
    }
}
