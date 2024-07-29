public class moveAllZerolast_Index {

    private static void moveZero(int arr[]) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.print("Arter moving all the zeros at the last index: ");
        for (int resutl : arr) {
            System.out.print(resutl + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 0, 2, 0, 1, 4, 3, 0, 5, 0, 0 };
        moveZero(arr);
    }
}
