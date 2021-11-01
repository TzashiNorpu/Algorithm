package algo.tzashinorpu.SecondRound.Chapter06;

import algo.tzashinorpu.SecondRound.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal_094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        // left root right
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }
}
