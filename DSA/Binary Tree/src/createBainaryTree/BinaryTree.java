package createBainaryTree;

import createNode.Node;

public class BinaryTree {
    public static int idx = -1;

    public Node buildTree(int[] node) {
        idx++;
        if (idx >= node.length || node[idx] == -1) {
            return null;
        }

        Node newNode = new Node(node[idx]);
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);
        return newNode;
    }
}
