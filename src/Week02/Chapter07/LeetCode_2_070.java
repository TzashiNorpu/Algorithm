package Week02.Chapter07;

public class LeetCode_2_070 {
    // 爬楼梯  f(n) = f(n-1) + f(n-2)
    //
    public int climbStairs1(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    public int climbStairs2(int n) {
        int[] cnts = new int[n];

        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        cnts[0] = 1;
        cnts[1] = 2;
        for (int i = 2; i < n; i++) {
            cnts[i] = cnts[i - 1] + cnts[i - 2];
        }
        return cnts[n - 1];
    }

    public static void main(String[] args) {
        LeetCode_2_070 test = new LeetCode_2_070();
//        int cnts = test.climbStairs1(3);
        int cnts = test.climbStairs2(4);
        System.out.println(cnts);
    }
}
