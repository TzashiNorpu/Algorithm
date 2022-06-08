package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.*;

public class verticalTraversal_987 {
    //      3
    //   1     4
    // 0   2  2
    // [3,1,4,0,2,2]->[[0],[1],[3,2,2],[4]]
    // col row values
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map;
    List<List<Integer>> res;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map = new TreeMap<>();
        res = new ArrayList<>();
        helper(root, 0, 0);
        map.forEach((col, treeMap) -> {
            ArrayList<Integer> tmp = new ArrayList<>();
            treeMap.forEach((row, queue) -> {
                while (!queue.isEmpty()) tmp.add(queue.poll());
            });
            res.add(tmp);
        });
        return res;
    }

    private void helper(TreeNode root, int row, int col) {
        if (root == null) return;
        if (!map.containsKey(col))
            map.put(col, new TreeMap<>());
        if (!map.get(col).containsKey(row))
            map.get(col).put(row, new PriorityQueue<>());
        map.get(col).get(row).add(root.val);
        helper(root.left, row + 1, col - 1);
        helper(root.right, row + 1, col + 1);
    }
}
