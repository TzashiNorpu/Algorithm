package algo.tzashinorpu.Daily.CN;

import java.util.HashMap;

public class countKDifference_2006 {
    // 1,2,2,1  1
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            cnt += (map.getOrDefault(nums[i] + k, 0) + map.getOrDefault(nums[i] - k, 0));
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return cnt;
    }
}
