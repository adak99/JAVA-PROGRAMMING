import java.util.Arrays;

public class sumOfNonDuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 20, 25 };

        Arrays.sort(arr); // srot array

        int idx = 0;
        int sizeOfNonDuplicateArr = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[idx] = arr[i];
                idx++;
                sizeOfNonDuplicateArr++;
            }
        }

        int sum = 0;

        System.out.print("Non duplicate elements: ");
        for (int i = 0; i < sizeOfNonDuplicateArr; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println("\nSum: " + sum);
    }
}
