class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueULL {
    private node front;
    private node rear;

    QueueULL() {
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // endqueue
    public void enqueue(int data) {
        node newNode = new node(data);
        if (rear == null) {
            front = rear = newNode;
            System.out.println("Enqueue: " + data);
            return;
        }

        rear.next = newNode;
        rear = newNode;
        System.out.println("Enqueue: " + data);
    }

    // dequeue
    public int dequeque() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int frontValue = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return frontValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return front.data;
    }

    public static void main(String[] args) {
        QueueULL q = new QueueULL();

        for (int i = 10; i <= 40; i += 10) {
            q.enqueue(i);
        }

        System.out.print("Queue Elements: ");
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.dequeque();
        }
    }
}
