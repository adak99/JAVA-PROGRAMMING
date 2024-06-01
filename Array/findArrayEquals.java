import java.util.Scanner;

public class findArrayEquals {
    private static void calculateValue(int a[], int b[]) {
        boolean arrayEquals = true;

        if (a.length != b.length) {
            arrayEquals = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    arrayEquals = false;
                }
            }
        }

        if (arrayEquals) {
            System.out.println("Both the array elements is same.");
        } else {
            System.out.println("Both the array elemnets is not same.");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array of a[]: ");
        int siezA = scan.nextInt();
        System.out.print("Enter the size of the array of b[]: ");
        int siezB = scan.nextInt();

        int a[] = new int[siezA];
        int b[] = new int[siezB];

        System.out.print("Enter the value of a[]: ");
        for (int i = 0; i < siezA; i++) {
            a[i] = scan.nextInt();
        }

        System.out.print("Enter the value of b[]: ");
        for (int i = 0; i < siezA; i++) {
            b[i] = scan.nextInt();
        }

        calculateValue(a, b);
        scan.close();
    }
}
