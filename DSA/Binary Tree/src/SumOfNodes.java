import buildtree.BuildTree;
import createNode.Node;

public class SumOfNodes {

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 });

        System.out.println("Sum of all nodes: " + sumOfNodes(root));
    }
}
