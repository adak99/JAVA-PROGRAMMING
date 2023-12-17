/* 

*****
*****
*****
*****

*/

import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= n; j++) { // outer loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
