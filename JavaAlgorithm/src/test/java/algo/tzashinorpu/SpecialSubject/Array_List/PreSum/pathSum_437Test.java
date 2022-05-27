package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import algo.tzashinorpu.ThirdRound.TreeNode;
import org.junit.jupiter.api.Test;

class pathSum_437Test {

    @Test
    void pathSum() {
        pathSum_437 ins = new pathSum_437();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);
//        System.out.println(ins.pathSum_1(root, 8));
        System.out.println(ins.pathSum_2(root, 8));
    }
}