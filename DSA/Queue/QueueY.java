public class QueueY {
    static class queue {
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public void add(int data) {
            if (rear == size - 1) {
                System.err.println("Queue is full.");
                return;
            }

            arr[++rear] = data;
        }

        // dequeque
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}