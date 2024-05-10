import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int i;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value:-");

        for (i = 0; i <= 4; i++) {
            arr[i] = scan.nextInt();
        }
        for (i = 0; i <= 4; i++) {
            System.out.println("Value" + arr[i]);
        }
    }
}