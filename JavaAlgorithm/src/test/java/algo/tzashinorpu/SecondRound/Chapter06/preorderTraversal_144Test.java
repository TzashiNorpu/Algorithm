package algo.tzashinorpu.SecondRound.Chapter06;

import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class preorderTraversal_144Test {

    @Test
    void preorderTraversal() {
        preorderTraversal_144 instance = new preorderTraversal_144();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(instance.preorderTraversal(root));
    }
}