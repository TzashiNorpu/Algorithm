package algo.tzashinorpu.WeekContest.D0109;

public class minSwaps_5977 {
    public int minSwaps(int[] nums) {
        // slide window
        /*
        整体思路:
        统计nums数组中1的个数记为 window 。
        使用一个长度为 window 的滑动窗口，在【首尾相连】的环形数组中滑动
        将所有的1通过交换，放置到该滑动窗口中所需的交换次数为：window - 窗口中0的个数
        在实现时，需要考虑如何在不复制原数组的情况下进行窗口的滑动
        */
        int n = nums.length;
        int ans = n;
        int window = 0;
        int turn = 0;
        for (int num : nums) {
            window += (num == 1 ? 1 : 0);
        }
        // 1. 统计第一个窗口中0的数量
        for (int i = 0; i < window; i++) {
            turn += (nums[i] == 0 ? 1 : 0);
        }
        // len:窗口的右界
        int len = Math.min(2 * n, n + window - 1);
        for (int i = window; i <= len; i++) {
            ans = Math.min(ans, turn);
            // 右移窗口
            // 从左边被移除的数字是 0 则 turn-1
            turn -= (nums[i - window] == 0 ? 1 : 0);
            // 从右边移入的数字是 0 则 turn+1
            turn += (nums[i % n] == 0 ? 1 : 0);
        }
        return ans;
    }
}
