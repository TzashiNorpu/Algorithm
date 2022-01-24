package algo.tzashinorpu.WeekContest.D0123;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findLonely_5990 {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (count.get(nums[i]) > 1 ||
                    count.getOrDefault(nums[i] + 1, 0) > 0
                    || count.getOrDefault(nums[i] - 1, 0) > 0) {
                continue;
            }
            res.add(nums[i]);
        }
        return res;
    }
}
