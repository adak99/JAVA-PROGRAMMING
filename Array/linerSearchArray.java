import java.util.Scanner;

public class linerSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.println("Enter input: ");
        for (int i = 0; i < size; i++)
            number[i] = sc.nextInt();

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        for (int i = 0; i < number.length; i++)
            if (number[i] == x)
                System.out.println("X (" + x + ") found in index number: " + i);

        sc.close();
    }
}
