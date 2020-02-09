//给定一个二叉树，返回它的中序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
package FirstRound.leetcode.editor.cn;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse1(root, res);
        return res;
    }

    // 递归
    private void traverse1(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        traverse1(root.left, res);
        res.add(root.val);
        traverse1(root.right, res);
    }

    // 堆栈--迭代
    private List<Integer> traverse2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null && !stack.empty()) {
            while (root.left != null) {
                root = root.left;
            }
            res.add(stack.pop().val);
            root = root.right;
        }
        return res;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


//leetcode submit region end(Prohibit modification and deletion)
