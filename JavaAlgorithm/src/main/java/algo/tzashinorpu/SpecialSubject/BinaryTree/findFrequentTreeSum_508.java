package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findFrequentTreeSum_508 {
    HashMap<Integer, ArrayList<Integer>> map;
    HashMap<Integer, Integer> count;
    int maxCount = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();
        count = new HashMap<>();
        helper(root);
        /*int[] res = new int[map.get(maxCount).size()];
        ArrayList<Integer> list = map.get(maxCount);
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;*/

        List<Integer> res = new ArrayList<>();
        for (int s : count.keySet()) {
            if (count.get(s) == maxCount)
                res.add(s);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        int sum = l + r + root.val;
        int cnt = count.getOrDefault(sum, 0) + 1;
        count.put(sum, cnt);
        maxCount = Math.max(maxCount, cnt);
        ArrayList<Integer> list = map.getOrDefault(cnt, new ArrayList<>());
        list.add(sum);
        map.put(cnt, list);
        return sum;
    }
}
