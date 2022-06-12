package algo.tzashinorpu.WeekContest.D0611;

public class countSubarrays_6098 {
    public long countSubarrays(int[] nums, long k) {
        int len = nums.length;
        long res = 0;
        int[] preSum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = l + (r - l);
            if (preSum[mid] < k) l = mid + 1;
            else r = mid - 1;
        }
        res += l;
        res += getRes(k, l, res, preSum);
        return res;
    }

    private long getRes(long k, int len, long res, int[] preSum) {
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len; j++) {
                if ((long) (preSum[j] - preSum[i]) * j < k) res++;
            }
        }
        return res;
    }
}
