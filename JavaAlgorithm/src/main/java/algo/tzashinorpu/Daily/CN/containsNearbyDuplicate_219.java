package algo.tzashinorpu.Daily.CN;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class containsNearbyDuplicate_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        /*HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (i > k) {
                count.put(nums[i - k - 1], count.getOrDefault(nums[i - k - 1], 0) - 1);
            }
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) > 1) {
                return true;
            }
        }
        return false;*/
        //也可以用 hashset
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;

    }
}
