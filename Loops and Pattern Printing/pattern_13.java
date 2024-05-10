/* 
   1 
  2 2 
 3 3 3 
4 4 4 4 

*/

import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}