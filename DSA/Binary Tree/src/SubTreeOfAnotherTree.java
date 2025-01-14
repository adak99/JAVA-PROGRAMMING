import buildtree.BuildTree;
import createNode.Node;

public class SubTreeOfAnotherTree {

    public static boolean isIdentical(Node treeRoot, Node subTreeRoot) {
        if (treeRoot == null && subTreeRoot == null) {
            return true;
        }

        if (treeRoot == null || subTreeRoot == null) {
            return false;
        }

        if (treeRoot.data == subTreeRoot.data) {
            return isIdentical(treeRoot.left, subTreeRoot.left) && isIdentical(treeRoot.right, subTreeRoot.right);
        }

        return false;
    }

    public static boolean isSubtree(Node treeRoot, Node subTreeRoot) {
        if (subTreeRoot == null) {
            return true;
        }

        if (treeRoot == null) {
            return false;
        }

        if (treeRoot.data == subTreeRoot.data) {
            if (isIdentical(treeRoot, subTreeRoot)) {
                return true;
            }
        }

        return isSubtree(treeRoot.left, subTreeRoot) || isSubtree(treeRoot.right, subTreeRoot);
    }

    public static void main(String[] args) {
        int[] tree = { 8, 2, 1, -1, -1, 3, -1, -1, 9, -1, 10, -1, -1 };
        int[] subTree = { 2, 1, -1, -1, 3, -1, -1 };

        BuildTree t = new BuildTree();

        BuildTree.idx = -1;
        Node treeRoot = t.buildTree(tree);

        BuildTree.idx = -1;
        Node subTreeRoot = t.buildTree(subTree);

        if (isSubtree(treeRoot, subTreeRoot)) {
            System.out.println("Subtree is present.");
        } else {
            System.out.println("Subtree is not present.");
        }
    }
}
