public class BinarySearchUsingRecursion {
    public static int binarySearch(int[] arr, int target, int strIdx, int endIdx) {
        if (strIdx > endIdx) {
            return -1;
        }

        int mid = strIdx + (endIdx - strIdx) / 2;

        if (target == arr[mid]) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, target, strIdx, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, endIdx);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int target = 50;

        int result = binarySearch(arr, target, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
