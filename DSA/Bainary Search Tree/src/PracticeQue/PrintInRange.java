public class PrintInRange {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }

        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data > y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int[] value = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int key : value) {
            root = insert(root, key);
        }

        printInRange(root, 6, 10);
    }
}
