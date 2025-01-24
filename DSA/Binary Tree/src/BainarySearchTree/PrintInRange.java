package BainarySearchTree;

import BainarySearchTree.BuildTree.CreateTree;
import BainarySearchTree.CreateNode.Node;

public class PrintInRange {

    // approach
    /*
     * range x and y
     * 
     * case 1: if x present & equal to both range in right sub tree and y present in
     * left subtree-> [x <= root <= y] -> left sutree && -> right subtree call
     * 
     * case 2: if the X is greater than root then all subtree&nodes found at the
     * right subtree-> [x > root] -> right
     * 
     * case 2: [y < root] -> left
     */

    public static void printInRnage(Node root, int x, int y) {
        if (root == null)
            return;

        if (root.data >= x && root.data <= y) {
            printInRnage(root.left, x, y);
            System.out.print(root.data + " ");
            printInRnage(root.right, x, y);
        } else if (root.data >= y)
            printInRnage(root.left, x, y);
        else
            printInRnage(root.right, x, y);
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int key : nodes) {
            root = CreateTree.insert(root, key);
        }

        printInRnage(root, 8, 14);

    }
}
