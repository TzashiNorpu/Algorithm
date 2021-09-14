package algo.tzashinorpu.Week02.Chapter07;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_2_105 {
    public BinaryTree buildTree(int[] preorder, int[] inorder) {
        //        preorder 根 左 右          inorder   左   根   右
        // preorder: 根节点|----------------左子树-----------------|-------------------右子树-------------------|
        //         preLeft|preLeft+1       preLeft+pIndex-inLeft|preLeft+pIndex-inLeft+1            preRight|

        // inorder: |----------------左子树-----------------|根节点|------------------右子树-------------------|
        //    inLeft|                             pIndex-1|pindex|pIndex+1                          inRight|
        int preLen = preorder.length;
        int inLen = inorder.length;
        if (preLen != inLen) {
            return null;
        }
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int j = 0; j < inLen; j++) {
            inorderMap.put(inorder[j], j);
        }
        int preLeft = 0;
        int preRight = preLen - 1;
        int inLeft = 0;
        int inRight = inLen - 1;
        return build(preorder, preLeft, preRight, inorder, inLeft, inRight, inorderMap);
    }

    private BinaryTree build(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight, Map<Integer, Integer> inorderMap) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int rootVal = preorder[preLeft];
        BinaryTree root = new BinaryTree(rootVal);
        Integer pIndex = inorderMap.get(rootVal);
        root.left = build(preorder, preLeft + 1, preLeft + pIndex - inLeft, inorder, inLeft, pIndex - 1, inorderMap);
        root.right = build(preorder, preLeft + pIndex - inLeft + 1, preRight, inorder, pIndex + 1, inRight, inorderMap);
        return root;
    }
}
