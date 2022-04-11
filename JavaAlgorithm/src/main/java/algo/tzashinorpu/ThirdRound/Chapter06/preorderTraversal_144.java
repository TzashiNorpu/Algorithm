package algo.tzashinorpu.ThirdRound.Chapter06;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }

    private void traversal(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        traversal(root.left, res);
        traversal(root.right, res);
    }
}
