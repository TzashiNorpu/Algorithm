package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class buildTree_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // pre -> root l r  -> []
        // in ->  l root r  -> []
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        int preLen = preorder.length;
        int inLen = inorder.length;
        int preL = 0;
        int preR = preLen - 1;
        int inL = 0;
        int inR = inLen - 1;
        return dfs(preorder, preL, preR, inorder, inL, inR, map);
    }

    // 区间索引为闭区间 []
    private TreeNode dfs(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end, Map<Integer, Integer> map) {
        if (p_start > p_end) return null;
        if (p_start == p_end) return new TreeNode(preorder[p_end]);
        if (i_start == i_end) return new TreeNode(inorder[i_start]);
        int rootVal = preorder[p_start];
        Integer rootIndex = map.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        int leftLen = rootIndex - i_start;
        int rightLen = i_end - rootIndex;
        root.left = dfs(preorder, p_start + 1, p_start + leftLen, inorder, rootIndex - leftLen, rootIndex - 1, map);
        root.right = dfs(preorder, p_end - rightLen + 1, p_end, inorder, rootIndex + 1, rootIndex + rightLen, map);
        return root;
    }

}
