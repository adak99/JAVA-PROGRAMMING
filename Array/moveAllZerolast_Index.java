public class moveAllZerolast_Index {
    public static void moveAllZero(int arr[]) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 3, 0, 4, 0, 0, 5 };
        moveAllZero(arr);
    }
}
