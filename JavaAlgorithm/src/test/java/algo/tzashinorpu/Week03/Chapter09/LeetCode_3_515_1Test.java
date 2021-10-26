package algo.tzashinorpu.Week03.Chapter09;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_3_515_1Test {
    BinaryTree root;
    LeetCode_3_515_1 instance;

    @Test
    void largestValues() {
        System.out.println(instance.largestValues(root));
    }

    @BeforeEach
    void setUp() {
        root = new BinaryTree(1);
        root.left = new BinaryTree(3);
        root.right = new BinaryTree(2);
        root.left.left = new BinaryTree(5);
        root.left.right = new BinaryTree(3);
        root.right.right = new BinaryTree(9);
        instance = new LeetCode_3_515_1();
    }
}