package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class smallestFromLeaf_988 {
    public String smallestFromLeaf_1(TreeNode root) {
        if (root == null) return "";
        if (root.left == null && root.right == null) return "" + (char) ('a' + root.val);
        String left = smallestFromLeaf_1(root.left);
        String right = smallestFromLeaf_1(root.right);

        String leftS = left + (char) ('a' + root.val);
        String rightS = right + (char) ('a' + root.val);
        if (left.equals("")) {
            return rightS;
        } else if (right.equals("")) {
            return leftS;
        } else {
            if (leftS.compareTo(rightS) < 0) {
                return leftS;
            } else {
                return rightS;
            }
        }
    }

    String ans = "{";

    public String smallestFromLeaf_2(TreeNode root) {
        helper(root, new StringBuilder());
        return ans;
    }

    private void helper(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append((char) ('a' + root.val));
        if (root.left == null && root.right == null) {
            sb.reverse();
            String s = sb.toString();
            if (ans.compareTo(s) > 0) ans = s;
            sb.reverse();
        }
        helper(root.left, sb);
        helper(root.right, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
