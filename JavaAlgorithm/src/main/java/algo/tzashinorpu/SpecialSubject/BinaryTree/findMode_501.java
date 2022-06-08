package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

public class findMode_501 {
    HashMap<Integer, Integer> count = new HashMap<>();
    int max = 0;

    public int[] findMode(TreeNode root) {
        helper(root);
        ArrayList<Integer> l = new ArrayList<>();
        count.forEach((v, cnt) -> {
            if (cnt == max) l.add(v);
        });
        int[] res = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            res[i] = l.get(i);
        }
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        int cnt = count.getOrDefault(root.val, 0) + 1;
        count.put(root.val, cnt);
        max = Math.max(cnt, max);
        helper(root.left);
        helper(root.right);
    }
}
