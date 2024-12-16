import java.util.Arrays;

public class FindMissionNumber {

    static int bainarySearch(int[] arr, int checkNumber) {
        int strIdx = 0;
        int endIdx = arr.length;

        while (strIdx <= endIdx) {
            int mid = strIdx + (endIdx - strIdx) / 2;

            if (checkNumber < arr[mid]) {
                endIdx = mid - 1;
            } else if (checkNumber > arr[mid]) {
                strIdx = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static void findMissionNumber(int[] arr) {
        Arrays.sort(arr); // sort array

        for (int i = 0; i < arr.length - 1; i++) {
            int checkNumber = arr[i] + 10;

            if (bainarySearch(arr, checkNumber) == -1) {
                System.out.println("Missing number: " + checkNumber);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 60 };

        findMissionNumber(arr);

    }
}
