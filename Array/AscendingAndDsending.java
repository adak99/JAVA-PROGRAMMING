import java.util.Scanner;

public class AscendingAndDsending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        // input array index
        System.out.print("Input:- ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // logic for ascending order
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Ascending order output
        System.out.print("Ascending order output:- ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // logic for descending order
        int r = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    r = arr[i];
                    arr[i] = arr[j];
                    arr[j] = r;
                }
            }
        }

        // Descebding order output
        System.out.print("Descebing order output:- ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}