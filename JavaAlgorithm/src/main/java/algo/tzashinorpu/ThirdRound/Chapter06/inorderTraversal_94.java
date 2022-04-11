package algo.tzashinorpu.ThirdRound.Chapter06;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal_94 {
    // l root r
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        traversal(res, root);
        return res;
    }

    private void traversal(ArrayList<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(res, root.left);
        res.add(root.val);
        traversal(res, root.right);
    }
}
