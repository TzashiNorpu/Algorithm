package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

class lowestCommonAncestor_236Test {

    @Test
    void lowestCommonAncestor() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        lowestCommonAncestor_236 instance = new lowestCommonAncestor_236();
        System.out.println(instance.lowestCommonAncestor(root, root.left.left, root.left).val);
    }
}