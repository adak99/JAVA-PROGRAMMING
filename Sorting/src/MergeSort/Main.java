package MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2, 1};
        int strIdx = 0, endIdx = arr.length - 1;
        int[] result = divided(arr, strIdx, endIdx);
        printArr(result);
    }

    private static int[] divided(int[] arr, int strIdx, int endIdx) {
        if (strIdx >= endIdx)
            return new int[]{arr[strIdx]};

        int mid = strIdx + (endIdx - strIdx) / 2;

        int[] left = divided(arr, strIdx, mid);
        int[] right = divided(arr, mid + 1, endIdx);

        return conqure(arr, left, right);
    }

    private static int[] conqure(int[] arr, int[] left, int[] right) {
        int[] mergeArr = new int[left.length + right.length];

        int i = 0; // left array index
        int j = 0; // right array index
        int k = 0; // new array index

        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                mergeArr[k++] = left[i++];
            else
                mergeArr[k++] = right[j++];
        }

        while (i < left.length) {
            mergeArr[k++] = left[i++];
        }

        while (j < right.length) {
            mergeArr[k++] = right[j++];
        }

        return mergeArr;
    }

    public static void printArr(int[] arr) {
        for (int key : arr) {
            System.out.print(key + " ");
        }
    }
}
