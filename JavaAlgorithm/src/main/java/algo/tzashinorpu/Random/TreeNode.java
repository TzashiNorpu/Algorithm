package algo.tzashinorpu.Random;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        traverse(node.left);
        traverse(node.right);
    }
}
