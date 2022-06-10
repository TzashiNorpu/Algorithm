package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class constructMaximumBinaryTree_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) return null;
        int rootIndex = find(nums, leftIndex, rightIndex);
        TreeNode node = new TreeNode(nums[rootIndex]);
        node.left = build(nums, leftIndex, rootIndex - 1);
        node.right = build(nums, rootIndex + 1, rightIndex);
        return node;
    }

    private int find(int[] nums, int leftIndex, int rightIndex) {
        int index = leftIndex;
        for (int i = leftIndex; i <= rightIndex; i++) {
            if (nums[i] > nums[index]) index = i;
        }
        return index;
    }
}
