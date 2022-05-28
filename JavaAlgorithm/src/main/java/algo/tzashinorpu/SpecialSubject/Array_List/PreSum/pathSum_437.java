package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;


import algo.tzashinorpu.SpecialSubject.TreeNode;

import java.util.HashMap;

public class pathSum_437 {
    int count = 0;

    public int pathSum_1(TreeNode root, int targetSum) {
        traversal(root, targetSum);
        return count;
    }

    private void traversal(TreeNode root, int targetSum) {
        if (root == null) return;
        // 测试每个节点为起点是否有满足targetSum的路径
        test(root, targetSum);
        traversal(root.left, targetSum);
        traversal(root.right, targetSum);
    }

    private void test(TreeNode root, int targetSum) {
        if (root == null) return;
        if (targetSum - root.val == 0) {
            count++;
            // 这里不能 return 该节点满足，后续增加多个和为0的节点的路径也满足
//            return;
        }
        test(root.left, targetSum - root.val);
        test(root.right, targetSum - root.val);
    }

    public int pathSum_2(TreeNode root, int targetSum) {
        HashMap<Integer, Integer> mem = new HashMap<>();
        mem.put(0, 1);
        mem_traversal(root, mem, 0, targetSum);
        return count;
    }

    private void mem_traversal(TreeNode root, HashMap<Integer, Integer> mem, int currSum, int targetSum) {
        if (root == null) return;
        currSum += root.val;
        count += mem.getOrDefault(currSum - targetSum, 0);
        mem.put(currSum, mem.getOrDefault(currSum, 0) + 1);

        mem_traversal(root.left, mem, currSum, targetSum);
        mem_traversal(root.right, mem, currSum, targetSum);
        // 当前分支走完  移除当前分支的和【计数减1】
        mem.put(currSum, mem.get(currSum) - 1);
    }
}
