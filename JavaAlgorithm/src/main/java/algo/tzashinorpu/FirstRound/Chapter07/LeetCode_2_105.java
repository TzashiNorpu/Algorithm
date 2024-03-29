package algo.tzashinorpu.FirstRound.Chapter07;


import algo.tzashinorpu.FirstRound.Chapter06.BinaryTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_2_105 {
    public BinaryTree buildTree1(int[] preorder, int[] inorder) {
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
        return build1(preorder, preLeft, preRight, inorder, inLeft, inRight, inorderMap);
    }

    private BinaryTree build1(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight, Map<Integer, Integer> inorderMap) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int rootVal = preorder[preLeft];
        BinaryTree root = new BinaryTree(rootVal);
        Integer pIndex = inorderMap.get(rootVal);
        root.left = build1(preorder, preLeft + 1, preLeft + pIndex - inLeft, inorder, inLeft, pIndex - 1, inorderMap);
        root.right = build1(preorder, preLeft + pIndex - inLeft + 1, preRight, inorder, pIndex + 1, inRight, inorderMap);
        return root;
    }


    public BinaryTree buildTree2(int[] preorder, int[] inorder) {
        int length = preorder.length;
        if (length == 0) {
            return null;
        }
        int rootVal = preorder[0];
        BinaryTree root = new BinaryTree(rootVal);
        if (length == 1) {
            return root;
        }
        int splitIndex = -1;
        for (int i = 0; i < length; i++) {
            if (inorder[i] == rootVal) {
                splitIndex = i;
                break;
            }
        }
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, splitIndex + 1);
        int[] rightPreorder = Arrays.copyOfRange(preorder, splitIndex + 1, length);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, splitIndex);
        int[] rightInorder = Arrays.copyOfRange(inorder, splitIndex + 1, length);
        root.left = buildTree2(leftPreorder, leftInorder);
        root.right = buildTree2(rightPreorder, rightInorder);
        return root;
    }

    public BinaryTree buildTree3(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        int preStartIndex = 0;
        int preEndIndex = inorder.length - 1;
        int inStartIndex = 0;
        int inEndIndex = inorder.length - 1;
        // leftPreStartIdnex, leftPreEndIdnex, rightPreStartIdnex, rightPreEndIdnex
        // leftInStartIdnex,  leftInEndIdnex,  rightInStartIdnex,  rightInStartIdnex
        return build3(preorder, preStartIndex, preEndIndex, inorder, inStartIndex, inEndIndex, inorderMap);
    }

    private BinaryTree build3(int[] preorder, int preStartIndex, int preEndIndex, int[] inorder, int inStartIndex, int inEndIndex, HashMap<Integer, Integer> inorderMap) {
        if (preStartIndex - preEndIndex==1) {
            return null;
        }
        int rootVal = preorder[preStartIndex];
        BinaryTree root = new BinaryTree(rootVal);
        if (preEndIndex ==preStartIndex) {
            return root;
        }
        Integer splitIndex = inorderMap.get(rootVal);
        int leftLen = splitIndex - inStartIndex;
        root.left = build3(preorder, preStartIndex + 1, preStartIndex+leftLen , inorder, inStartIndex, splitIndex - 1, inorderMap);
        root.right = build3(preorder, preStartIndex+leftLen + 1, preEndIndex, inorder, splitIndex+1, inEndIndex, inorderMap);
        return root;
    }

}
