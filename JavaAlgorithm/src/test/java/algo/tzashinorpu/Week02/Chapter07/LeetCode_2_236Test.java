package algo.tzashinorpu.Week02.Chapter07;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LeetCode_2_236Test {

    @Test
    @DisplayName("根元素两侧")
    void lowestCommonAncestor1() {
        BinaryTree root = new BinaryTree(3);
        root.left = new BinaryTree(5);
        root.right = new BinaryTree(1);
        root.left.left = new BinaryTree(6);
        root.left.right = new BinaryTree(2);
        root.left.right.left = new BinaryTree(7);
        root.left.right.right = new BinaryTree(4);
        root.right.left = new BinaryTree(0);
        root.right.right = new BinaryTree(8);

        BinaryTree p = root.left;
        BinaryTree q = root.right.right;

        LeetCode_2_236 instance = new LeetCode_2_236();
        BinaryTree res = instance.lowestCommonAncestor(root, p, q);
        System.out.println(res.val);
    }

    @Test
    @DisplayName("两个元素都在根元素左侧")
    void lowestCommonAncestor2() {
        BinaryTree root = new BinaryTree(3);
        root.left = new BinaryTree(5);
        root.right = new BinaryTree(1);
        root.left.left = new BinaryTree(6);
        root.left.right = new BinaryTree(2);
        root.left.right.left = new BinaryTree(7);
        root.left.right.right = new BinaryTree(4);
        root.right.left = new BinaryTree(0);
        root.right.right = new BinaryTree(8);

        BinaryTree p = root.left;
        BinaryTree q = root.left.left;

        LeetCode_2_236 instance = new LeetCode_2_236();
        BinaryTree res = instance.lowestCommonAncestor(root, p, q);
        System.out.println(res.val);
    }

    @Test
    @DisplayName("只有一个元素根元素左侧，另外一个元素为空")
    void lowestCommonAncestor3() {
        BinaryTree root = new BinaryTree(3);

        root.left = new BinaryTree(5);
        root.right = new BinaryTree(1);
        root.left.left = new BinaryTree(6);
        root.left.right = new BinaryTree(2);
        root.left.right.left = new BinaryTree(7);
        root.left.right.right = new BinaryTree(4);
        root.right.left = new BinaryTree(0);
        root.right.right = new BinaryTree(8);

        BinaryTree p = root.left;
        BinaryTree q = null;

        LeetCode_2_236 instance = new LeetCode_2_236();
        BinaryTree res = instance.lowestCommonAncestor(root, p, q);
        System.out.println(res.val);
    }

    @Test
    @DisplayName("两个元素都在根元素右侧")
    void lowestCommonAncestor4() {
        BinaryTree root = new BinaryTree(3);
        root.left = new BinaryTree(5);
        root.right = new BinaryTree(1);
        root.left.left = new BinaryTree(6);
        root.left.right = new BinaryTree(2);
        root.left.right.left = new BinaryTree(7);
        root.left.right.right = new BinaryTree(4);
        root.right.left = new BinaryTree(0);
        root.right.right = new BinaryTree(8);

        BinaryTree p = root.right;
        BinaryTree q = root.right.right;

        LeetCode_2_236 instance = new LeetCode_2_236();

        BinaryTree res = instance.lowestCommonAncestor(root, p, q);
        System.out.println(res.val);
    }

    @Test
    @DisplayName("只有一个元素根元素右侧，另外一个元素为空")
    void lowestCommonAncestor5() {
        BinaryTree root = new BinaryTree(3);
        root.left = new BinaryTree(5);
        root.right = new BinaryTree(1);
        root.left.left = new BinaryTree(6);
        root.left.right = new BinaryTree(2);
        root.left.right.left = new BinaryTree(7);
        root.left.right.right = new BinaryTree(4);
        root.right.left = new BinaryTree(0);
        root.right.right = new BinaryTree(8);

        BinaryTree p = root.right.right;
        BinaryTree q = null;


        LeetCode_2_236 instance = new LeetCode_2_236();

        BinaryTree res = instance.lowestCommonAncestor(root, p, q);
        System.out.println(res.val);
    }

    @Test
    @DisplayName("两个元素都为空")
    void lowestCommonAncestor6() {
        BinaryTree root = new BinaryTree(3);
        root.left = new BinaryTree(5);
        root.right = new BinaryTree(1);
        root.left.left = new BinaryTree(6);
        root.left.right = new BinaryTree(2);
        root.left.right.left = new BinaryTree(7);
        root.left.right.right = new BinaryTree(4);
        root.right.left = new BinaryTree(0);
        root.right.right = new BinaryTree(8);

        BinaryTree p = null;
        BinaryTree q = null;


        LeetCode_2_236 instance = new LeetCode_2_236();

        BinaryTree res = instance.lowestCommonAncestor(root, p, q);
        System.out.println(res);
    }
}