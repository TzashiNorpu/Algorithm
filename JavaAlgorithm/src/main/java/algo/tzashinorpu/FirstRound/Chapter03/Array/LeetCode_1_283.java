package algo.tzashinorpu.FirstRound.Chapter03.Array;

public class LeetCode_1_283 {
    // https://leetcode-cn.com/problems/move-zeroes/solution/
    // 双指针
    private void moveZeroes(int[] nums) {
        int i = 0;
        // 非0元素往前移  i保存非0元素的个数
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
        // 将非0元素个数之后的元素均赋为0
        for (int k = i; k < nums.length; k++) {
            nums[k] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        LeetCode_1_283 test = new LeetCode_1_283();
        test.moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
