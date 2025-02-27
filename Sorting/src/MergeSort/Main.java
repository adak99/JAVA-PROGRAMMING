package MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        int[] result = divided(arr, 0, arr.length - 1);
        printArr(result);
    }

    public static int[] divided(int[] arr, int strIdx, int endIdx) {
        if (strIdx >= endIdx)
            return new int[]{arr[strIdx]};

        int mid = strIdx + (endIdx - strIdx) / 2;

        int[] left = divided(arr, strIdx, mid);
        int[] right = divided(arr, mid + 1, endIdx);

        return conqure(left, right);
    }

    private static int[] conqure(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];

        int i = 0; // handel left array index
        int j = 0; // handel right array index
        int k = 0; // handel new array index

        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                merge[k++] = left[i++];
            else
                merge[k++] = right[j++];
        }

        while (i < left.length) {
            merge[k++] = left[i++];
        }

        while (j < right.length) {
            merge[k++] = right[j++];
        }
        return merge;
    }

    public static void printArr(int[] arr) {
        for (int key : arr) {
            System.out.print(key + " ");
        }
    }
}
