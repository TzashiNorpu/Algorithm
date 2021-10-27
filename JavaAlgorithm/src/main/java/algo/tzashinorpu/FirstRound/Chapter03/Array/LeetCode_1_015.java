package algo.tzashinorpu.FirstRound.Chapter03.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_1_015 {
    // https://leetcode-cn.com/problems/3sum/
    // 三数之和: 找出所有 a + b + c = 0 且不重复的三元组
    // 题解: *****  https://leetcode-cn.com/problems/3sum/solution/three-sum-ti-jie-by-wonderful611/
    private List<List<Integer>> threeSum(int[] nums) {
        int k = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < k - 2; i++) {
            if (nums[i] > 0) break;
            // 拿出第一个数  如果已经拿过该数则进行跳过
            if (i >= 1 && nums[i] == nums[i - 1]) continue;
            for (int left = i + 1, right = k - 1; left < right; ) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 左指针的值若已经参与过运算  则跳过
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // 右指针的值若已经参与过运算  则跳过
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // 出现参与过运算的值  跳跃两次 否则跳跃一次
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 0, 2, 2, 2};
        LeetCode_1_015 test = new LeetCode_1_015();
        System.out.println(test.threeSum(nums));
    }
}
