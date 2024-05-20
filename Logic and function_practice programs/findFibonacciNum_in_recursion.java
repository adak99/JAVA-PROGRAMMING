import java.util.Scanner;

public class findFibonacciNum_in_recursion {

    static void printFiboserise(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
    }

    static int fibo(int n) {

        if (n <= 1)
            return n;
        else
            return (fibo(n - 1) + fibo(n - 2));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfTerams;

        System.out.print("Enter a number:- ");
        numberOfTerams = scan.nextInt();

        System.out.print("Fibonacci Serise:- ");
        printFiboserise(numberOfTerams);
        scan.close();
    }
}
