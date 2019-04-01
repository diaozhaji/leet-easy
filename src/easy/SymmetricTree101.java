package easy;

import struct.TreeNode;

public class SymmetricTree101 {


    //算是抄的答案，没想明白 faster than 100.00%
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return false;
        }
        return isMirror(root.left, root.right);

    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);

    }

}
