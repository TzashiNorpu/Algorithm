package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumEvenGrandparent_1315Test {

    @Test
    void sumEvenGrandparent() {
        sumEvenGrandparent_1315 ins = new sumEvenGrandparent_1315();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        System.out.println(ins.sumEvenGrandparent(root));
    }
}