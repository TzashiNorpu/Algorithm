package algo.tzashinorpu.ThirdRound.Chapter06;

import algo.tzashinorpu.ThirdRound.Node;

import java.util.ArrayList;
import java.util.List;

public class preorder_589 {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        traversal(res, root);
        return res;
    }

    private void traversal(ArrayList<Integer> res, Node root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node n : root.children) {
            traversal(res, n);
        }
    }
}
