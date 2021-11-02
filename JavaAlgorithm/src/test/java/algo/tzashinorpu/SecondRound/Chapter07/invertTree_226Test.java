package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.Chapter06.inorderTraversal_094;
import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

class invertTree_226Test {

    @Test
    void invertTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        inorderTraversal_094 traversal = new inorderTraversal_094();

        invertTree_226 instance = new invertTree_226();
        System.out.println(traversal.inorderTraversal(root));
        System.out.println("-------------");
        System.out.println(traversal.inorderTraversal(instance.invertTree(root)));
    }
}