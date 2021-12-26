package algo.tzashinorpu.WeekCompete.D1226;

import java.util.Arrays;
import java.util.LinkedList;

public class E5966 {
    //
    public int[] recoverArray(int[] nums) {
        int length = nums.length;
        int[] res = new int[length / 2];
        int[] label = new int[length];
        Arrays.sort(nums);
        int min_low = nums[0];
        for (int i = 1; i < length; i++) {
            // 穷尽所以可能的最小 high
            int min_high = nums[i];
            int doubleK = min_high - min_low;

            /*if (doubleK % 2 == 1 || doubleK == 0) {
                continue;
            }*/
            if (doubleK % 2 == 0 && doubleK != 0) {
                LinkedList<Integer> queue = new LinkedList<>();
                int cnt = 0;
                for (int j = 0; j < length; j++) {
                    if (!queue.isEmpty() && queue.peek() == nums[j]) {
                        queue.poll();
                    } else {
                        // 这个要放在前面，不然错误的路径会导致 queue 里不为 0 同时 res 溢出
                        if (cnt >= length / 2) {
                            break;
                        }
                        queue.offer(nums[j] + doubleK);
                        res[cnt++] = nums[j] + doubleK / 2;

                    }
                    if (queue.isEmpty()) {
                        return res;
                    }
                }
            }
        }
        return new int[0];
    }
}