/* 
     *****
    *****
   *****
  *****
 *****

*/

import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a No:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
