package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayDeque;

public class isSymmetric_101 {
    public boolean isSymmetric(TreeNode root) {
        /*ArrayDeque<TreeNode> left = new ArrayDeque<>();
        ArrayDeque<TreeNode> right = new ArrayDeque<>();
        if (root.left != null) left.offer(root.left);
        if (root.right != null) right.offer(root.right);
        while (!left.isEmpty() && !right.isEmpty()) {
            int l = left.size();
            int r = right.size();
            if (l != r) return false;
            for (int i = 0; i < l; i++) {
                TreeNode l_item = left.pollLast();
                TreeNode r_item = right.pollLast();
                if (l_item.val != r_item.val) return false;
                if (l_item.left != null) left.offerLast(l_item.left);
                if (l_item.right != null) left.offerLast(l_item.right);
                if (r_item.right != null) left.offerLast(r_item.right);
                if (r_item.left != null) left.offerLast(r_item.left);
            }
        }
        return true;*/
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null) return false;
        if (right == null) return false;
        if (left.val != right.val) return false;
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}
