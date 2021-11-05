package algo.tzashinorpu.SecondRound.Chapter09;

import algo.tzashinorpu.SecondRound.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class largestValues_515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        while (stack.size() > 0) {
            int size = stack.size();
            int max = stack.peek().val;
            for (int i = 0; i < size; i++) {
                TreeNode poll = stack.poll();
                max = Math.max(poll.val, max);
                if (poll.left != null) {
                    stack.offer(poll.left);
                }
                if (poll.right != null) {
                    stack.offer(poll.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}
