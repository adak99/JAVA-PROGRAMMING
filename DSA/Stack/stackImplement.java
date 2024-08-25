class stack {
    public int size;
    public int top;
    public int[] arr;

    stack(int size) {
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is over flow " + value + " can't push.");
        } else {
            System.out.println(value + " push in a stack");
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

    public void clear() {
        if (top == -1) {
            System.out.println("Stack is already empty.");
        } else {
            for (int i = 0; i <= top; i++) {
                arr[i] = 0;
            }
            top = -1;
            System.out.println("Stack is cleared");
        }
    }

    public int peek(int pos) {

        int stackIdx = (top - pos) + 1;

        if (stackIdx < 0) {
            System.out.println("Not and valid positon for stack");
            return -1;
        } else {
            return arr[stackIdx];
        }
    }
}

public class stackImplement {
    public static void main(String[] args) {
        stack stack = new stack(4); // obj crate

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop() + " is poped");

        stack.clear();

        if (stack.top == -1) {
            System.out.println("Peek function not working");
        } else {
            for (int i = 1; i <= stack.top + 1; i++) {
                System.out.println("Position " + (stack.top - i + 1) + "-> " + stack.peek(i));
            }
        }
    }
}