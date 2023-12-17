/* 

1 
0 1
1 0 1
0 1 0 1 
1 0 1 0 1

*/

import java.util.Scanner;

public class pattern_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a No:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) {// outer loop
            for (int j = 1; j <= i; j++) {// iner loop
                int sum = i + j;
                if (sum % 2 == 0) {// if i,j value are even number then print 1
                    System.out.print("1 ");
                } else {// if i,j value are not even number then print 0
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
