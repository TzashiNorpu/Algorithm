package algo.tzashinorpu.FirstRound.Chapter06;

import java.util.*;

public class LeetCode_2_590_1 {
    public List<Integer> postorder1(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        traverse1(res, root);
        return res;
    }
    // 左  右  根
    private void traverse1(ArrayList<Integer> res, Node root) {
        if (root == null) {
            return;
        }
        if (root.childrens != null) {
            for (Node node : root.childrens) {
                traverse1(res,node);
            }
        /*for (int i = 0; i < root.childrens.size(); i++) {
            traverse2(res,root.childrens.get(i));
        }*/
        }
        res.add(root.val);
    }


    public List<Integer> postorder2(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (res == null) {
            return res;
        }
        traverse2(res, root);
        res.add(root.val );
        return res;
    }
    // 左  右  根
    private void traverse2(ArrayList<Integer> res, Node root) {
        if (root.childrens == null) {
            return;
        }
        for (Node node : root.childrens) {
            traverse2(res,node);
            res.add(node.val);
        }
    }

    public List<Integer> postorder3(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        ArrayDeque<Node> stack = new ArrayDeque<>();
        // 左  右  根
        stack.addLast(root);
        while (!stack.isEmpty()) {
            Node pop = stack.removeLast();
            res.addFirst(pop.val);
            if (pop.childrens != null) {
                for (Node node : pop.childrens) {
                    stack.addLast(node);
                }
            }
        }
        return res;
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

        LeetCode_2_590_1 sol = new LeetCode_2_590_1();
        System.out.println(sol.postorder1(root));
    }
}
