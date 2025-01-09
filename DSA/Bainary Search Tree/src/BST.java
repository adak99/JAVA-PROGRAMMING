public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // insert node
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // print in inorder
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // search leaf node
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) { // leftsub tree
            return search(root.left, key);
        } else if (root.data == key) { // if match
            return true;
        } else { // rightsub tree
            return search(root.right, key);
        }
    }

    // delte root
    public static Node delete(Node root, int key) {
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data > key) {
            root.right = delete(root.right, key);
        } else { // root.data == value
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3
            else {
                Node inorderSuccessor = inorderSuccessor(root.right);
                root.data = inorderSuccessor.data;
                root.right = delete(root.right, inorderSuccessor.data);
            }
        }

        return root;
    }

    // inorder successor
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {
        int[] value = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int key : value) {
            root = insert(root, key);
        }

        inorder(root);

        delete(root, 4);

        if (search(root, 4)) {
            System.out.println("\n7 is found.");
        } else {
            System.out.println("\nNot exit.");
        }

    }
}