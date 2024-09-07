public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add element in the first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add element in the last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // print linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL n = new LL();

        n.addLast(10);
        n.addLast(20);
        n.addLast(30);
        n.addLast(40);
        n.addLast(50);

        n.printList();
    }
}