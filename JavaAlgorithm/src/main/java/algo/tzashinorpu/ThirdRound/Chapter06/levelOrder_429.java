package algo.tzashinorpu.ThirdRound.Chapter06;

import algo.tzashinorpu.ThirdRound.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class levelOrder_429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        ArrayDeque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node pop = stack.pollFirst();
                level.add(pop.val);
                for (Node n : pop.children) {
                    if (n != null) {
                        stack.offerLast(n);
                    }
                }
            }
            res.add(level);
        }
        return res;
    }
}
