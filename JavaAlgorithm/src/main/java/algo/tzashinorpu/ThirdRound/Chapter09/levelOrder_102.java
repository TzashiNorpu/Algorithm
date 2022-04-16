package algo.tzashinorpu.ThirdRound.Chapter09;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class levelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if (root != null) {
            deque.offerLast(root);
        }
        while (!deque.isEmpty()) {
            int size = deque.size();
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.pollFirst();
                tmp.add(treeNode.val);
                if (treeNode.left != null) {
                    deque.offerLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.offerLast(treeNode.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
