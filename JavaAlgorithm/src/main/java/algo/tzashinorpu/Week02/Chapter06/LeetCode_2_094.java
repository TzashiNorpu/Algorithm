package algo.tzashinorpu.Week02.Chapter06;


import java.util.*;

public class LeetCode_2_094 {
    // https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
    //      1
    //          2
    //        3
    public List<Integer> inorderTraversal1(BinaryTree root) {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    private void traverse(BinaryTree root, List<Integer> res) {
        if (root == null) {
            return;
        }
        traverse(root.left, res);
        res.add(root.val);
        traverse(root.right, res);
    }

    private List<Integer> inorderTraversal2(BinaryTree root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<BinaryTree> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            // 此时的tmp是null 拿到栈中弹出的元素的右节点来更新当前的节点
            BinaryTree tmp = stack.pop();
            res.add(tmp.val);
            root = tmp.right;
        }
        return res;
    }

    // 颜色标记法
    private void inorderTraversal3(ColorBinaryTree node, List<Integer> res) {
        Stack<ColorBinaryTree> stack = new Stack<>();
        stack.push(node);
        while (stack.size() != 0) {
            String color = stack.peek().color;
            BinaryTree currNode = stack.pop().node;
            if (currNode == null) {
                continue;
            }
            if (color.equals("WHITE")) {
                if (currNode.right != null) {
                    ColorBinaryTree right = new ColorBinaryTree("WHITE", currNode.right);
                    stack.push(right);
                }

                ColorBinaryTree curr = new ColorBinaryTree("GREY", currNode);
                stack.push(curr);
                if (currNode.left != null) {
                    ColorBinaryTree left = new ColorBinaryTree("WHITE", currNode.left);
                    stack.push(left);
                }
                // 后压入的元素先弹出 因此循环会将一次将每个节点下的右  根 左 节点依次压人 -- 弹出顺序为 左 根 右
                //          1
                //      2      3
                //    4   5
                //          6
                //  第一次压完元素后 ：
                //
                //        4  white
                //        2  grey
                //        5  white
                //        1  grey
                //        3  white
                //  将每个节点的左子树元素按 左 中 右 依次进行压栈  压到左子树的末尾叶子节点后  弹出当前的 左节点和根节点 在弹出右节点时 又对右节点开始进行遍历压栈
            } else {
                res.add(currNode.val);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(4);
        BinaryTree node5 = new BinaryTree(5);
        BinaryTree node6 = new BinaryTree(6);
        BinaryTree node7 = new BinaryTree(7);
        node1.left = node2;
        node2.right = node3;
        node3.left = node6;
        node1.right = node4;
        node4.left = node5;
        node5.left = node7;
        List<Integer> res = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        LeetCode_2_094 Test = new LeetCode_2_094();
//        Test.inorderTraversal1(node1, res);
        res = Test.inorderTraversal2(node1);
        System.out.println(res);
//
//        ColorBinaryTree colorNode1 = new ColorBinaryTree("WHITE", node1);
//        Test.inorderTraversal3(colorNode1, res2);
//        System.out.println(res2);
    }
}
