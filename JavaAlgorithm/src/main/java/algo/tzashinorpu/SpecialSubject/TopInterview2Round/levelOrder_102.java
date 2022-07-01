package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class levelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if (root != null) deque.offerLast(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.pollFirst();
                list.add(poll.val);
                if (poll.left != null) deque.offerLast(poll.left);
                if (poll.right != null) deque.offerLast(poll.right);
            }
            res.add(list);
        }
        return res;
    }
}
