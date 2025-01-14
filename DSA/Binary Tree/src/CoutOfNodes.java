import buildtree.BuildTree;
import createNode.Node;

public class CoutOfNodes {

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Total numbers of nodes: " + countOfNodes(root));
    }
}
