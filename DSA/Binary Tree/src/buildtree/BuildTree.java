package buildtree;

import createNode.Node;

public class BuildTree {
    static int idx = -1;

    // build tree
    public Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1 || idx >= nodes.length) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
}
