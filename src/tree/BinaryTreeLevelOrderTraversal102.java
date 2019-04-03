package tree;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102 {

    //基本抄答案，借用队列bfs，faster than 74.69%
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                item.add(t.val);
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            result.add(item);
        }

        return result;
    }

}
