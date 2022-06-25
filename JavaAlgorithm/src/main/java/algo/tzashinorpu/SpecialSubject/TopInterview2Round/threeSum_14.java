package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_14 {
    public List<List<Integer>> threeSum(int[] nums) {
        /*List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) {
                return res;
            }
//            while (i > 0 && nums[i] == nums[i - 1]) i++; // while  i++ 会越界
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    // 移动两个指针
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[l++], nums[r--])));
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (sum > 0) {
                    r--;
                } else l++;
            }
        }
        return res;*/
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1, k = n - 1; j < k; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                // [-2,-1,1,2]
                while (k - 1 > j && nums[i] + nums[j] + nums[k] > 0) k--;
                if (nums[i] + nums[j] + nums[k] == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }
        return ans;
    }
}
