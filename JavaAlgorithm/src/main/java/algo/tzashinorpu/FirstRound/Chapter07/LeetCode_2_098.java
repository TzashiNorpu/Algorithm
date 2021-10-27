package algo.tzashinorpu.FirstRound.Chapter07;


import algo.tzashinorpu.FirstRound.Chapter06.BinaryTree;

import java.util.ArrayList;

public class LeetCode_2_098 {
    public boolean isValidBST1(BinaryTree root) {
        // 左 根 右
        ArrayList<Integer> integers = new ArrayList<>();
        return isValidBST1(root, integers);
    }

    private boolean isValidBST1(BinaryTree root, ArrayList<Integer> integers) {
        if (root == null) {
            return true;
        }
        boolean left = isValidBST1(root.left, integers);

        if (integers.size() > 0) {
            Integer temp = integers.get(integers.size() - 1);
            if (temp>=root.val){
                return false;
            }
        }
        integers.add(root.val);
        boolean right = isValidBST1(root.right, integers);
        return left && right;
    }
    public boolean isValidBST2(BinaryTree root) {
        if (root == null) return true;
        return isValidBST2(root, null, null);
    }

    private boolean isValidBST2(BinaryTree root, BinaryTree min, BinaryTree max) {
        if (root == null) return true;
        // 右边分支
        if (min != null && root.val <= min.val) return false;
        // 左边分支
        if (max != null && root.val >= max.val) return false;
        return isValidBST2(root.left, min, root) && isValidBST2(root.right, root, max);
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(1);
        /*root.right = new BinaryTree(7);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(8);*/
        LeetCode_2_098 instance = new LeetCode_2_098();
        System.out.println(instance.isValidBST2(root));
    }
}
