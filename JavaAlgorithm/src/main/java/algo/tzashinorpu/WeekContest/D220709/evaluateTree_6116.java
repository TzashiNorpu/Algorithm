package algo.tzashinorpu.WeekContest.D220709;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class evaluateTree_6116 {
    public boolean evaluateTree(TreeNode root) {
        if (root == null) return true;
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        if (root.val == 2) return left || right;
        else if (root.val < 2) {
            return (root.val != 0) && left && right;
        } else return left && right;
    }
}
