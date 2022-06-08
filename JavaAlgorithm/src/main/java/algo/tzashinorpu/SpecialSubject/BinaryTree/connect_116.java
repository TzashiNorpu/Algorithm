package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.Node;

public class connect_116 {
    public Node connect(Node root) {
        if (root == null) return null;
        helper(root.left, root.right);
        return root;
    }

    private void helper(Node l, Node r) {
        if (l == null || r == null) return;
        l.next = r;
        helper(l.left, l.right);
        helper(r.left, r.right);
        helper(l.right, r.left);
    }
}
