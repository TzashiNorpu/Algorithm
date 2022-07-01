package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.Node;

public class connect_116 {
    public Node connect(Node root) {
        if (root == null) return null;
        helper(root.left, root.right);
        return root;
    }

    private void helper(Node left, Node right) {
        if (left == null) return;
        left.next = right;
        helper(left.left, left.right);
        helper(left.right, right.left);
        helper(right.left, right.right);
    }

}
