public class moveAllZerolast_Index {

    private static void moveZero(int arr[]) {
        int n = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[n];
                arr[n] = arr[i];
                arr[i] = temp;
                n++;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 0, 2, 0, 1, 4, 3, 0, 5, 0 };
        moveZero(arr);

        System.out.print("Moving all the zero at the last: ");
        for (int result : arr) {
            System.out.print(result + " ");
        }

    }
}
