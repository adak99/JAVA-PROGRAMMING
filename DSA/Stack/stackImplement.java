import java.util.Scanner;

class stack {
    private int size;
    private int top;
    private int[] arr;

    stack(int size) {
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is over flow " + value + " can't push.");
        } else {
            System.out.print(value + " push in a stack");
            arr[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is under flow, no items can be poped");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public void getData() {
        if (top == -1) {
            System.out.println("The stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class stackImplement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scan.nextInt();

        stack stack = new stack(size); // obj crate

        while (true) {
            System.out.println("\n\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = scan.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println(poppedValue + " is popped.");
                    }
                    break;
                case 3:
                    System.out.println("Stack Elements: ");
                    stack.getData();
                    break;
                case 4:
                    System.out.println("Exit program.");
                    scan.close();
                    return;
                default:
                    System.out.println("Try again.");
                    break;
            }
        }
    }
}