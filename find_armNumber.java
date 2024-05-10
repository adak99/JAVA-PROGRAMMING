import java.util.Scanner;

public class find_armNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, cal, rem, arm = 0;

        System.out.print("Enter a number: ");
        num = scan.nextInt();

        scan.close();

        cal = num;

        while (num > 0) {
            rem = num % 10;
            arm = (rem * rem * rem) + arm;
            num = num / 10;
        }

        if (cal == arm)
            System.out.println(cal + " is a Armstrong number.");
        else
            System.out.println(cal + " not a Armstrong number.");

    }
}
