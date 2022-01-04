package algo.tzashinorpu.Daily.COM;

public class LeetCode_1009 {
    public int bitwiseComplement(int n) {
        // n=5->101->010->2
        // n=7->111-<000->0
        // input + output = 0011...1
        int x = 1;
        while (n > x) {
            x = (x << 1) + 1;
        }
        // x = 0..01..1
        return x - n;
    }
}
