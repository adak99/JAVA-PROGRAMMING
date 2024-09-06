import java.util.ArrayList;

public class StackImplementArr {
    static class Stack {
        public int size;

        public Stack(int size) {
            this.size = size;
        }

        ArrayList<Integer> list = new ArrayList<>(size);

        public boolean isFull() {
            return list.size() == size;
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int val) {
            if (isFull()) {
                System.out.println("Stack Overflow.");
            }
            list.add(val);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            int top = list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(100);

        stack.push(10);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int idx = 4;
        while (!stack.isEmpty()) {
            System.out.println("Positon " + idx + ": " + stack.peek());
            idx--;
            stack.pop();
        }
    }
}
