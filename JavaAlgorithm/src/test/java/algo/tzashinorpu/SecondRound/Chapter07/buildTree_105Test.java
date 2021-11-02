package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.Chapter06.inorderTraversal_094;
import org.junit.jupiter.api.Test;

class buildTree_105Test {

    @Test
    void buildTree() {
        inorderTraversal_094 t = new inorderTraversal_094();

        int[] preorder = {1, 2};
        int[] inorder = {2, 1};
        buildTree_105 instance = new buildTree_105();
        System.out.println(t.inorderTraversal(instance.buildTree(preorder, inorder)));
    }
}