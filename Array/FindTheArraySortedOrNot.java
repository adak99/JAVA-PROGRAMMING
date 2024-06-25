public class FindTheArraySortedOrNot {

    public static void calArray(int arr[], boolean isSorted) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    isSorted = false;
                    break;
                }
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 4 };
        boolean isSorted = true;
        calArray(arr, isSorted);
    }
}
