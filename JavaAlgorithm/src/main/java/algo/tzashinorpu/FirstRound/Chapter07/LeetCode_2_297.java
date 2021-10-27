package algo.tzashinorpu.FirstRound.Chapter07;


import algo.tzashinorpu.FirstRound.Chapter06.BinaryTree;
import algo.tzashinorpu.FirstRound.Chapter06.LeetCode_2_144_1;

import java.util.Arrays;

public class LeetCode_2_297 {
    // Encodes a tree to a single string.
    private String res;
    private String[] nodes;

    public String serialize(BinaryTree root) {
        String s = serDfs(root);
        this.res = s.substring(0, s.length() - 1);
        this.nodes = this.res.split(",");
        return this.res;
    }

    private String serDfs(BinaryTree root) {
        if (root == null) {
            return "X,";
        }
        return root.val + "," + serDfs(root.left) + serDfs(root.right);
    }

    // Decodes your encoded data to tree.


    public BinaryTree deserialize(String data) {
        this.res = data;
        this.nodes = data.split(",");
        return deserDfs();
    }

    private BinaryTree deserDfs() {
        if (nodes[0].equals("X")) {
            nodes = Arrays.copyOfRange(nodes, 1, nodes.length);
            return null;
        }
        BinaryTree root = new BinaryTree(Integer.parseInt(nodes[0]));
        nodes = Arrays.copyOfRange(nodes, 1, nodes.length);
        root.left = deserDfs();
        root.right = deserDfs();
        return root;
    }

    public static void main(String[] args) {
        LeetCode_2_297 ser = new LeetCode_2_297();
        LeetCode_2_297 deSer = new LeetCode_2_297();
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(4);
        root.right.right = new BinaryTree(5);
        String serialize = ser.serialize(root);
        System.out.println(serialize);
        BinaryTree node = deSer.deserialize(serialize);
        LeetCode_2_144_1 traverse = new LeetCode_2_144_1();
        System.out.println(traverse.preorderTraversal(node));
    }
}
