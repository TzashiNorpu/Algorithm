package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_070 {
    // bottom up
    public int climbStairs1(int n) {
        int[] ints = new int[n];
        if (n <= 3) {
            return n;
        }
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int i = 3; i < n; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n - 1];
    }

    // memorized recursive
    public int climbStairs2(int n) {
        if (n <= 3) {
            return n;
        }
        int[] mem = new int[n];
        mem[0] = 1;
        mem[1] = 2;
        mem[2] = 3;
        return recursive(n - 1, mem);
    }

    private int recursive(int n, int[] mem) {
        // 该位置已经被 memorized
        if (mem[n] != 0) {
            return mem[n];
        }
        mem[n] = recursive(n - 1, mem) + recursive(n - 2, mem);
        return mem[n];
    }

}
