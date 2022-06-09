package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayDeque;
import java.util.Stack;

public class isCousins_993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        int count = 0;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (stack.size() != 0) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                TreeNode parent = stack.pollFirst();

                if ((parent.left != null && (parent.left.val == x || parent.left.val == y))
                        || (parent.right != null && (parent.right.val == x || parent.right.val == y))
                )
                    count++;

                if (parent.left != null) stack.offerLast(parent.left);
                if (parent.right != null) stack.offerLast(parent.right);
            }
            if (count != 0) return count == 2;
        }
        return false;
    }
}
