package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.TreeNode;

public class invertTree_226 {
    public TreeNode invertTree(TreeNode root) {
     /*   输入：
                    4
                  /   \
                 2     7
                / \   / \
               1   3 6   9
        输出：
                    4
                  /   \
                 7     2
                / \   / \
               9   6 3   1
*/
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        // 不用临时变量则root.left被修改
        root.right = invertTree(left);
        return root;
    }
}
