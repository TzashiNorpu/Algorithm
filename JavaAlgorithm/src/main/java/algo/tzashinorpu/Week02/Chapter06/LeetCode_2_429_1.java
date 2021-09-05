package algo.tzashinorpu.Week02.Chapter06;

import java.util.*;

public class LeetCode_2_429_1 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> stack = new ArrayDeque<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Node poll = stack.poll();
                level.add(poll.val);
                if (poll.childrens != null) {
                    stack.addAll(poll.childrens);
                }
            }
            result.add(level);
        }
        return result;
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

        LeetCode_2_429_1 sol = new LeetCode_2_429_1();
        System.out.println(sol.levelOrder(root));
    }
}
