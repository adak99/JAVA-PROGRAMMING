import java.util.*;

public class copyArrayElementsOf2DArray {

    public static void print2DcopyArrayElements(int a[][], int b[][]) {
        b = a;

        System.out.println("The elements of array of a[] is:  ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The elements of array of b[] is: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the rows of the array: ");
        int row = scan.nextInt();
        System.out.print("Enter the columns of the array: ");
        int col = scan.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[a.length][a.length];

        System.out.println("Enter input: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                a[i][j] = scan.nextInt();

        print2DcopyArrayElements(a, b);
        scan.close();
    }
}