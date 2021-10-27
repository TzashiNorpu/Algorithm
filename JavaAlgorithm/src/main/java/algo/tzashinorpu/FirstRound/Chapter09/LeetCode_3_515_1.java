package algo.tzashinorpu.FirstRound.Chapter09;


import algo.tzashinorpu.FirstRound.Chapter06.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_515_1 {
    public List<Integer> largestValues(BinaryTree root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        LinkedList<BinaryTree> stack = new LinkedList<>();
        stack.offer(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            int max = stack.peek().val;
            for (int i = 0; i < size; i++) {
                BinaryTree poll = stack.poll();
                max = Math.max(max, poll.val);
                if (poll.left != null) {
                    stack.offer(poll.left);
                }
                if (poll.right != null) {
                    stack.offer(poll.right);
                }
            }
            res.offer(max);
        }
        return res;
    }
}
