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

    }
}
