package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;

public class minDepth_111 {
    // 最小深度是从根节点到最近叶子节点的最短路径上的节点数量
    private int depth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, 0);
        return depth;
    }

    private void dfs(TreeNode root, int level) {
        if (root.left == null && root.right == null) {
            depth = Math.min(depth, level);
            return;
        }
        if (root.left != null) dfs(root.left, level + 1);
        if (root.right != null) dfs(root.right, level + 1);
    }
}
