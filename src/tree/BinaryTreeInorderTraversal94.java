package tree;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {

    //递归，简单
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        inorder(res, root);

        return res;
    }

    private void inorder(List<Integer> list, TreeNode t) {

        if (t == null) {
            return;
        }
        //中序是左->中->右
        inorder(list, t.left);
        list.add(t.val);
        inorder(list, t.right);
    }


}
