package algo.tzashinorpu.Daily.CN;

public class LeetCode_507 {
    public boolean checkPerfectNumber1(int num) {
        int l = 1, r = num;
        int sum = 0;
        while (l < r) {
            if (num % l == 0) {
                r = num / l;
                sum += l + r;
            }
            l++;
        }
        return sum - num == num;
    }

    public boolean checkPerfectNumber2(int num) {
        if (num == 1) {
            return false;
        }
        // 一个在平方根的左侧   一个在平方根的右侧
        int sum = 1;
        // 36 到 6*6的时候只加一次
        for (int l = 2; l <= num / l; l++) {
            if (num % l == 0) {
                int r = num / l;
                sum += l + (r != l ? r : 0);
            }
        }
        return sum == num;
    }
}
