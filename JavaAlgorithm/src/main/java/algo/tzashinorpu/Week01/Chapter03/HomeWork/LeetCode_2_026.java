package algo.tzashinorpu.Week01.Chapter03.HomeWork;

public class LeetCode_2_026 {
    // https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
    // 删除排序数组中的重复项
    // [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    // O(1) 空间
    private int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // count 记录下一个非重复元素的更新位置
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] ints = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        LeetCode_2_026 test = new LeetCode_2_026();
        int len = test.removeDuplicates(ints);
        System.out.println(len);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
