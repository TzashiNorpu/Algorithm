package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;
import org.junit.jupiter.api.Test;

class smallestFromLeaf_988Test {

    @Test
    void smallestFromLeaf() {
        /*TreeNode root1 = new TreeNode(0);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(3);
        root1.right.right = new TreeNode(4);
        smallestFromLeaf_988 ins1 = new smallestFromLeaf_988();
        System.out.println(ins1.smallestFromLeaf(root1));


        TreeNode root2 = new TreeNode(25);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(3);
        root2.right.left = new TreeNode(0);
        root2.right.right = new TreeNode(2);
        smallestFromLeaf_988 ins2 = new smallestFromLeaf_988();
        System.out.println(ins2.smallestFromLeaf(root2));

        TreeNode root3 = new TreeNode(2);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(1);
        root3.left.right = new TreeNode(1);
        root3.right.left = new TreeNode(0);
        root3.left.right.left = new TreeNode(0);
        smallestFromLeaf_988 ins3 = new smallestFromLeaf_988();
        System.out.println(ins3.smallestFromLeaf(root3));

        TreeNode root4 = new TreeNode(0);
        root4.right = new TreeNode(1);
        smallestFromLeaf_988 ins4 = new smallestFromLeaf_988();
        System.out.println(ins4.smallestFromLeaf(root4));*/


        TreeNode root5 = new TreeNode(25);
        root5.left = new TreeNode(1);
        root5.left.left = new TreeNode(0);
        root5.left.right = new TreeNode(0);
        root5.left.left.left = new TreeNode(1);
        root5.left.left.left.left = new TreeNode(0);
        smallestFromLeaf_988 ins5 = new smallestFromLeaf_988();
        System.out.println(ins5.smallestFromLeaf_1(root5));
        System.out.println(ins5.smallestFromLeaf_2(root5));
    }
}