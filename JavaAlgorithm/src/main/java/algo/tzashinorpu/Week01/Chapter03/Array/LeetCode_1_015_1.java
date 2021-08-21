package algo.tzashinorpu.Week01.Chapter03.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_1_015_1 {
    /*public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if (nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去重
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) L++; // 去重
                    while (L < R && nums[R] == nums[R - 1]) R--; // 去重
                    L++;
                    R--;
                } else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
*/
    public List<List<Integer>> threeSum(int[] nums) {
        List ans = new ArrayList<>();
        if (nums == null || nums.length < 3) return ans;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    ans.add(new int[]{nums[i], nums[l++], nums[r--]});
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (nums[l] + nums[r] > target) r--;
                else l++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        LeetCode_1_015_1 solution = new LeetCode_1_015_1();
        int[] nums = {0, 0, 0, 0};
        // [[-1,-1,2],[-1,0,1]]
        List<List<Integer>> lists = solution.threeSum(nums);
        System.out.println(lists.toString());
    }
}
