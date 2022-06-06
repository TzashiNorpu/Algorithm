package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class distributeCoins_979 {
    int count = 0;

    public int distributeCoins(TreeNode root) {
        helper(root);
        return count;
    }

    // 返回使当前节点的金币数为1的，需要拿出的金币数目【可能为正、可能为负】
    private int helper(TreeNode root) {
        if (root == null) return 0;
        //要使左子树满足题意，需要从左子树拿走的金币数目,可能==0，正数或负数
        int left = helper(root.left);
        int right = helper(root.right);
        //移动次数即拿走的金币绝对值
        count += Math.abs(left) + Math.abs(right);
        // 只能从相邻节点拿
        //此时当前节点node金币数目为（l+r+node.val），返回保留一个金币需要拿走的金币数
        return root.val + left + right - 1;
    }
}
