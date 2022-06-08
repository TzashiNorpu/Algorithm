package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class findSecondMinimumValue_671 {
    int min;
    int sec;
    boolean flag = false;

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        sec = Integer.MAX_VALUE;
        helper(root);
        return sec == Integer.MAX_VALUE ? (flag ? (min == sec ? -1 : sec) : -1) : sec;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        if (root.val == Integer.MAX_VALUE) flag = true;
        min = Math.min(min, root.val);
        if (root.val > min && root.val < sec) sec = root.val;
        helper(root.left);
        helper(root.right);
    }
}
