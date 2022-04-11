package algo.tzashinorpu.ThirdRound.Chapter06;

import algo.tzashinorpu.ThirdRound.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorder_590 {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        traversal(res, root);
        return res;
    }

    private void traversal(ArrayList<Integer> res, Node root) {
        if (root == null) {
            return;
        }
        // l r root
        for (Node n : root.children) {
            traversal(res, n);
        }
        res.add(root.val);
    }
}
