public class CercularQueue {
    static class queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue
        public static void add(int data) {
            if (isFull()) {
                System.err.println("Queue is full.");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeque
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            int result = arr[front];

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("remove: " + q.remove());
        q.add(60);
        System.out.println("remove: " + q.remove());
        q.add(70);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
