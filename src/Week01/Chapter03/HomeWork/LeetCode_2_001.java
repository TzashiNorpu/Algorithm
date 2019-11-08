package Week01.Chapter03.HomeWork;

import java.util.HashMap;

public class LeetCode_2_001 {
    // https://leetcode-cn.com/problems/two-sum/
    // 两数之和
    // nums = [2, 7, 11, 15], target = 9  返回 [0, 1]
    private int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.containsKey(target - nums[i])) {
                return new int[]{s.get(target - nums[i]),i};
            }else{
                // 2:0  7:1
                s.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        LeetCode_2_001 test = new LeetCode_2_001();
        int[] ints = test.twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
