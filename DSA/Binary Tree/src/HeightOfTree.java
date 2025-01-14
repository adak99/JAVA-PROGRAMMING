import buildtree.BuildTree;
import createNode.Node;
import myfunction.TreeHeight;

public class HeightOfTree {
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BuildTree tree = new BuildTree();
        TreeHeight h = new TreeHeight();
        Node root = tree.buildTree(nodes);
        System.out.println("Hight of the tree: " + h.height(root));
    }
}
