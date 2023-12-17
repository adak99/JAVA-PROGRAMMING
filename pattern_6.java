/* 

1 
1 2 
1 2 3 
1 2 3 4
1 2 3 4 5

*/

import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a No:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) {// outer loop
            for (int j = 1; j <= i; j++) {// iner loop
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
