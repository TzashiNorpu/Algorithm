package algo.tzashinorpu.FirstRound.Chapter09;


import algo.tzashinorpu.FirstRound.Chapter06.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_3_102 {
    public List<List<Integer>> levelOrder(BinaryTree root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        List<BinaryTree> stack = new ArrayList<>();
        stack.add(root);
        while (stack.size() > 0) {
            // 当前层的节点个数
            int size = stack.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                BinaryTree pop = stack.remove(0);
                temp.add(pop.val);
                if (pop.left != null) {
                    stack.add(pop.left);
                }
                if (pop.right != null) {
                    stack.add(pop.right);
                }
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }
}
