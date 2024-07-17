public class mergeSort {

    public static void conquer(int arr[], int sIndex, int mid, int eIndex) {
        int mergedArr[] = new int[eIndex - sIndex + 1];

        int index1 = sIndex;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= eIndex) {
            if (arr[index1] <= arr[index2])
                mergedArr[x++] = arr[index1++];
            else
                mergedArr[x++] = arr[index2++];
        }

        while (index1 <= mid) {
            mergedArr[x++] = arr[index1++];
        }

        while (index2 <= eIndex) {
            mergedArr[x++] = arr[index2++];
        }

        for (int i = 0, j = sIndex; i < mergedArr.length; i++, j++) {
            arr[j] = mergedArr[i];
        }
    }

    public static void divide(int[] arr, int sIndex, int eIndex) {
        if (sIndex >= eIndex) {
            return;
        }

        int mid = sIndex + (eIndex - sIndex) / 2;
        divide(arr, sIndex, mid);
        divide(arr, mid + 1, eIndex);
        conquer(arr, sIndex, mid, eIndex);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int size = arr.length;

        divide(arr, 0, size - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
