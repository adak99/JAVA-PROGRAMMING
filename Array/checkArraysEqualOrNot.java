import java.util.Scanner;
import java.util.Arrays;

public class checkArraysEqualOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array a[]: ");
        int size1 = scan.nextInt();
        System.out.print("Enter the size of array b[]: ");
        int size2 = scan.nextInt();

        int a[] = new int[size1];
        int b[] = new int[size2];

        System.out.print("Enter the inputs of a[]: ");
        for (int i = 0; i < size1; i++)
            a[i] = scan.nextInt();

        System.out.print("Enter the inputs of b[]: ");
        for (int i = 0; i < size2; i++)
            b[i] = scan.nextInt();

        chekArrayValue(a, b);
        scan.close();

    }

    public static void chekArrayValue(int a[], int b[]) {

        if (Arrays.equals(a, b))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
