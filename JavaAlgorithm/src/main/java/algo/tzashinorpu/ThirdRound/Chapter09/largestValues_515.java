package algo.tzashinorpu.ThirdRound.Chapter09;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class largestValues_515 {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if (root != null) deque.offerLast(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            int max = deque.peekFirst().val;
            for (int i = 0; i < size; i++) {
                TreeNode pop = deque.pollFirst();
                max = Math.max(max, pop.val);
                if (pop.right != null) deque.offerLast(pop.right);
                if (pop.left != null) deque.offerLast(pop.left);
            }
            res.add(max);
        }
        return res;
    }
}
