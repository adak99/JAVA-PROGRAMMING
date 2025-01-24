package BainarySearchTree;

import java.util.ArrayList;

import BainarySearchTree.BuildTree.CreateTree;
import BainarySearchTree.CreateNode.Node;

public class RootToLeafPath {
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;

        path.add(root.data);

        if (root.left == null && root.right == null)
            System.out.println(path);
        else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int key : nodes) {
            root = CreateTree.insert(root, key);
        }

        printRootToLeaf(root, new ArrayList<>());
    }
}
