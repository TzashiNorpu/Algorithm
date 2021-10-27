package algo.tzashinorpu.FirstRound.Chapter03.Array;

public class LeetCode_1_283_1 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
                if (i != index - 1) {
                    nums[i] = 0;
                }
            }
        }
        /*for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }*/
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        LeetCode_1_283_1 solution = new LeetCode_1_283_1();
        solution.moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
