package algo.tzashinorpu.SecondRound.Chapter05;

import java.util.HashMap;

public class twoSum_001 {
    public int[] twoSum(int[] nums, int target) {
       /* 输入：nums = [2,7,11,15], target = 9
        输出：[0,1]*/
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
