package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class insertIntoBST_701Test {

    @Test
    void insertIntoBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        insertIntoBST_701 ins = new insertIntoBST_701();
        TreeNode node = ins.insertIntoBST(root, 5);
        TreeNode.traverse(node);
    }
}