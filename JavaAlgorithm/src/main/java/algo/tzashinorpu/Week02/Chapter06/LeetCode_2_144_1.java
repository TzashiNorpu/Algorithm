package algo.tzashinorpu.Week02.Chapter06;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_144_1{
    public List<Integer> preorderTraversal(BinaryTree root) {
        ArrayList<Integer> res = new ArrayList<>();
        traverse(res, root);
        return res;
    }

    private void traverse(ArrayList<Integer> res, BinaryTree root) {
        // 根  左  右
        if (root==null) return ;
        res.add(root.val);
        traverse(res,root.left);
        traverse(res,root.right);
    }

    public static void main(String[] args) {
        LeetCode_2_144_1 sol = new LeetCode_2_144_1();
        BinaryTree root = new BinaryTree(1);
        root.right = new BinaryTree(2);
        root.right.left = new BinaryTree(3);
        System.out.println(sol.preorderTraversal(root));
    }
}
