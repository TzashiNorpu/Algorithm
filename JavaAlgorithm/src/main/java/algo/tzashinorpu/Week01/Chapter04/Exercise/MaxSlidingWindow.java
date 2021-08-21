package algo.tzashinorpu.Week01.Chapter04.Exercise;

import java.util.LinkedList;

public class MaxSlidingWindow {
    int k = 100;

    public int[] maxSlidingWindow_1(int[] nums, int k) {
        // 暴力1
        // n - k + 1 个窗口
        int n = nums.length;

        int[] res = new int[n - k + 1];

        for (int i = 0; i < n - k + 1; i++) {
            int max = nums[i];
            for (int j = i; j < k + i; j++) {
                max = Math.max(max, nums[j]);
            }
            res[i] = max;
        }
        return res;
    }

    public void test() {
        int k = 10;
        System.out.println(this.k);
    }

    public int[] maxSlidingWindow_2(int[] nums, int k) {
        // 双端队列
        LinkedList<Integer> ints = new LinkedList<>();
//        ints.
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, -1};
        int k = 1;
        MaxSlidingWindow test = new MaxSlidingWindow();
        int[] res = test.maxSlidingWindow_1(nums, k);
        for (int i :
                res) {
            System.out.println(i);
        }
        test.test();
    }
}
