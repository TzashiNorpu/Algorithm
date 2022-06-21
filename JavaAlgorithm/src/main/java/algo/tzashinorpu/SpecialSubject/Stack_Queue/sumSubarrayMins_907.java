package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class sumSubarrayMins_907 {
    // 连续子数组的最小值的和
    public int sumSubarrayMins_brute(int[] arr) {
        int n = arr.length;
        int MOD = 1000000007;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                res = (res + min) % MOD;
            }
        }
        return res;
    }

    public int sumSubarrayMins_dp(int[] arr) {
        //[ 3, 1,2,4,1]
        //[-1,-1,1,2,1]
        //[ 1, 5,4,4,5]
        int n = arr.length;
        int MOD = 1000000007;
        int[] l = new int[n];
        int[] r = new int[n];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            // 向左找第一个小于等于E的元素 -> 递增
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            // 设立一个最左边界-1
            if (stack.isEmpty()) {
                l[i] = -1;
            } else {
                l[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            // 向右找第一个小于E的元素 -> 递增
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            // 设立一个最右边界n
            if (stack.isEmpty()) {
                r[i] = n;
            } else {
                r[i] = stack.peek();
            }
            stack.push(i);
        }
        // 注意此处left[i]和right[i]实际上记录的是左边界-1和右边界+1，和上面思路中有些区别，便于计算
        long ans = 0;
        for (int i = 0; i < n; i++) {
            // 子数组个数为(i - left) * (right - i)
            ans = (ans + (long) (i - l[i]) * (r[i] - i) * arr[i]) % MOD;
        }
        return (int) ans;
    }

    public int sumSubarrayMins_stack(int[] arr) {
        int n = arr.length;
        int MOD = 1000000007;
        long ans = 0;
//        Deque<Integer> stack = new LinkedList<>();
        int[] stack = new int[n + 2];
        int pos = 0;
        //[ 3, 1,2,4,1]
        //[-1,-1,1,2,1]
        //[ 1, 5,4,4,5]
        // 将下标-1和n作为两个哨兵元素，它们对应的元素为MIN_VALUE
        // -1作为最左边界，n作为最右边界
        for (int i = -1; i <= n; i++) {
            // 单调递增
//            while (!stack.isEmpty() && getElement(arr, n, stack.peek()) > getElement(arr, n, i)) {
            while (pos != 0 && getElement(arr, n, stack[pos - 1]) > getElement(arr, n, i)) {
                // A[cur]就是之前思路中的A[i]，注意区分和上面代码的区别
                // 对于每个出栈元素来说，i就是它们的右边界，而栈顶元素就是左边界
                int cur = stack[--pos];
                // 计算贡献值
                ans = (ans + (long) (cur - stack[pos - 1]) * (i - cur) * arr[cur]) % MOD;
            }
            stack[pos++] = i;
        }
        return (int) ans;
    }

    // 重写根据下标取值方法，-1和n返回MIN_VALUE
    private int getElement(int[] arr, int n, int i) {
        if (i == -1 || i == n) {
            return Integer.MIN_VALUE;
        }
        return arr[i];
    }

}
