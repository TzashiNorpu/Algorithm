package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;
import org.junit.jupiter.api.Test;

class trimBST_669Test {

    @Test
    void trimBST() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        trimBST_669 ins = new trimBST_669();
        System.out.println(ins.trimBST(root, 3, 4));
    }
}