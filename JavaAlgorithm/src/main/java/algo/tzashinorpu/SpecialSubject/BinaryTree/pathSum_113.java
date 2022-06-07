package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pathSum_113 {
    List<List<Integer>> res;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        res = new ArrayList<>();
        helper(root, list, targetSum);
        return res;
    }

    private void helper(TreeNode root, List<Integer> list, int targetSum) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                list.add(root.val);
                ArrayList<Integer> clone = new ArrayList<>(list);
                res.add(clone);
                list.remove(list.size() - 1);
            }
            return;
        }
        list.add(root.val);
        helper(root.left, list, targetSum - root.val);
        helper(root.right, list, targetSum - root.val);
        list.remove(list.size() - 1);
    }
}
