import java.util.Scanner;

public class TwoDarrayFindValue {

    private static void methodCall() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = scan.nextInt();
        System.out.print("Enter columns: ");
        int col = scan.nextInt();

        int[][] number = new int[row][col];

        // input
        System.out.println("Enter input: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = scan.nextInt();
            }
        }

        // Delear find value
        System.out.print("Enter number of X : ");
        int x = scan.nextInt();

        // output
        System.out.println("Output: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (number[i][j] == x) {
                    System.out.print("X value foudn in  rows of " + i + " and columns of " + j);
                }
            }
        }

        scan.close();
    }

    public static void main(String[] args) {
        methodCall();
    }
}