import java.util.Arrays;

public class mergeSort {
    // conqure part
    public static int[] concqure(int left[], int[] right) {
        // create a new array
        int mergedArray[] = new int[left.length + right.length];

        int i = 0; // i indicates the index of left divided array
        int j = 0; // j inidicates the index of right divided array
        int k = 0; // k indicates the index of merged array

        // concqure arrays
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArray[k++] = left[i++];
            } else {
                mergedArray[k++] = right[j++];
            }
        }

        // if element is bound
        while (i < left.length) {
            mergedArray[k++] = left[i++];
        }

        while (j < right.length) {
            mergedArray[k++] = right[j++];
        }

        return mergedArray;
    }

    // divide part
    public static int[] divide(int arr[]) {
        // base case
        if (arr.length == 1) {
            return arr;
        }

        // find mid
        int mid = arr.length / 2;
        // divided left part
        int left[] = divide(Arrays.copyOfRange(arr, 0, mid));
        // divide right part
        int right[] = divide(Arrays.copyOfRange(arr, mid, arr.length));

        // call concqure function
        return concqure(left, right);
    }

    // main funciton
    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };
        int result[] = divide(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
