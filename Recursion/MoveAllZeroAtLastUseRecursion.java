// move all zeros at the last 
public class MoveAllZeroAtLastUseRecursion {
    public static void moveZero(int arr[], int index, int moveIndex) {
        if (index == arr.length) { // base case
            return;
        }

        if (arr[index] != 0) {
            int temp = arr[moveIndex];
            arr[moveIndex] = arr[index];
            arr[index] = temp;
            moveZero(arr, index + 1, moveIndex + 1);
        } else {
            moveZero(arr, index + 1, moveIndex);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 3, 0, 4 };
        moveZero(arr, 0, 0);

        for (int result : arr) {
            System.out.print(result + " ");
        }
    }
}
