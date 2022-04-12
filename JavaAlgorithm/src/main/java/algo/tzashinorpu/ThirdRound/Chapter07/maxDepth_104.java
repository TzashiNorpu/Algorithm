package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.ArrayDeque;
import java.util.Stack;

public class maxDepth_104 {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if (root != null)
            stack.push(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pollFirst();
                if (pop.left != null) {
                    stack.offerLast(pop.left);
                }
                if (pop.right != null) {
                    stack.offerLast(pop.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
