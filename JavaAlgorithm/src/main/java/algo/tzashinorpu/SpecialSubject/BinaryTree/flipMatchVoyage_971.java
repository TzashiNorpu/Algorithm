package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flipMatchVoyage_971 {
    int i = 0;
    List<Integer> res = new ArrayList<>();

    /*Global integer i indicates next index in voyage v.
    If current node == null, it's fine, we return true
    If current node.val != v[i], doesn't match wanted value, return false
    If left child exist but don't have wanted value, flip it with right child.*/
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        return dfs(root, voyage) ? res : Arrays.asList(-1);
    }

    // 先用左子树匹配 voyage 的元素 左子树匹配完后再用右子树匹配
    // 左子树匹配失败时用右子树匹配 voyage 的元素 并将此时的父节点认为是一个解放入结果集中
    private Boolean dfs(TreeNode node, int[] voyage) {
        if (node == null) return true;
        if (node.val != voyage[i++]) return false;
        if (node.left != null && node.left.val != voyage[i]) {
            // 左子树节点值和对应的前序值不同时先默认为结果，用右子树和该值进行比较
            res.add(node.val);
            return dfs(node.right, voyage) && dfs(node.left, voyage);
        }
        // 左子树节点值和对应的前序值相同时下探
        return dfs(node.left, voyage) && dfs(node.right, voyage);
    }
}
