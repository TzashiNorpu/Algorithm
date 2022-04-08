package algo.tzashinorpu.ThirdRound.Chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_15 {
    /*输入：nums = [-1,0,1,2,-1,-4,2] -> -4,-1,-1,0,1,2,2
    输出：[[-1,-1,2],[-1,0,1]]*/
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
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
