package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.HashSet;

public class FindElements_1261 {
    HashSet<Integer> set;

    public FindElements_1261(TreeNode root) {
        set = new HashSet<>();
        helper(root, 0);
    }

    private void helper(TreeNode root, int val) {
        if (root == null) return;
        root.val = val;
        set.add(val);
        helper(root.left, val * 2 + 1);
        helper(root.right, val * 2 + 2);
    }

    public boolean find(int target) {
        return set.contains(target);
    }
}
