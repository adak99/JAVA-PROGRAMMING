import buildtree.BuildTree;
import createNode.Node;

public class DiameterOfTree {
    // approach 1 to clatulate diameter of the tree time complexity O=(N^2)
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHight = height(root.left);
        int rightHight = height(root.right);

        return Math.max(leftHight, rightHight) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // approach 2 to clacualte diameter of the tree time complexity 0=(N)
    public static class TreeInfo {
        int hight;
        int diameter;

        TreeInfo(int hight, int diameter) {
            this.hight = hight;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTree = diameter2(root.left);
        TreeInfo rightTree = diameter2(root.right);

        int hight = Math.max(leftTree.hight, rightTree.hight) + 1; // calculate hight
        int diam1 = leftTree.diameter;
        int diam2 = rightTree.diameter;
        int diam3 = leftTree.hight + rightTree.hight + 1;
        int diameter = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo info = new TreeInfo(hight, diameter);

        return info;
    }

    public static void main(String[] args) {
        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 });

        System.out.println("Diameter of the tree: " + diameter(root));
        System.out.println("Diameter of the tree: " + diameter2(root).diameter);
    }
}
