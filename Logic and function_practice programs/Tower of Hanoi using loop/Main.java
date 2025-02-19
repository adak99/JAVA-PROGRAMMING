public class Main {
    // Implement stack
    static class Stack<K> {
        private class Node {
            K data;
            Node next;

            Node(K data) {
                this.data = data;
                next = null;
            }
        }

        private Node top = null;

        public boolean isEmpty() {
            return top == null;
        }

        public void push(K data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public K pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return null;
            }
            K popVal = top.data;
            top = top.next;
            return popVal;
        }
    }

    static class Move {
        int disk;
        String source, destination;

        Move(int disk, String source, String destination) {
            this.disk = disk;
            this.source = source;
            this.destination = destination;
        }

        @Override
        public String toString() {
            return String.format("Move disk %s to %s.", source, destination);
        }
    }

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        Stack<Move> stack = new Stack<>();
        stack.push(new Move(n, source, destination));

        while (!stack.isEmpty()) {
            Move currentMove = stack.pop();

            if (currentMove.disk == 1) {
                System.out.println(currentMove);
            } else {
                stack.push(new Move(currentMove.disk - 1, helper, destination));
                stack.push(new Move(1, source, destination));
                stack.push(new Move(currentMove.disk - 1, source, helper));
            }
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(3, "SCOURCE", "DESTIONATION", "DESTINATION");
    }
}