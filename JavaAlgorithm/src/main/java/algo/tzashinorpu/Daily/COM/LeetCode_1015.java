package algo.tzashinorpu.Daily.COM;

public class LeetCode_1015 {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int n = 1;
        int len = 1;
        // k = 3
        // n % 3 = 10^x+10^(x-1)+...+10^0
        while (n % k != 0) {
            n = n % k;
            n = n * 10 + 1;
            len++;
        }
        return len;
    }
}
