package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sufficientSubset_1080Test {

    @Test
    void sufficientSubset() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(-5);
        root.right.left = new TreeNode(4);
        System.out.println(new sufficientSubset_1080().sufficientSubset(root, -1));
    }
}