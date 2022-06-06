package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class findBottomLeftValue_513 {
    int res = 0;
    int level = 0;

    public int findBottomLeftValue(TreeNode root) {
        // 初始为 1 是防止只有一个节点的案例
        helper(root, 1);
        return res;
    }

    private void helper(TreeNode root, int level) {
        if (root == null) return;
        helper(root.left, level + 1);
        if (level > this.level) {
            res = root.val;
            this.level = level;
        }
        helper(root.right, level + 1);
    }
}
