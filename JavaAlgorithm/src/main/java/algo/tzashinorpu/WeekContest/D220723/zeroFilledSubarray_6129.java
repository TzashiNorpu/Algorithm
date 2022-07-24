package algo.tzashinorpu.WeekContest.D220723;

import java.util.Stack;

public class zeroFilledSubarray_6129 {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        int[] dup = new int[n + 1];
        System.arraycopy(nums, 0, dup, 0, n);
        dup[n] = -1;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < n) {
            int count = 0;
            while (i < n - 1 && dup[i] == 0 && dup[i] == dup[i + 1]) {
                i++;
                count++;
            }
            if (count != 0) stack.push(count + 1);
            else if (nums[i] == 0 && dup[i] != dup[i + 1]) stack.push(1);
            i++;
        }
        int res = 0;
        while (!stack.empty()) {
            res += getCount(stack.pop());
        }
        return res;
    }

    int getCount(int n) {
        int res = 0;
        while (n > 0) {
            res += (n--);
        }
        return res;
    }
}
