import java.util.Scanner;

public class FindValueTwoDArray {

    private static void methodCall() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter rows of the array: ");
        int row = scan.nextInt();
        System.out.print("Enter columns of the array: ");
        int col = scan.nextInt();

        int[][] number = new int[row][col];

        // input
        System.out.println("Enter input: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = scan.nextInt();
            }
        }

        // Declear find value
        System.out.print("Enter value of the X : ");
        int x = scan.nextInt();

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (number[i][j] == x) {
                    System.out.println("The value of the X find in row of " + i + " and columns of " + j);
                }
            }
        }
    }

    public static void main(String args[]) {
        methodCall();
    }
}
