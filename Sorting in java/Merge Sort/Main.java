import java.util.Arrays;

public class Main {
    public static int[] concqure(int[] left, int[] right) {
        int[] newArr = new int[left.length + right.length];

        int i = 0; // indicate left array index
        int j = 0; // indicates right array index
        int k = 0; // indicates new array index

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                newArr[k++] = left[i++];
            } else {
                newArr[k++] = right[j++];
            }
        }

        // if a elements bound
        while (i < left.length) {
            newArr[k++] = left[i++];
        }

        while (j < right.length) {
            newArr[k++] = right[j++];
        }

        return newArr;

    }

    public static int[] divided(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = divided(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divided(Arrays.copyOfRange(arr, mid, arr.length));

        return concqure(left, right);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] ans = divided(arr);

        System.out.println(Arrays.toString(ans));
    }
}