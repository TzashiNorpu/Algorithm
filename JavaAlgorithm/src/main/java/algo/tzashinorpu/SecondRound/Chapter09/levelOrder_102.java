package algo.tzashinorpu.SecondRound.Chapter09;

import algo.tzashinorpu.SecondRound.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class levelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        while (stack.size() > 0) {
            int size = stack.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pollLast();
                temp.offerLast(pop.val);
                if (pop.left != null) {
                    stack.offerFirst(pop.left);
                }
                if (pop.right != null) {
                    stack.offerFirst(pop.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
