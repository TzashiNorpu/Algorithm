package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumNumbers_129Test {

    @Test
    void sumNumbers() {
        sumNumbers_129 ins = new sumNumbers_129();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(ins.sumNumbers(root));
    }
}