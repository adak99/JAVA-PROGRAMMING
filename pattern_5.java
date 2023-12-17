/* 
    *
   **
  ***
 ****
*****

*/

import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a No:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) {// outer loop
            for (int j = 1; j <= n - i; j++) {// iner loop using print space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");// iner loop using print star
            }
            System.out.println();
        }
    }
}
