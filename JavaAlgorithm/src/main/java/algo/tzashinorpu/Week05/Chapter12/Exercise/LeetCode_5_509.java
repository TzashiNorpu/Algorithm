package algo.tzashinorpu.Week05.Chapter12.Exercise;

public class LeetCode_5_509 {
    // https://leetcode-cn.com/problems/fibonacci-number/
    int fib1(int n, int[] m) {
        if (n <= 1) {
            return n;
        }
        // m[n] == 0 计算的条件
        // 不需要计算时使用缓存
        // 记忆化搜索
        if (m[n] == 0) {
            m[n] = fib1(n - 1, m) + fib1(n - 2, m);
        }
        return m[n];
    }

    // Bottom Up
    int fib2(int n) {
        if(n<=1){
            return n;
        }
        int[] mem = new int[n+1];
        mem[0]=0;
        mem[1]=1;

        for (int i = 2; i <= n; i++) {
            mem[i] = mem[i - 1] + mem[i - 2];
        }
        return mem[n];
    }

    public static void main(String[] args) {
        LeetCode_5_509 test = new LeetCode_5_509();
        int n = 4;
        int[] arr = new int[n];
        System.out.println(test.fib1(n - 1, arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t\n", arr[i]);
        }

        System.out.println(test.fib2(5));
    }
}
