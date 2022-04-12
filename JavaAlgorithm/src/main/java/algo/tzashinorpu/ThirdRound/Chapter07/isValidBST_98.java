package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.ArrayList;

public class isValidBST_98 {
    public boolean isValidBST(TreeNode root) {
        /*// inorder -> asc
        ArrayList<Integer> integers = new ArrayList<>();
        traversal(integers, root);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) <= integers.get(i - 1)) {
                return false;
            }
        }
        return true;*/
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if (root == null) {
            return true;
        }
        if ((minNode != null && root.val <= minNode.val) || (maxNode != null && root.val >= maxNode.val))
            return false;
        return isValidBST(root.left, minNode, root) && isValidBST(root.right, root, maxNode);
    }

    private void traversal(ArrayList<Integer> integers, TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(integers, root.left);
        integers.add(root.val);
        traversal(integers, root.right);
    }
}
