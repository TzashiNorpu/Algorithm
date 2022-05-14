package algo.tzashinorpu.DpPlan.GSSY.DoublePoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        // -2,-1,0,0,1,2
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                for (int k = j + 1; k < length - 1; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;
                    int l = length - 1;
                    while (l > k + 1 && nums[i] + nums[j] + nums[k] + nums[l] > target) l--;
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) res.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                }
            }
        }
        return res;
    }
}
