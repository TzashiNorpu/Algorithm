package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class constructMaximumBinaryTree_654Test {

    @Test
    void constructMaximumBinaryTree() {
        constructMaximumBinaryTree_654 ins = new constructMaximumBinaryTree_654();
        int[] nums = {3, 2, 1, 6, 0, 5};
        TreeNode treeNode = ins.constructMaximumBinaryTree(nums);
        System.out.println(treeNode);
    }
}