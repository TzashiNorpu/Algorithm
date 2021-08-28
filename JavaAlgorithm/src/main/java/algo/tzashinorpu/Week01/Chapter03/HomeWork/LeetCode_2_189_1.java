package algo.tzashinorpu.Week01.Chapter03.HomeWork;


import java.util.Arrays;

public class LeetCode_2_189_1 {
    public void rotate1(int[] nums, int k) {
        k = k%nums.length;
        int[] ints = Arrays.copyOf(nums, nums.length);
        // i:nums.length - k -> nums.length ---> 0 -> k
        for (int i = nums.length - k; i < nums.length; i++) {
            nums[ i+k-nums.length] = ints[i];
        }
        // i:0 -> nums.length - k ---> k-> nums.length
        for (int i = 0; i < nums.length-k; i++) {
            nums[k+i] = ints[i];
        }
    }

    public void rotate2(int[] nums, int k) {
        k = k%nums.length;
        // reverse array
        reverse(nums,0, nums.length-1);
        // revese 0->k
        reverse(nums,0,k-1);
        // reverse k->num.length
        reverse(nums,k, nums.length-1);
    }

    public void reverse(int[] nums,int startIndex,int endIndex) {
        // 1 2 3 4 5->5 4 3 2 1
        // temp = a[i]   a[i] = a[len-1-i] a[len-1-i] = temp
        // endIndex-startIndex+1  数组长度
        for (int i = 0; i < (endIndex-startIndex+1) / 2; i++) {
            int temp = nums[i+startIndex];
            nums[i+startIndex] = nums[endIndex-i];
            nums[endIndex-i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        LeetCode_2_189_1 solotion = new LeetCode_2_189_1();
//        solotion.reverse(nums, 0,1);
//        solotion.rotate2(nums, 2);
        solotion.rotate1(nums, 2);
//        solotion.reverse(nums, 0,1);
        for (int a : nums) {
            System.out.println(a);
        }
    }
}
