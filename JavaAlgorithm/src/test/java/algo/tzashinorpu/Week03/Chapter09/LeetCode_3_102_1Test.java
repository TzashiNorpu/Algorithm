package algo.tzashinorpu.Week03.Chapter09;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_3_102_1Test {
    BinaryTree root;
    LeetCode_3_102_1 instance;

    @Test
    void levelOrder() {
        List<List<Integer>> lists = instance.levelOrder(root);
        System.out.println(lists);
    }

    @BeforeEach
    void setUp() {
        root = new BinaryTree(3);
        root.left = new BinaryTree(9);
        root.right = new BinaryTree(20);
        root.right.left = new BinaryTree(15);
        root.right.right = new BinaryTree(7);
        instance = new LeetCode_3_102_1();
    }

    @AfterEach
    void tearDown() {
    }
}