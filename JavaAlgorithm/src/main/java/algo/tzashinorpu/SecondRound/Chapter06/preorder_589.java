package algo.tzashinorpu.SecondRound.Chapter06;


import algo.tzashinorpu.SecondRound.Node;

import java.util.ArrayList;
import java.util.List;

public class preorder_589 {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(Node root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        if (root.children != null) {
            for (Node n : root.children) {
                dfs(n, res);
            }
        }
    }
}
