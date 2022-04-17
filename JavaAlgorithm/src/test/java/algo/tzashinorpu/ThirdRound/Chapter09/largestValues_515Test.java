package algo.tzashinorpu.ThirdRound.Chapter09;

import algo.tzashinorpu.ThirdRound.TreeNode;
import org.junit.jupiter.api.Test;

class largestValues_515Test {

    @Test
    void largestValues() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        largestValues_515 ins = new largestValues_515();
        System.out.println(ins.largestValues(root));
    }
}