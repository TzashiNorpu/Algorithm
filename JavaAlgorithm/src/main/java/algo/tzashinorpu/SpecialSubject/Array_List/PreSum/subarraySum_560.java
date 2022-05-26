package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import java.util.HashMap;

public class subarraySum_560 {
    public int subarraySum_1(int[] nums, int k) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        preSum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
        }
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // [1,2,3,-1] -> [1,3,6,5]  find 2 -> [[2],[3,-1]]
        for (int i = 0; i < len; i++) {
            if (preSum[i] == k) res++;
            if (map.containsKey(preSum[i] - k)) res += map.get(preSum[i] - k);
            map.put(preSum[i], map.getOrDefault(preSum[i], 0) + 1);
        }
        return res;
    }

    public int subarraySum_2(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0, ans = 0;
        for (int num : nums) {
            sum += num;
            if (sum == k) ans++;
            int find = sum - k;
            if (m.containsKey(find)) ans += m.get(find);
            m.put(sum, m.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
