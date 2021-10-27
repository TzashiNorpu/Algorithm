package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;

import java.util.HashMap;

public class LeetCode_2_001_1 {
    /*public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }*/
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
            if (map.containsKey(target - nums[j])) {
                res[0] = map.get(target - nums[j]);
                res[1] = j;
                return res;
            }
            map.put(nums[j], j);
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_2_001_1 solution = new LeetCode_2_001_1();
        int[] nums = {3, 3};
        int target = 6;
        int[] ints = solution.twoSum(nums, target);
        for (int i :
                ints) {
            System.out.println(i);
        }
    }
}
