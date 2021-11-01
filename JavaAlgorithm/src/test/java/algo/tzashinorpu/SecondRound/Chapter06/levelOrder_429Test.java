package algo.tzashinorpu.SecondRound.Chapter06;

import algo.tzashinorpu.SecondRound.Node;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class levelOrder_429Test {

    @Test
    void levelOrder() {
        Node root = new Node(1);
        Node node1_1 = new Node(3);
        Node node1_2 = new Node(2);
        Node node1_3 = new Node(4);
        Node node2_1 = new Node(5);
        Node node2_2 = new Node(6);
        List<Node> level2 = new LinkedList<>();
        level2.add(node2_1);
        level2.add(node2_2);
        node1_1.children = level2;
        List<Node> level1 = new LinkedList<>();
        level1.add(node1_1);
        level1.add(node1_2);
        level1.add(node1_3);
        root.children = level1;
        levelOrder_429 instance = new levelOrder_429();
        System.out.println(instance.levelOrder(root));
        System.out.println(instance.levelOrderByFDfs(root));
    }
}