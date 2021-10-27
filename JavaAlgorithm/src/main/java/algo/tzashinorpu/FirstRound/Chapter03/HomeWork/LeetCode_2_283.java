package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;

public class LeetCode_2_283 {
    // https://leetcode-cn.com/problems/move-zeroes/
    // 输入: [0,1,0,3,12]    输出: [1,3,12,0,0]

    // 双指针: i记录数组当前可以存放非0元素的位置    j遍历数组
    private void moveZeroes1(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
//                nums[i] = nums[j];
//                i++;
                nums[i++] = nums[j];
            }
        }
        for (int k = i; k < nums.length; k++) {
            nums[k] = 0;
        }
    }

    // 把非0数给移动到数组前面 --> 每个非0数需要移动的步数其实就是这个非0数前面0的个数
    private void moveZeroes2(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }else {
                nums[i - count] = nums[i];
            }
        }
        for(int i = nums.length - count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 0, 0, 2, 0, 3, 4};
        LeetCode_2_283 test = new LeetCode_2_283();
//        algo.tzashinorpu.test.moveZeroes1(ints);
        test.moveZeroes2(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}
