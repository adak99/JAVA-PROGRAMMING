class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linklist {
    private node head = null;

    public void addFirst(int data) { // add elements at the first
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) { // add elements at the last
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void deletFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        node secondLastNode = head;
        node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public void printLL() { // print list
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        Linklist a = new Linklist();
        a.addLast(10);
        a.addLast(30);
        a.addLast(40);
        a.addLast(20);

        a.deleteLast();

        a.printLL();
    }
}
