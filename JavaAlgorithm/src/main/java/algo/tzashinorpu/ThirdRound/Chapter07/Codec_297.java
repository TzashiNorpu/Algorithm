package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;

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
        return deser(split, 0);
    }

    private TreeNode deser(String[] split, int index) {
        if (index == split.length) {
            return null;
        }
        if (split[index].equals("x")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(split[index]));
        node.left = deser(split, index++);
        node.right = deser(split, index++);
        return node;
    }
}
