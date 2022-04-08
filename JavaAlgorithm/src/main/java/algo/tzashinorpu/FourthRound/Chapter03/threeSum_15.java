package algo.tzashinorpu.FourthRound.Chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        // -1,0,1,2,-1,-4 -> -4,-1,-1,0,1,2
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
                if (sum > 0) r--;
                if (sum < 0) l++;
            }
        }
        return res;
    }
}
