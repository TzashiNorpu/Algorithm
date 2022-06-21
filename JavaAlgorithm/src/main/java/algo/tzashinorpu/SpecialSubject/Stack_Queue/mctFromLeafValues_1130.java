package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.*;

public class mctFromLeafValues_1130 {
    private int[][] dp;

    public int mctFromLeafValues_dp(int[] arr) {
        dp = new int[arr.length + 1][arr.length + 1];
        for (int[] r : dp) Arrays.fill(r, -1);
        return helper(arr, 0, arr.length - 1);
    }

    public int helper(int[] arr, int l, int r) {
        if (dp[l][r] != -1)
            return dp[l][r];

        if (l >= r)
            return 0;

        int res = Integer.MAX_VALUE;
        // 遍历所有的可能的树，得到所有的可能的树的非叶子节点的和，取其中最小的和
        for (int i = l; i < r; i++) {
            int rootVal = max(arr, l, i) * max(arr, i + 1, r);
            int nonLeafNodeFromLeftSubtree = helper(arr, l, i);
            int nonLeafNodeFromRightSubtree = helper(arr, i + 1, r);
            res = Math.min(res, rootVal + nonLeafNodeFromLeftSubtree + nonLeafNodeFromRightSubtree);
        }

        dp[l][r] = res;
        return res;
    }

    public int mctFromLeafValues_greedy(int[] arr) {
        // 大节点应当尽量靠经树的根节点，大节点越靠上影响的节点数就越少 -> 小节点应该经尽量靠下
        // 先找到最小的值去组装非叶子节点，然后这个值后续就不需要了，因为后续的非叶子节点都是需要左右子树的最大值
        List<Integer> A = new ArrayList<>();
        for (int d : arr) A.add(d);

        int res = 0;
        while (A.size() != 1) {
            int minIndex = A.indexOf(Collections.min(A));

            if (minIndex > 0 && minIndex < A.size() - 1)
                // 最小值两边选更小的
                res += A.get(minIndex) * Math.min(A.get(minIndex - 1), A.get(minIndex + 1));

            else if (minIndex == 0)
                res += A.get(minIndex) * A.get(minIndex + 1);

            else
                res += A.get(minIndex) * A.get(minIndex - 1);

            A.remove(minIndex);
        }
        return res;
    }

    public int max(int[] arr, int l, int r) {
        int max = 0;
        for (int i = l; i <= r; i++)
            max = Math.max(max, arr[i]);
        return max;
    }

    // 贪心转单调栈
    /*
    问题本质：
    10, 9, [3, 4], 5
    10, 9, `12`, [4,5]
    10, [9, 5], `12`, `20`,
    [10, 9], `45`, `12`, `20`,
    `90`,`45`, `12`, `20`
    = 90 + 45 + 12 + 20
    = 167
     */
    public int mctFromLeafValues_stack(int[] A) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        for (int num : A) {
            while (stack.peek() <= num) {
                int mid = stack.pop();
                res += mid * Math.min(stack.peek(), num);
            }
            stack.push(num);
        }
        while (stack.size() > 2)
            res += stack.pop() * stack.peek();

        return res;
    }
}
