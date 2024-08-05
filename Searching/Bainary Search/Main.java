public class Main {
    public static int bainarySearch(int[] arr, int target) {
        int strIdx = 0;
        int endIdx = arr.length;

        while (strIdx <= endIdx) {
            int mid = strIdx + (endIdx - strIdx) / 2;

            if (target < arr[mid])
                endIdx = mid + 1;
            else if (target > arr[mid])
                strIdx = mid - 1;
            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 3;
        int ans = bainarySearch(arr, target);

        if (ans != -1)
            System.out.println("Location: " + ans);
        else
            System.out.println("Element not found.");
    }
}