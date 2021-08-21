package algo.tzashinorpu.Week01.Chapter03.HomeWork;

import java.util.HashMap;

public class LeetCode_2_001 {
    // https://leetcode-cn.com/problems/two-sum/
    // 两数之和
    // 题解:  *****  https://leetcode-cn.com/problems/3sum/solution/three-sum-ti-jie-by-wonderful611/
    // nums = [2, 7, 11, 15], target = 9  返回 [0, 1]
    private int[] twoSum(int[] nums, int target) {
        // hash 表中 将当前数组元素的值作为键，索引作为该键的值
        // 找目标元素即在该hash表中找是否存在“差值"部分的索引元素
        HashMap<Integer, Integer> tmp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tmp.containsKey(target - nums[i])) {
                return new int[]{tmp.get(target - nums[i]), i};
            } else {
                // 2:0  7:1
                tmp.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No Two Sum Solution");
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
