package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Arrays;

public class minimumMountainRemovals_1671 {
    // exceed
    public int minimumMountainRemovals_1(int[] nums) {
        int res = 1002;
        for (int i = 1; i < nums.length; i++) {
            int[] l = getSubNums(0, i, nums);
            int lLis = getLIS(l);
            int lStep = i + 1 - lLis;
            // 左边没有元素了
            if (i == lStep) continue;
            int[] r = getSubNumsReverse(i, nums.length - 1, nums);
            int rLis = getLIS(r);
            int rStep = nums.length - i - rLis;
            // 右边没有元素了
            if (nums.length - i - 1 == rStep) continue;
            res = Math.min(lStep + rStep, res);
        }
        return res;
    }

    private int getLIS(int[] nums) {
        int size = 0;
        int[] tails = new int[nums.length];
        Arrays.fill(tails, Integer.MAX_VALUE);
        for (int num : nums) {
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                // l 的左边都是 < num 的数据  则 l 即是当前元素的插入位置
                if (tails[mid] < num) l = mid + 1;
                else r = mid - 1;
            }
            tails[l] = num;
            if (l == size) size++;
        }
        return size;
    }

    private int[] getSubNumsReverse(int startIndex, int endIndex, int[] nums) {
        int[] res = new int[endIndex - startIndex + 1];
        for (int i = startIndex; i <= endIndex; i++) {
            res[endIndex - i] = nums[i];
        }
        return res;
    }

    private int[] getSubNums(int startIndex, int endIndex, int[] nums) {
        int[] res = new int[endIndex - startIndex + 1];
        System.arraycopy(nums, startIndex, res, startIndex, endIndex - startIndex + 1);
        return res;
    }


    public int minimumMountainRemovals_2(int[] nums) {
        // [1,3,2,4]
        int n = nums.length;
        int[] lis = new int[n];
        // [0,i] 的 LIS
        Arrays.fill(lis, 1);
        int[] mountain = new int[n];
        Arrays.fill(mountain, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) lis[i] = Math.max(lis[i], 1 + lis[j]);
                if (nums[j] > nums[i]) {
                    // lis[j] > 1:j左边至少一个元素,此时形成一个mountain
                    if (lis[j] > 1) mountain[i] = Math.max(mountain[i], 1 + lis[j]);
                    // [1, 5, 4, 3, 2]:检查此时的位置能不能和
                    if (mountain[j] > 1) mountain[i] = Math.max(mountain[i], 1 + mountain[j]);
                }
            }
        }
        return n - Arrays.stream(mountain).max().getAsInt();
    }
}
