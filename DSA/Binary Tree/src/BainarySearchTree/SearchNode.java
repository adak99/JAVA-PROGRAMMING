package BainarySearchTree;

import BainarySearchTree.BuildTree.CreateTree;
import BainarySearchTree.CreateNode.Node;

public class SearchNode {
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) { // search for left sub tree
            return search(root.left, key);
        } else if (root.data == key) { // if found the node
            return true;
        } else {
            return search(root.right, key); // search for right sub tree
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int key : nodes) {
            root = CreateTree.insert(root, key);
        }

        if (search(root, 1)) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
