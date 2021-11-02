package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

class minDepth_111Test {

    @Test
    void minDepth() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);
        minDepth_111 instance = new minDepth_111();
        System.out.println(instance.minDepth(root));
    }
}