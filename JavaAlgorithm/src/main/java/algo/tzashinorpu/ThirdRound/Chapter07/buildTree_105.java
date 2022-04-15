package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class buildTree_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        Input: preorder[root l r] = [3,9,20,15,7], inorder[l root r] = [9,3,15,20,7]
//        Output: [3,9,20,null,null,15,7]
        int preLen = preorder.length;
        int inLen = inorder.length;
        int preL = 0;
        int preR = preLen - 1;
        int inL = 0;
        int inR = inLen - 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < preLen; i++) {
            map.put(inorder[i], i);
        }
        return recursive(preorder, preL, preR, inorder, inL, inR, map);
    }

    private TreeNode recursive(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR, Map<Integer, Integer> map) {
        if (preL > preR || inL > inR) {
            return null;
        }
        if (preL == preR) {
            return new TreeNode(preorder[preL]);
        }
        if (inL == inR) {
            return new TreeNode(inorder[inL]);
        }
        int rootVal = preorder[preL];
        Integer rootIndex = map.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        int leftLen = rootIndex - inL;
        int rightLen = inR - rootIndex;
        root.left = recursive(preorder, preL + 1, preL + leftLen, inorder, rootIndex - leftLen, rootIndex - 1, map);
        root.right = recursive(preorder, preR - rightLen + 1, preR, inorder, rootIndex + 1, rootIndex + rightLen, map);
        return root;
    }
}
