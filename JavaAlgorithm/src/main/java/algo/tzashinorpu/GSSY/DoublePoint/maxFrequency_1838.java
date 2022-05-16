package algo.tzashinorpu.GSSY.DoublePoint;

import java.util.Arrays;

public class maxFrequency_1838 {
    int[] _nums, sum;
    int _k, n;

    public int maxFrequency(int[] nums, int k) {
        _nums = nums;
        _k = k;
        n = nums.length;
        Arrays.sort(nums);
        sum = new int[n + 1];
        // i之前数的和
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int l = 0, r = n;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (check(mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

    private boolean check(int len) {
        for (int i = 0; i < n - len + 1; i++) {
            int r = i + len - 1;
            int cur = sum[r + 1] - sum[i];
            int t = len * _nums[r];
            if (t - cur <= _k) return true;
        }
        return false;
    }
    /*Arrays.sort(nums);
    int l=0, r=0, win=0;
    int count, max;
        while(r < nums.length){
        max = nums[r];
        count = r-l+1;
        win += nums[r];
        r++;
        if(max*count-win > k){
            win -= nums[l];
            l++;
        }
    }
        return r-l;*/
}
