package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

class isValidBST_098Test {

    @Test
    void isValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        isValidBST_098 instance = new isValidBST_098();
        System.out.println(instance.isValidBST(root));

        root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.println(instance.isValidBST(root));
    }
}