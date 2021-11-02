package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.TreeNode;

import java.util.LinkedList;

public class maxDepth_104 {
    public int maxDepthBFS(TreeNode root) {
        int level = 0;
        if (root == null) {
            return level;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (stack.size() > 0) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pollLast();
                if (pop.left != null) {
                    stack.offerFirst(pop.left);
                }
                if (pop.right != null) {
                    stack.offerFirst(pop.right);
                }
            }
            level++;
        }
        return level;
    }

    private int maxDepth = Integer.MIN_VALUE;

    public int maxDepthDFS(TreeNode root) {
        dfs(root, 0);
        return maxDepth;
    }

    private void dfs(TreeNode root, int level) {
        if (root == null) {
            maxDepth = Math.max(level, maxDepth);
            return;
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
