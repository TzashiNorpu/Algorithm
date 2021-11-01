package algo.tzashinorpu.SecondRound.Chapter06;

import algo.tzashinorpu.SecondRound.Node;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class postorder_590Test {

    @Test
    void postorder() {
        Node root = new Node(1);
        Node node1_1 = new Node(2);
        Node node1_2 = new Node(3);
        Node node1_3 = new Node(4);
        Node node2_1 = new Node(5);
        Node node2_2 = new Node(6);
        Node node2_3 = new Node(7);
        List<Node> level2 = new LinkedList<>();
        level2.add(node2_1);
        level2.add(node2_2);
        level2.add(node2_3);
        node1_2.children = level2;
        List<Node> level1 = new LinkedList<>();
        level1.add(node1_1);
        level1.add(node1_2);
        level1.add(node1_3);
        root.children = level1;

        postorder_590 instance = new postorder_590();
        System.out.println(instance.postorder(root));
    }
}