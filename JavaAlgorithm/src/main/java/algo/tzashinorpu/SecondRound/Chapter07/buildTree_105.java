package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.TreeNode;

import java.util.Arrays;

public class buildTree_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        /*Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
        Output: [3,9,20,null,null,15,7]*/
        return dfs(preorder, inorder);
    }

    private TreeNode dfs(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        if (preorder.length == 1 || inorder.length == 1) {
            return new TreeNode(preorder[0]);
        }
        int rootV = preorder[0];
        TreeNode root = new TreeNode(rootV);
        int inOrderLen = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootV) {
                inOrderLen = i;
                break;
            }
        }
        int[] pLeft = Arrays.copyOfRange(preorder, 1, inOrderLen + 1);
        int[] pRight = Arrays.copyOfRange(preorder, inOrderLen + 1, preorder.length);
        int[] iLeft = Arrays.copyOfRange(inorder, 0, inOrderLen);
        int[] iRight = Arrays.copyOfRange(inorder, inOrderLen + 1, inorder.length);
        root.left = dfs(pLeft, iLeft);
        root.right = dfs(pRight, iRight);
        return root;
    }


}
