import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number A: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number B: ");
        int num2 = scan.nextInt();
        System.out.print("Enter number C: ");
        int num3 = scan.nextInt();
        scan.close();

        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Avarage of " + num1 + "," + num2 + "," + num3 + " is: " + avg);
    }
}
