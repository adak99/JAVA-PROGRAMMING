public class insertion {
    public static void main(String args[]) {

        int arr[] = { 4, 1, 3, 2, 0 };

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > current; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = current;
        }

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
