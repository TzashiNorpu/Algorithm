package algo.tzashinorpu.GSSY.DoublePoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_15 {
    public List<List<Integer>> threeSum1(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = length - 1;
            while (l < r) {
                while (l > i + 1 && l < r && nums[l] == nums[l - 1]) l++;
                if (l == r) break;
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                } else if (sum > 0) r--;
                else l++;
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int l = i + 1, r = length - 1; l < r; l++) {
                if (l > i + 1 && nums[l] == nums[l - 1]) continue;
                while (l < r - 1 && nums[i] + nums[l] + nums[r] > 0) r--;
                if (nums[i] + nums[l] + nums[r] == 0) res.add(List.of(nums[i], nums[l], nums[r]));
            }
        }
        return res;
    }
}
