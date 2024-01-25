import java.util.Scanner;

public class eligibleTest {

    private static void eligible(int age) {

        if (age >= 18)
            System.out.print("Person eligible for vote.");
        else
            System.out.println("The person not eligible for vote.");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the age any person: ");
        int age = scan.nextInt();

        eligible(age);
    }
}
