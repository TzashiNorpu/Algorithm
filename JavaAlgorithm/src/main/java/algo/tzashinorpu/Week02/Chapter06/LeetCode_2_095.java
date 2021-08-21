package algo.tzashinorpu.Week02.Chapter06;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_095 {
    // DP
    public List<BinaryTree> generateTrees1(int n) {
        int a=10;
        List<BinaryTree>[] result = new List[n + 1];
        result[0] = new ArrayList<>(); // 如果left或right为0，就会出现空指针异常。
        if (n == 0) {
            return result[0];
        }
        result[0].add(null);// 如果不加null，那么后面当left或right为0时，就不会执行for循环。而一旦left不执行，right也会被跳过
        // len是根节点
        for (int len = 1; len <= n; len++) {
            result[len] = new ArrayList<>();
            for (int root = 1; root <= len; root++) {
                int left = root - 1;
                int right = len - root;
                for (BinaryTree nodeL : result[left]) {
                    for (BinaryTree nodeR : result[right]) {
                        BinaryTree node = new BinaryTree(root);
                        node.left = nodeL;
                        node.right = clone(nodeR, root);
                        result[len].add(node);
                    }
                }
            }
        }
        return result[n];
    }

    // 生成一棵结构一样,但是所有节点值都比原树的节点改变了 offset 的树
    private BinaryTree clone(BinaryTree n, int offset) {
        if (n == null) {
            return null;
        }
        BinaryTree node = new BinaryTree(n.val + offset);
        node.left = clone(n.left, offset);
        node.right = clone(n.right, offset);
        return node;
    }

    // 递归
    public List<BinaryTree> generateTrees2(int n) {
        return helper(1, n);
    }

    // 概要：n为2时--选1为root, helper(min, rt - 1)返回空,1的leftList为空,helper(rt + 1, max)的递归调用在2节点上(drill down)进入
    // leftList.size() == 0 && rightList.size() == 0分支
    // 返回一个值为2的节点在rightList中，递归退出后在当前层进入leftList.size() == 0分支,拿到2节点并将其作为1节点的右子树
    private List<BinaryTree> helper(int min, int max) {
        List<BinaryTree> res = new ArrayList<>();
        if (min > max) {
            return res;
        }
        for (int rt = min; rt <= max; rt++) {
            // 确保是BST
            List<BinaryTree> leftList = helper(min, rt - 1);
            List<BinaryTree> rightList = helper(rt + 1, max);
            // 处理最底层只有一个元素时的情况
            if (leftList.size() == 0 && rightList.size() == 0) {
                BinaryTree root = new BinaryTree(rt);
                res.add(root);
            } else if (leftList.size() == 0) {
                for (BinaryTree rTree : rightList) {
                    BinaryTree root = new BinaryTree(rt);
                    root.right = rTree;
                    res.add(root);
                }
            } else if (rightList.size() == 0) {
                for (BinaryTree lTree : leftList) {
                    final BinaryTree root = new BinaryTree(rt);
                    root.left = lTree;
                    res.add(root);
                }
            } else {
                for (BinaryTree lTree : leftList) {
                    for (BinaryTree rTree : rightList) {
                        final BinaryTree root = new BinaryTree(rt);
                        root.left = lTree;
                        root.right = rTree;
                        res.add(root);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_2_095 test = new LeetCode_2_095();
        int a=10;
        List<BinaryTree> res = test.generateTrees1(3);
        System.out.println(res);
        res = test.generateTrees2(2);
        System.out.println(res);



    }
}
