package createQueue;

import createNode.Node;

public class Queue {
    public static class QueueNode {
        Node data;
        QueueNode next;

        public QueueNode(Node data) {
            this.data = data;
        }
    }

    public static QueueNode front = null;
    public static QueueNode rear = null;

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public void add(Node data) {
        QueueNode newNode = new QueueNode(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public Node remove() {
        if (isEmpty()) {
            return null;
        }

        Node temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }

        return temp;
    }
}
