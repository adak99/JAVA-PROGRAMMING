import java.util.Scanner;

public class functionQone {

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = scan.nextInt();
        System.out.print("Enter the value of B: ");
        int b = scan.nextInt();
        System.out.print("Enter the value of C: ");
        int c = scan.nextInt();
        scan.close();

        System.out.println("Answer: " + average(a, b, c));
        scan.close();
    }
}