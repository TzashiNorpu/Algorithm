package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class zigzagLevelOrder_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if (root != null) deque.offerLast(root);
        boolean order = true;
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            ArrayDeque<Integer> tmp = new ArrayDeque<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.pollFirst();
                if (poll.left != null) deque.offerLast(poll.left);
                if (poll.right != null) deque.offerLast(poll.right);
                tmp.addLast(poll.val);
            }
            if (order) {
                while (!tmp.isEmpty()) list.add(tmp.pollFirst());
            } else {
                while (!tmp.isEmpty()) list.add(tmp.pollLast());
            }
            res.add(list);
            order = !order;
        }
        return res;
    }
}
