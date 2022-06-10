package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class insertIntoMaxTree_998Test {

    @Test
    void insertIntoMaxTree() {
        insertIntoMaxTree_998 ins = new insertIntoMaxTree_998();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(1);
        int val = 4;
        System.out.println(ins.insertIntoMaxTree(root, val));
    }
}