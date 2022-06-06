package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findBottomLeftValue_513Test {

    @Test
    void findBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(6);
        root.right.right.right.left = new TreeNode(2);
        findBottomLeftValue_513 ins = new findBottomLeftValue_513();
        System.out.println(ins.findBottomLeftValue(root));
    }
}