package algo.tzashinorpu.GSSY.DoublePoint;

public class subarraysWithKDistinct_992 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // 「 upper[i] - lower[i] 代表了考虑 nums[i] 为右边界，不同字符数量「恰好」为 k 的子数组数量 」
        int res = 0;
        int len = nums.length;
        int[] lower = new int[len];
        int[] upper = new int[len];
        find(nums, lower, k);
        find(nums, upper, k - 1);
        for (int i = 0; i < len; i++) res += (upper[i] - lower[i]);
        return res;
    }

    private void find(int[] nums, int[] arr, int k) {
        // 截止到i位置数字种类为k的最左边界位置
        int[] cnt = new int[nums.length + 1];
        for (int i = 0, j = 0, tot = 0; i < nums.length; i++) {
            int r = nums[i];
            if (cnt[r] == 0) tot++;
            cnt[r]++;
            while (tot > k) {
                int l = nums[j++];
                cnt[l]--;
                if (cnt[l] == 0) tot--;
            }
            arr[i] = j;
        }
    }
}
