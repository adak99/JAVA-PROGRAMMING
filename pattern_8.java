/* 

1 
2 3 
4 5 6 
7 8 9 10
11 12 13 14 15

*/

import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {

        int number = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a No:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= i; j++) {// iner loop
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
