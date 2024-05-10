import java.util.Scanner;

public class functionQthird {

    private static int findGraterNumber(int a, int b) {

        if (a > b) {
            System.out.println(a + " greater than " + b);
            return a;
        } else {
            System.out.println(b + " greater than " + a);
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = scan.nextInt();
        System.out.print("Enter the value of B: ");
        int b = scan.nextInt();

        System.out.println("Answer: " + findGraterNumber(a, b));
    }
}
