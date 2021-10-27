package algo.tzashinorpu.FirstRound.Chapter06;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_094_1 {
    public List<Integer> inorderTraversal(BinaryTree tree) {
        if (tree==null) return null;
        List<Integer> res = new ArrayList<>();
        traversal(res, tree);
        return res;
    }
    // 左  根  右
    private void traversal(List<Integer> collect,BinaryTree root) {
        if (root.left != null) {
            traversal(collect,root.left);
        }
//        System.out.println(root.val);
        collect.add(root.val);
        if (root.right != null) {
            traversal(collect,root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.right = new BinaryTree(2);
        root.right.left = new BinaryTree(3);
        LeetCode_2_094_1 sol = new LeetCode_2_094_1();
        List<Integer> res = sol.inorderTraversal(root);
        System.out.println(res);
    }
}
