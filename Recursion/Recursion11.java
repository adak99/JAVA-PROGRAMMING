// Find the array is shorted or not
public class Recursion11 {
    public static boolean isShorted(int arr[], int index) {
        if (arr[index] == arr.length - 1) { // base case
            return true;
        }

        if (arr[index] >= arr[index + 1]) {
            return false;
        }
        return isShorted(arr, index + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3 };
        System.out.println(isShorted(arr, 0));
    }
}
