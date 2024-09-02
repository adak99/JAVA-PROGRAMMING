public class BinarySearch {
    public static int bianrySearch(int[] arr, int target) {
        int strIdx = 0;
        int endIdx = arr.length - 1;

        while (strIdx <= endIdx) {
            int mid = strIdx + (endIdx - strIdx) / 2;

            if (target < arr[mid]) {
                endIdx = mid - 1;
            } else if (target > arr[mid]) {
                strIdx = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 4;

        int ans = bianrySearch(arr, target);

        if (ans == -1) {
            System.out.print("The target element not found");
        } else {
            System.out.println("The target element " + target + " found at index: " + ans);
        }
    }
}