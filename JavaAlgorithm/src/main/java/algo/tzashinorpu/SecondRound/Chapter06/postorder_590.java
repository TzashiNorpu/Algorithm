package algo.tzashinorpu.SecondRound.Chapter06;


import algo.tzashinorpu.SecondRound.Node;

import java.util.LinkedList;
import java.util.List;

public class postorder_590 {
    public List<Integer> postorder(Node root) {
        // left right root
        List<Integer> res = new LinkedList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        for (Node node : root.children) {
            dfs(node, res);
            res.add(node.val);
        }

    }
}
