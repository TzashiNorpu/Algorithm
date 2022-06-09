package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class maxProduct_1339 {
    int treeSum = 0;
    long res = 0;
    int mod = 1000000007;

    public int maxProduct(TreeNode root) {
        treeSum = getSum(root);
        getSum(root);
        return (int) (res % mod);
    }

    private int getSum(TreeNode root) {
        if (root == null) return 0;
        int l = getSum(root.left);
        int r = getSum(root.right);
        int rootSum = l + r + root.val;
        res = Math.max(res, ((long) rootSum * (treeSum - rootSum)));
        return rootSum;
    }
}
