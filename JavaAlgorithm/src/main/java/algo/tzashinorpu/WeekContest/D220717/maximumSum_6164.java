package algo.tzashinorpu.WeekContest.D220717;

import java.util.Arrays;
import java.util.HashMap;

public class maximumSum_6164 {
    public int maximumSum(int[] nums) {
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            int t = get(nums[i]);
            if (map.containsKey(t)) res = Math.max(nums[i] + map.get(t), res);
            else map.put(t, nums[i]);
        }

        return res;
    }

    int get(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num) % 10;
            num /= 10;
        }
        return sum;
    }
}
