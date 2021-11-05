package algo.tzashinorpu.SecondRound.Chapter09;

import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class largestValues_515Test {

    @Test
    void largestValues() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        largestValues_515 instance = new largestValues_515();
        System.out.println(instance.largestValues(root));
    }
}