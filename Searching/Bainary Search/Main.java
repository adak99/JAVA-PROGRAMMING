public class Main {
    public static int bainarySearch(int[] arr, int target) {
        int strIdx = 0;
        int endIdx = arr.length - 1;
        int n = 0;

        while (strIdx <= endIdx) {
            n++;

            int mid = strIdx + (endIdx - strIdx) / 2;

            if (arr[mid] == target) {
                System.out.println("Minimum number of comparison is: 1");
                System.out.println("Maximum number of comperison is: " + n);
                return mid + 1;
            } else if (target < arr[mid]) {
                endIdx = mid + 1;
            } else {
                strIdx = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 9;
        int ans = bainarySearch(arr, target);

        if (ans != -1) {
            System.out.println("This element not found in the arrya");
        } else {
            System.out.println("Location: " + ans);
        }
    }
}