class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackULL {
    private Node top;

    StackULL() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " is push");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow.");
            return -1;
        }

        int popValue = top.data;
        top = top.next;
        System.out.println(popValue + " is pop.");
        return popValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is underflow.");
            return -1;
        }

        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack elemetns: ");
        Node currNode = top;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackULL stack = new StackULL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.display();
        stack.pop();
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
    }
}
