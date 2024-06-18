//Move the first element at the last
public class MoveTheFirstElementAtLast {
    public static void movineItems(int arr[], int n, int temp) {
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        movineItems(arr, arr.length - 1, arr[0]);

        for (int result : arr) {
            System.out.print(result + " ");
        }
    }
}
