package algo.tzashinorpu.Week03.Chapter09;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_102_1 {
    public List<List<Integer>> levelOrder(BinaryTree root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        LinkedList<BinaryTree> stack = new LinkedList<>();
        stack.offer(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                BinaryTree poll = stack.poll();
                temp.offer(poll.val);
                if (poll.left != null) {
                    stack.offer(poll.left);
                }
                if (poll.right != null) {
                    stack.offer(poll.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
