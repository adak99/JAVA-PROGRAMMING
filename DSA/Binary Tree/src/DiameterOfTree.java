import buildtree.BuildTree;
import createNode.Node;
import myfunction.MyFunctions;

public class DiameterOfTree {
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BuildTree tree = new BuildTree();
        MyFunctions h = new MyFunctions();

        Node root = tree.buildTree(nodes);

        System.out.println("Diameter of the tree: " + h.diameter2(root).diameter);

        System.out.println("Diameter of the tree: " + h.diameter(root));
    }
}
