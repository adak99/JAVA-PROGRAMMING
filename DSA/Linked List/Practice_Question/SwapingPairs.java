public class SwapingPairs {
    public static void main(String[] args) {
        addItems(10);
        addItems(20);
        addItems(30);
        addItems(40);

        head = swapPairs(head);
        printLL();
    }

    public static Node head = null;

    public static void addItems(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public static void printLL() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static Node swapPairs(Node head) {
        if (head == null || head.next == null)
            return head;

        Node firstNode = head;
        Node sechNode = head.next;
        firstNode.next = swapPairs(sechNode.next);
        sechNode.next = firstNode;
        return sechNode;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
