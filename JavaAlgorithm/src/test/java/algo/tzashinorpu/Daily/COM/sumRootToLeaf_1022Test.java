package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumRootToLeaf_1022Test {

    @Test
    void sumRootToLeaf() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        sumRootToLeaf_1022 ins = new sumRootToLeaf_1022();
        System.out.println(ins.sumRootToLeaf(root));
    }
}