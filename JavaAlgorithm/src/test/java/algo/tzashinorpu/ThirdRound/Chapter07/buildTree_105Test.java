package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class buildTree_105Test {

    @Test
    void buildTree() throws IOException {

        buildTree_105 ins = new buildTree_105();
        int[] inOrder = {2, 1};
        int[] preOrder = {1, 2};
        TreeNode node = ins.buildTree(preOrder, inOrder);
        System.in.read();
    }
}