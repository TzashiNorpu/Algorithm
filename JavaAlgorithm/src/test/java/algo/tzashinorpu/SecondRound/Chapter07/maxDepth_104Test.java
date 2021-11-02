package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

class maxDepth_104Test {

    @Test
    void maxDepth() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        maxDepth_104 instance = new maxDepth_104();
        System.out.println(instance.maxDepth(root));
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(instance.maxDepth(root));
    }
}