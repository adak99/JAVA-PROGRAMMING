import java.util.Scanner;

public class Question_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scan.nextInt();

		System.out.print("Enter second number: ");
		int num2 = scan.nextInt();

		System.out.print("Enter third number: ");
		int num3 = scan.nextInt();
		scan.close();

		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("Numbers are not distinct.");
		} else {
			int largest;

			if (num1 > num2 && num1 > num3) {
				largest = num1;
			} else if (num2 > num3 && num2 > num3) {
				largest = num2;
			} else {
				largest = num3;
			}

			System.out.println("Largest of three number ( " + num1 + "," + num2 + "," + num3 + ") is: " + largest);
		}
	}
}
