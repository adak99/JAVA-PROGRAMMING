package BainarySearchTree;

import BainarySearchTree.BuildTree.CreateTree;
import BainarySearchTree.CreateNode.Node;

public class PrintInRange {
    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int key : nodes) {
            root = CreateTree.insert(root, key);
        }

    }
}
