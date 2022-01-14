package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;

public class dominantIndex_747 {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        // 1,2,3,4
        // 1,0
        // 0,0,3,2
        // 5,4,3,2,1
        int maxIndex = nums[0] > nums[1] ? 0 : 1;
        int secondMaxIndex = nums[0] <= nums[1] ? 0 : 1;
        for (int i = 0; i < nums.length; i++) {
            int tmp = maxIndex;
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
                secondMaxIndex = tmp;
            }
            if (nums[i] < nums[maxIndex] && nums[i] > nums[secondMaxIndex]) {
                secondMaxIndex = i;
            }
        }
        if (nums[secondMaxIndex] == 0 || nums[maxIndex] / nums[secondMaxIndex] >= 2) {
            return maxIndex;
        } else {
            return -1;
        }
    }


}
