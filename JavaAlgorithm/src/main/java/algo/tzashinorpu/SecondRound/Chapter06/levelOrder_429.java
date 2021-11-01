package algo.tzashinorpu.SecondRound.Chapter06;

import algo.tzashinorpu.SecondRound.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class levelOrder_429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Node> stack = new LinkedList<>();
        stack.push(root);
        while (stack.size() > 0) {
            int size = stack.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node pop = stack.pop();
                temp.add(pop.val);
                if (pop.children != null) {
                    stack.addAll(pop.children);
                }
            }
            res.add(temp);
        }
        return res;
    }

    public List<List<Integer>> levelOrderByFDfs(Node root) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        dfs(root, 0, map);
        return new ArrayList<>(map.values());
    }

    private void dfs(Node root, int level, HashMap<Integer, ArrayList<Integer>> map) {
        if (root == null) {
            return;
        }
        map.putIfAbsent(level, new ArrayList<>());
        map.get(level).add(root.val);
        if (root.children != null) {
            for (Node n : root.children) {
                dfs(n, level + 1, map);
            }
        }
    }
}
