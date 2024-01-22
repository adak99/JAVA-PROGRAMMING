import java.util.Scanner;

public class functionQtwo {

    public static int sumOfoddNumbers(int n) {

        int i, sum = 0;

        System.out.print("Odd numbers form 1 to " + n + " is : ");

        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = scan.nextInt();

        System.out.print("\nThe sum fo all odd numbers form 1 to " + n + " is : " + sumOfoddNumbers(n));
    }
}