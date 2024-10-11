class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linklist {
    private static Node head = null;
    private static int size = 0;

    public static void addFirst(int data) { // add first
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void addLast(int data) { // add last
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        size++;
    }

    public static void deleteFirst() { // delete first
        if (head == null) {
            System.out.println("This list empty.");
            return;
        }

        size--;
        head = head.next;
    }

    public static void deleteLast() { // delete last
        if (head == null) {
            System.out.println("This list empty.");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public static void printLL() { // print list
        if (head == null) {
            System.out.println("This list empty.");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static int getSize() {
        return size;
    }

    public static void main(String[] args) {
        addLast(10);
        addLast(20);
        addLast(30);
        printLL();
        System.out.println("Total size of the list is: " + getSize());
    }
}