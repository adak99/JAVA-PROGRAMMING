import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 7, 9, 11, 8 };

        Arrays.sort(arr);

        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double mean = sum / arr.length;

        double median;
        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            median = arr[arr.length / 2];
        }

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }
}
