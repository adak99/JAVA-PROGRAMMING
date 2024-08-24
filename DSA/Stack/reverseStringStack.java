import java.util.Scanner;

class Stack {
    private char[] arr;
    private int top;

    public Stack(int size) {
        this.arr = new char[size];
        this.top = -1;
    }

    public void push(char ch) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow.");
        } else {
            arr[++top] = ch;
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return '\0';
        } else {
            return arr[top--];
        }
    }
}

public class reverseStringStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack stack = new Stack(20);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        System.out.print("Reverse string: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = stack.pop();
            System.out.print(ch);
        }
        scan.close();
    }
}