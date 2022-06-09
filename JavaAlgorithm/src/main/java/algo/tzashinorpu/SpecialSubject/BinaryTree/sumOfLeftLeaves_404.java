package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class sumOfLeftLeaves_404 {
    public int sumOfLeftLeaves_1(TreeNode root) {
        if (root == null) return 0;
        int ans = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) ans += root.left.val;
            else ans += sumOfLeftLeaves_1(root.left);
        }
        ans += sumOfLeftLeaves_1(root.right);

        return ans;
    }


    public int sumOfLeftLeaves_2(TreeNode root) {
        traverse(root);
        return sum;
    }

    // 记录左叶子之和
    int sum = 0;

    // 二叉树遍历函数
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null &&
                root.left.left == null && root.left.right == null) {
            // 找到左侧的叶子节点，记录累加值
            sum += root.left.val;
        }

        // 递归框架
        traverse(root.left);
        traverse(root.right);
    }
}
