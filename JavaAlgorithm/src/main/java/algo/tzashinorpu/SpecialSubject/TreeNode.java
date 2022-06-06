package algo.tzashinorpu.SpecialSubject;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        String f = "-->";
        String s = dfs(this, f);
        return s.substring(0, s.lastIndexOf(f));
    }

    private String dfs(TreeNode treeNode, String f) {
        if (treeNode == null) return "";
        String l = dfs(treeNode.left, f);
        String r = dfs(treeNode.right, f);
        return l + (treeNode.val + f) + r;
    }
}
