package algo.tzashinorpu.SecondRound.Chapter09;

import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

class levelOrder_102Test {

    @Test
    void levelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        levelOrder_102 instance = new levelOrder_102();
        System.out.println(instance.levelOrder(root));
    }
}