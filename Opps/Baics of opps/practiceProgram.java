import java.util.Scanner;

public class practiceProgram {
    int a, b, sum;
    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Enter the value of A: ");
        a = scan.nextInt();
        System.out.print("Enter the value of B: ");
        b = scan.nextInt();
    }

    public void cal() {
        sum = a + b;
    }

    public void display() {
        System.out.print("Sum: " + sum);
    }

    public static void main(String[] args) {
        practiceProgram obj = new practiceProgram();

        obj.input();
        obj.cal();
        obj.display();
    }
}