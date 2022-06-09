package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.ArrayDeque;

public class addOneRow_623 {
    /*
            4
        2       6
      3   1   5
     */
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        boolean flag = false;
        deque.offerLast(root);
        int level = 1;
        if (depth == 1) {
            TreeNode treeNode = new TreeNode(val);
            treeNode.left = root;
            return treeNode;
        }
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = deque.pollFirst();
                TreeNode l = pop.left;
                TreeNode r = pop.right;
                if (level == depth - 1) {
                    pop.left = new TreeNode(val);
                    pop.left.left = l;
                    pop.right = new TreeNode(val);
                    pop.right.right = r;
                    flag = true;
                }
                if (pop.left != null) deque.offerLast(pop.left);
                if (pop.right != null) deque.offerLast(pop.right);
            }
            if (flag) break;
            level++;
        }
        return root;
    }
}
