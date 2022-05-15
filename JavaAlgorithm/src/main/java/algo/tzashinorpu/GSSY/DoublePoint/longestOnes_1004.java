package algo.tzashinorpu.GSSY.DoublePoint;

public class longestOnes_1004 {
    public int longestOnes(int[] nums, int k) {
        /*动态维护一个左右区间 [j, i] 和维护窗口内和 tot。
        右端点一直右移，左端点在窗口不满足「len - tol <= k」的时候进行右移*/
        int res = 0;
        for (int i = 0, j = 0, tot = 0; j < nums.length; j++) {
//            if (nums[j] == 1) tot++;
            tot += nums[j];
            while (j - i + 1 - tot > k) {
                /*i++;
                if (nums[i] == 1) tot--;*/
                tot -= nums[i++];
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
