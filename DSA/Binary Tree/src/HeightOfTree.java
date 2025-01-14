import buildtree.BuildTree;
import createNode.Node;

public class HeightOfTree {
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHight = height(root.left);
        int rightHight = height(root.right);

        return Math.max(leftHight, rightHight) + 1;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Hight of the tree: " + height(root));
    }
}
