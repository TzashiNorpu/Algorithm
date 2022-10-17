package algo.tzashinorpu.WeekContest.D0918;

import algo.tzashinorpu.ThirdRound.TreeNode;

import java.util.ArrayDeque;

public class reverseOddLevels_6182 {
    public TreeNode reverseOddLevels(TreeNode root) {
        ArrayDeque<TreeNode> pDeque = new ArrayDeque<>();
        ArrayDeque<TreeNode> ppDeque = new ArrayDeque<>();
        ArrayDeque<TreeNode> cDeque = new ArrayDeque<>();
        ArrayDeque<TreeNode> ccDeque = new ArrayDeque<>();
        pDeque.addLast(root);
        cDeque.addLast(root.left);
        cDeque.addLast(root.right);
        int level = 1;
        while (!pDeque.isEmpty()) {
            int size = pDeque.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = pDeque.pollFirst();
                TreeNode l = null;
                TreeNode r = null;
                if (level % 2 != 0) {
                    l = cDeque.pollLast();
                    r = cDeque.pollLast();
                    p.left = l;
                    p.right = r;
                } else {
                    l = cDeque.pollFirst();
                    r = cDeque.pollFirst();
                    p.left = l;
                    p.right = r;
                }
                ppDeque.addLast(l);
                ppDeque.addLast(r);
                if (l.right != null)
                    ccDeque.addFirst(l.right);
                if (l.left != null)
                    ccDeque.addFirst(l.left);
                if (r.right != null)
                    ccDeque.addFirst(r.right);
                if (r.left != null)
                    ccDeque.addFirst(r.left);
            }
            level++;
            pDeque.addAll(ppDeque);
            ppDeque.clear();
            cDeque.addAll(ccDeque);
            ccDeque.clear();
        }
        return root;
    }


}
