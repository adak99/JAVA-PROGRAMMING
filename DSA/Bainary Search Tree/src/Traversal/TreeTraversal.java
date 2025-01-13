import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }
}

class BainaryTree {
    static int idx = -1;

    public Node buildTree(int[] node) {
        idx++;
        if (node[idx] == -1) {
            return null;
        }

        Node newNode = new Node(node[idx]);
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);

        return newNode;
    }
}

public class TreeTraversal {

    // preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inroder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root);
        System.out.print(root.data + " ");
        inorder(root);
    }

    // postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // lavel order traversal **
    public static void levelOrder(Node root) {
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

    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BainaryTree tree = new BainaryTree();
        Node root = tree.buildTree(node);

        levelOrder(root);
    }
}
