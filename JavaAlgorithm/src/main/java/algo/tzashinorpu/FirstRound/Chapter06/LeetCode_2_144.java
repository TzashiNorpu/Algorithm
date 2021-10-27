package algo.tzashinorpu.FirstRound.Chapter06;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode_2_144 {
    // https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
    //      1
    //          2
    //        3
    public List<Integer> preorderTraversal1(BinaryTree root) {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    private void traverse(BinaryTree root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        traverse(root.left, res);
        traverse(root.right, res);
    }

    private List<Integer> preorderTraversal2(BinaryTree root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<BinaryTree> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            // 左边节点为空  右边节点为空  看堆栈中是否有元素
            // 左边节点为空  右边节点非空  则处理右边节点的结构
            root = stack.pop().right;
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        node1.right = node2;
        node2.left = node3;
        List<Integer> res = new ArrayList<>();

        LeetCode_2_144 Test = new LeetCode_2_144();
//        res = Test.preorderTraversal1(node1);
        res = Test.preorderTraversal2(node1);
        System.out.println(res);
    }
}
