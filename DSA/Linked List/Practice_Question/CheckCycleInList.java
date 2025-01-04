public class CheckCycleInList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;

    // Add nodes to the linked list
    public static void addNode(int data) {
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

    // Create a cycle in the linked list
    public static void createCycle() {
        if (head == null || head.next == null) {
            return; // No cycle if list has 0 or 1 node
        }

        Node lastNode = head;
        Node connectNode = head; // Node to connect the last node to create a cycle

        // Traverse to the last node
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        // Connect the last node to the second node (or any valid node to form a cycle)
        connectNode = head.next;
        lastNode.next = connectNode;
    }

    // Delete a cycle in the linked list
    public static void deleteCycle() {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        // Detect cycle using two-pointer approach
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                break;
            }
        }

        // If no cycle detected, return
        if (fast == null || fast.next == null) {
            return;
        }

        // Find the start of the cycle
        slow = head;
        Node prev = null; // To track the node before the cycle starts

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Break the cycle
        prev.next = null;
    }

    // Check if the linked list contains a cycle
    public static boolean hasCycle() {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        addNode(10);
        addNode(30);
        addNode(40);
        addNode(50);

        createCycle();

        if (hasCycle()) {
            System.out.println("Cycle was created.");
            deleteCycle();

            // Verify if the cycle was removed
            if (!hasCycle()) {
                System.out.println("Cycle was removed.");
            } else {
                System.out.println("Cycle still exists.");
            }
        } else {
            System.out.println("Cycle was not created.");
        }
    }
}
