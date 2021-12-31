package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_1026Test {

    @Test
    void maxAncestorDiff() {
       /* LeetCode_1026 ins1 = new LeetCode_1026();
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(3);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(6);
        root1.left.right.left = new TreeNode(4);
        root1.left.right.right = new TreeNode(7);

        root1.right = new TreeNode(10);
        root1.right.right = new TreeNode(14);
        root1.right.left = new TreeNode(100);
        System.out.println(ins1.maxAncestorDiff(root1));


        LeetCode_1026 ins2 = new LeetCode_1026();
        TreeNode root2 = new TreeNode(2);
        root2.right = new TreeNode(0);
        root2.right.right = new TreeNode(4);
        root2.right.right.right = new TreeNode(3);
        root2.right.right.right.right = new TreeNode(1);
        System.out.println(ins2.maxAncestorDiff(root2));
*/

        //[2, 4,3, 1,null,0,5, null,6,null,null,null,7]
        LeetCode_1026 ins3 = new LeetCode_1026();
        TreeNode root3 = new TreeNode(2);
        root3.left = new TreeNode(4);
        root3.left.left = new TreeNode(1);
        root3.left.left.right = new TreeNode(6);

        root3.right = new TreeNode(3);
        root3.right.left = new TreeNode(0);
        root3.right.right = new TreeNode(5);
        root3.right.right.left = new TreeNode(7);

        System.out.println(ins3.maxAncestorDiff(root3));
    }
}