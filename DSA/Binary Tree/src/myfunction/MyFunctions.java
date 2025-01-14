package myfunction;

import java.util.LinkedList;
import java.util.Queue;

import createNode.Node;

public class MyFunctions {
    // height of the tree
    public int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Preorder Traversal
    public void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left); // check left sub tree
        preorder(root.right); // check right sub tree
    }

    // inorder traversal
    public void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postorder traversal
    public void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // level order traversal
    public void levelorder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // apporach 1 to clauclate diameter of the tree

    // Diameter of the tree
    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left) + height(root.right) + 1;

        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }

    // approach 2 to clacualte diameter of the tree
    public static class TreeInfo {
        public int hight;
        public int diameter;

        public TreeInfo(int hight, int diameter) {
            this.hight = hight;
            this.diameter = diameter;
        }

    }

    public TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int hight = Math.max(left.hight, right.hight) + 1;
        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.hight + right.hight + 1;

        int diameter = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo info = new TreeInfo(hight, diameter);
        return info;
    }
}
