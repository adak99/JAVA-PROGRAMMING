import java.util.Scanner;

public class find_value_of_x_in_TwoDarray {

    public static void findValue() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of Rows: ");
        int row = scan.nextInt();
        System.out.print("Enter number of Columns: ");
        int col = scan.nextInt();

        int[][] number = new int[row][col]; // create a tow D array

        System.out.println("Enter input: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = scan.nextInt();
            }
        }

        System.out.print("Enter the value of X : ");
        int x = scan.nextInt();

        System.out.println("Output: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (number[i][j] == x) {
                    System.out.println("The value of the X found in rows number : " + i + " and columns number: " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        findValue();
    }
}
