package algo.tzashinorpu.FourthRound.Chapter03;

import java.util.HashMap;

public class twoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                res[0] = m.get(target - nums[i]);
                res[1] = i;
            } else {
                m.put(nums[i], i);
            }
        }
        return res;
    }
}
