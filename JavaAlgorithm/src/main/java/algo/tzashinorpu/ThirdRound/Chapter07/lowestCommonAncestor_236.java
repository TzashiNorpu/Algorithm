package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;

public class lowestCommonAncestor_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        // 当前树内是否有节点
        if (root == p || root == q) return root;
        // 左子树寻找这两个节点
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 右子树寻找这两个节点
        TreeNode right = lowestCommonAncestor(root.right, p, q);
//        return left == null ? (right == null ? root : right) : left;
        return left != null && right != null ? root : (left != null ? left : right);
    }
}
