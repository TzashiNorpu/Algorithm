package algo.tzashinorpu.Daily.COM;

public class insertIntoBST_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return dfs(root, val);
    }

    private TreeNode dfs(TreeNode head, int val) {
        if (head == null) {
            return new TreeNode(val);
        }
        if (val > head.val) {
            head.right = dfs(head.right, val);
        }
        if (val < head.val) {
            head.left = dfs(head.left, val);
        }
        return head;
    }
}
