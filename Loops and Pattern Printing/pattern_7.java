/*
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
 */

import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a No:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) { // iner loop
            for (int j = 1; j <= n - i + 1; j++) { // outer loop
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Differnt way to print same pattern_7
/*
 * for (int i = 0; i < n; i++) {
 * for (int j = 1; j <= n - i; j++) {
 * System.out.print(j + " ");
 * }
 * System.out.println();
 * }
 */