package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class allPossibleFBT_894 {
    // 备忘录，记录 n 个节点能够组合成的所有可能二叉树
    List<TreeNode>[] memo;

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            // 题目描述的满二叉树不可能是偶数个节点
            return new LinkedList<>();
        }
        memo = new LinkedList[n + 1];
        return helper(n);
    }

    private List<TreeNode> helper(int n) {
        List<TreeNode> res = new LinkedList<>();
        if (n == 1) {
            res.add(new TreeNode(0));
            return res;
        }
        if (memo[n] != null) {
            // 避免冗余计算
            return memo[n];
        }
        // n = 3 时 左子树 1【一个节点】 右子树 3-1-1【一个节点】  【根节点要占用一个节点】
        for (int i = 1; i < n; i += 2) {
            int j = n - i - 1;
            List<TreeNode> leftTrees = helper(i);
            List<TreeNode> rightTrees = helper(j);
            for (TreeNode l : leftTrees) {
                for (TreeNode r : rightTrees) {
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        // 存入备忘录
        memo[n] = res;
        return res;
    }

}
