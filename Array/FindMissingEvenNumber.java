public class FindMissingEvenNumber {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 60 };

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        int exsum = 0;
        for (int i = min; i < max; i++) {
            exsum += arr[i];
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int missing = exsum - sum;

        System.out.println(missing);
    }
}
