package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class insertIntoMaxTree_998 {
    /*新增的 val 是添加在原始数组的最后的，根据构建最大二叉树的逻辑，正常来说最后的这个值一定是在右子树的，可以对右子树递归调用 insertIntoMaxTree 插入进去。
    但是一种特殊情况是 val 比原始数组中的所有元素都大，那么根据构建最大二叉树的逻辑，原来的这棵树应该成为 val 节点的左子树。*/
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val < val) {
            TreeNode tmp = root;
            root = new TreeNode(val);
            root.left = tmp;
        } else {
            root.right = insertIntoMaxTree(root.right, val);
        }
        return root;
    }
}
