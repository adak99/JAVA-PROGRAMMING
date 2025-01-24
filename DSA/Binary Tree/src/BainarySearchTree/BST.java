package BainarySearchTree;

import BainarySearchTree.BuildTree.CreateTree;
import BainarySearchTree.CreateNode.Node;

public class BST {
    // inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // searching a node
    public static boolean search(Node root, int key) { // time complexity O(H)
        if (root == null)
            return false;

        // left sub tree call
        if (root.data > key)
            return search(root.left, key);

        else if (root.data == key)
            return true;

        // right sub tree call
        else
            return search(root.right, key);

    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int key : nodes) {
            root = CreateTree.insert(root, key);
        }

        inorder(root);
        System.out.println();

        CreateTree.delete(root, 6);
        inorder(root);
    }
}
