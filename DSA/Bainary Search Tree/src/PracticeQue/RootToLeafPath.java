import java.util.ArrayList;

public class RootToLeafPath {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int key : path) {
            System.out.print(key + "->");
        }
        System.out.println();
    }

    public static void rootToLeafPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            rootToLeafPath(root.left, path);
            rootToLeafPath(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int[] value = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int key : value) {
            root = insert(root, key);
        }

        rootToLeafPath(root, new ArrayList<>());
    }
}
