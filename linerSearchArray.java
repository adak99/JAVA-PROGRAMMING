import java.util.Scanner;

public class linerSearchArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int number[] = new int[size];

        System.out.println("Enter input: ");
        for (int i = 0; i < size; i++) {
            number[i] = scan.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = scan.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("X found in index number: " + i);
            }
        }
    }
}
