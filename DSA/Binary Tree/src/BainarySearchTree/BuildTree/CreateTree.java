package BainarySearchTree.BuildTree;

import BainarySearchTree.CreateNode.Node;

public class CreateTree {
    // insert node in tree
    public static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        // left sub tree
        if (root.data > val)
            root.left = insert(root.left, val);

        // right sub tree
        else
            root.right = insert(root.right, val);

        return root;
    }

    // delete a node in tree
    /*
     * case 1 : No child (Leaf Node) [Delete Node & Return null to parent]
     * case 2 : One child [Delete node & replace with child node]
     * case 3 : Two children [Replace value wiht inorder successor] & [Delete the
     * node for inorder successor] ***(inorder successor always has 0 or 1 child)
     */

    public static Node delete(Node root, int key) {
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
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
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // inorder succesor
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
