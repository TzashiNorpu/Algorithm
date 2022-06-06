package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class sufficientSubset_1080 {
    /*
    if root.left == root.right == null, root is leaf with no child {
    if root.val < limit, we return null;
    else we return root.
    }
    if root.left != null, root has left child {
        Recursively call sufficientSubset function on left child,
        limit - root.val 当前节点有效的最小值
        with limit = limit - root.val
    }
    if root.right != null, root has right child {
        Recursively call sufficientSubset function on right child,
        with limit = limit - root.val
    }
    if root.left == root.right == null, -> root.left == root.right 只有在两边都是 null 的时候才相等
    root has no more children, no valid path left, --> 如果有一个节点不是 null 说明又一条有效的路径被保留了
    we return null;
    else we return root.
     */
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null)
            return root.val < limit ? null : root;
        root.left = sufficientSubset(root.left, limit - root.val);
        root.right = sufficientSubset(root.right, limit - root.val);
        return root.left == root.right ? null : root;
    }
}
