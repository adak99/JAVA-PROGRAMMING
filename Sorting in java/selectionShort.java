public class selectionShort {
    public static void main(String args[]) {

        int arr[] = { 4, 1, 3, 2, 0 };

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
