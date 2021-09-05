package algo.tzashinorpu.Week02.Chapter06;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_589_1 {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        traverse(res, root);
        return res;
    }

    private void traverse(ArrayList<Integer> res, Node root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        if (root.childrens != null) {
            for (Node node: root.childrens){
                traverse(res,node);
            }
        }
    }

    public static void main(String[] args) {
        List<Node> nodes3 = new ArrayList<>();
        nodes3.add(new Node(5));
        nodes3.add(new Node(6));
        Node node21 = new Node(3, nodes3);

        List<Node> nodes2 = new ArrayList<>();
        nodes2.add(node21);
        nodes2.add(new Node(2));
        nodes2.add(new Node(4));
        Node root = new Node(1, nodes2);

        LeetCode_2_589_1 sol = new LeetCode_2_589_1();
        System.out.println(sol.preorder(root));
    }
}
