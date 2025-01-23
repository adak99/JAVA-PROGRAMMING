import java.util.LinkedList;
import java.util.Queue;

import buildtree.BuildTree;
import createNode.Node;

public class SumOfKthLavel {

    public static int sumOfKthLavel(Node root, int k) {
        if (root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int currentLevel = 0;
        int levelSum = 0;

        while (!q.isEmpty()) {
            Node currentNode = q.remove();

            if (currentNode == null) {
                currentLevel++;

                if (!q.isEmpty())
                    q.add(null);

                if (currentLevel > k)
                    break;

            } else {
                if (currentLevel == k)
                    levelSum += currentNode.data;

                if (currentNode.left != null)
                    q.add(currentNode.left);

                if (currentNode.right != null)
                    q.add(currentNode.right);
            }
        }

        return levelSum;
    }

    public static void main(String[] args) {
        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 });

        int k = 2; // Example level
        int result = sumOfKthLavel(root, k);
        System.out.println("Sum of nodes at level " + k + ": " + result);
    }
}
