package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths_257 {
    List<String> res;

    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<>();
        helper(root, "");
        return res;
    }

    private void helper(TreeNode root, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            s += root.val;
            res.add(s);
            return;
        }
        helper(root.left, s + root.val + "->");
        helper(root.right, s + root.val + "->");
    }
}
