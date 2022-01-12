package algo.tzashinorpu.Daily.COM;

public class sumRootToLeaf_1022 {
    private int res = 0;

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return this.res;
    }

    private void dfs(TreeNode root, int temp) {
        if (root.left == null && root.right == null) {
            this.res += (temp << 1 | root.val);
            return;
        }
        if (root.left != null) {
            dfs(root.left, temp << 1 | root.val);
        }
        if (root.right != null) {
            dfs(root.right, temp << 1 | root.val);
        }
    }
}
