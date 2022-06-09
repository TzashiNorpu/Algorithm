package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class goodNodes_1448 {
    private int count = 0;

    public int goodNodes(TreeNode root) {
        helper(root, root.val);
        return count;
    }

    private void helper(TreeNode root, int val) {
        if (root == null) return;
        if (root.val >= val) count++;
        helper(root.left, Math.max(root.val, val));
        helper(root.right, Math.max(root.val, val));
    }
}
