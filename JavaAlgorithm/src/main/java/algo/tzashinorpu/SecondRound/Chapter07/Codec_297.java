package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Codec_297 {
    public String serialize(TreeNode root) {
        String temp = serDfs(root);
        return temp.substring(0, temp.length() - 1);
    }

    private String serDfs(TreeNode root) {
        if (root == null) {
            return "X,";
        }
        return root.val + "," + serDfs(root.left) + serDfs(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        LinkedList<String> nodes = new LinkedList<String>(List.of(split));
        return derDfs(nodes);
    }

    private TreeNode derDfs(LinkedList<String> nodes) {
        if (nodes.size() == 0) {
            return null;
        }
        String poll = nodes.pollFirst();
        if (poll.equals("X")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(poll));
        root.left = derDfs(nodes);
        root.right = derDfs(nodes);
        return root;
    }
}
