package algo.tzashinorpu.Week02.Chapter07;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;

public class LeetCode_2_104 {
    public int maxDepth(BinaryTree root) {
        return  dfs(root,0);
    }

    private int dfs(BinaryTree root,int levelCnt) {
        if (root == null) {
            return levelCnt;
        }
        levelCnt = levelCnt+1;
        return Math.max(dfs(root.left, levelCnt), dfs(root.right,levelCnt));
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(3);
        root.left = new BinaryTree(9);
        root.right = new BinaryTree(20);
        root.right.left = new BinaryTree(15);
        root.right.right = new BinaryTree(7);

        LeetCode_2_104 instance = new LeetCode_2_104();
        System.out.println(instance.maxDepth(root));

    }
}
