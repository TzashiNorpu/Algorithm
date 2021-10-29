package algo.tzashinorpu.SecondRound.Chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_015 {
    public List<List<Integer>> threeSum(int[] nums) {
       /* 输入：nums = [-1,0,1,2,-1,-4]
       -4 -1 -1 0 1 2
        输出：[[-1,-1,2],[-1,0,1]]*/
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                return res;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
//                    System.out.println(i + "--" + l + "--" + r);
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[l++], nums[r--])));
                    while (l < r && nums[l - 1] == nums[l]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}
