class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linklist {
    private static node head = null;
    private static int size = 0;

    public static void addFirst(int data) { // add first
        node newNode = new node(data);
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
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        node currNode = head;
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

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        node secondLastNode = head;
        node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
        size--;
    }

    public static void printLL() { // print list
        if (head == null) {
            System.out.println("This list empty.");
            return;
        }

        node currentNode = head;
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