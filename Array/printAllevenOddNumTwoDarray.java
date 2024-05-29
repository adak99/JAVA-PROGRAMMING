import java.util.Scanner;

public class printAllevenOddNumTwoDarray {

    public static void calculateOddEven(int arr[][], int row, int col) {

        // print even numbers
        System.out.println("Even Numbers: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        // print odd number
        System.out.println("Odd numbers: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 != 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        // print total count of the even and odd number in array elements
        int even = 0, odd = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Total numbers of even number:  " + even);
        System.out.println("Total numbers of odd number: " + odd);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the row size of the array: ");
        int row = scan.nextInt();
        System.out.print("Enter the column size of the array: ");
        int col = scan.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        calculateOddEven(arr, row, col);
        scan.close();
    }
}
