package algo.tzashinorpu.FirstRound.Chapter09;

import algo.tzashinorpu.FirstRound.Chapter06.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode_3_515Test {

    @Test
    void largestValues() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(3);
        root.right = new BinaryTree(2);
        root.left.left = new BinaryTree(5);
        root.left.right = new BinaryTree(3);
        root.right.right = new BinaryTree(9);
        LeetCode_3_515 instance = new LeetCode_3_515();
        List<Integer> res = instance.largestValues(root);
        System.out.println(res);
    }
}