package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayDeque;

public class maxDepth_104 {
    public int maxDepth(TreeNode root) {
        int level = 0;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if (root != null) deque.add(root);
        while (!deque.isEmpty()) {
            level++;
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.pollFirst();
                if (poll.left != null) deque.offerLast(poll.left);
                if (poll.right != null) deque.offerLast(poll.right);
            }
        }
        return level;
    }
}
