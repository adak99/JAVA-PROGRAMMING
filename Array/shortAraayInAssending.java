import java.util.Scanner;

public class shortAraayInAssending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt(); // array size input by the user

        // create array
        int[] arr = new int[size];

        // input
        System.out.print("Enter inputs: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt(); // the inputs taken by the user
        }

        // logic to shorting the array element in assending order
        int temp = 0; // take a integer for swaping values, set the integer name is "temp"
        for (int i = 0; i < size; i++) { // take a nested for loop
            for (int j = 0; j < size; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // output
        System.out.print("Output: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}
