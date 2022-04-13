package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.ArrayDeque;
import java.util.List;

public class Codec_297 {
    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        dfs(builder, root);
        return builder.toString();
    }

    private void dfs(StringBuilder builder, TreeNode root) {
        if (root == null) {
            builder.append("x,");
            return;
        }
        builder.append(root.val + ",");
        dfs(builder, root.left);
        dfs(builder, root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        ArrayDeque<String> dequeue = new ArrayDeque<>(List.of(split));
        return deser(dequeue);
    }

    private TreeNode deser(ArrayDeque<String> dequeue) {
        if (dequeue.isEmpty()) {
            return null;
        }
        String s = dequeue.pollFirst();
        if (s.equals("x")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left = deser(dequeue);
        node.right = deser(dequeue);
        return node;
    }
}
