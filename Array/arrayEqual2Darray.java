import java.util.Scanner;

public class arrayEqual2Darray {
    private static void valueCalculate(int a[][], int b[][]) {
        boolean arrayEquals = true;

        if (a.length != b.length || a[0].length != b[0].length) {
            arrayEquals = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i][j] != b[i][j]) {
                        arrayEquals = false;
                        break;
                    }
                }
            }
        }

        if (arrayEquals) {
            System.out.println("Both the array elements is same.");
        } else {
            System.out.println("Both the array elements is not same.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the row size of the arrya of a[][]: ");
        int rowA = scan.nextInt();
        System.out.print("Enter the column size of the arrya of a[][]: ");
        int colA = scan.nextInt();

        int a[][] = new int[rowA][colA];
        System.out.println("Enter the elements of a[][]: ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        System.out.print("Enter the row size of the arrya of b[][]: ");
        int rowB = scan.nextInt();
        System.out.print("Enter the column size of the arrya of b[][]: ");
        int colB = scan.nextInt();

        int b[][] = new int[rowB][colB];
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        valueCalculate(a, b);
        scan.close();

    }
}
