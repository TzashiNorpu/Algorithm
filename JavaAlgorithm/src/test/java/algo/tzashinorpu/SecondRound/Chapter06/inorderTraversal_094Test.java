package algo.tzashinorpu.SecondRound.Chapter06;

import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inorderTraversal_094Test {

    @Test
    void inorderTraversal() {
        inorderTraversal_094 instance = new inorderTraversal_094();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(instance.inorderTraversal(root));
    }
}