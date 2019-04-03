package tree;

import struct.TreeNode;

public class MaximumDepthofBinaryTree104 {


    // faster than 100.00%，但 less than 7.03% 空间
    public int maxDepth(TreeNode root) {

        int depth = 0;
        if (root == null) {
            return depth;
        }

        depth = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;


        return depth;
    }
}
