import buildtree.BuildTree;
import createNode.Node;
import myfunction.TreeHeight;

public class DiameterOfTree {

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        TreeHeight h = new TreeHeight();
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = h.height(root.left) + h.height(root.right) + 1;

        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Diameter of the tree: " + diameter(root));
    }
}
