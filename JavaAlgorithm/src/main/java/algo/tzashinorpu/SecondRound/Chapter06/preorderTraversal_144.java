package algo.tzashinorpu.SecondRound.Chapter06;

import algo.tzashinorpu.SecondRound.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class preorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(TreeNode root, LinkedList<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        dfs(root.left, res);
        dfs(root.right, res);
    }
}
