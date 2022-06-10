package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.Top.NNode;

import java.util.ArrayDeque;

public class maxDepth_559 {
    public int maxDepth(NNode root) {
        int level = 0;
        ArrayDeque<NNode> deque = new ArrayDeque<>();
        if (root == null) return level;
        deque.offerLast(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                NNode poll = deque.pollFirst();
                for (int j = 0; j < poll.children.size(); j++) {
                    if (poll.children.get(j) != null)
                        deque.offerLast(poll.children.get(j));
                }
            }
            level++;
        }
        return level;
    }
}
