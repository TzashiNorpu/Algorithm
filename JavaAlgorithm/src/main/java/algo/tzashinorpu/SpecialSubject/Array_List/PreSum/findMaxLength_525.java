package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import java.util.HashMap;

public class findMaxLength_525 {
    public int findMaxLength(int[] nums) {
        //   1,1,0,1,1,0,1,0
        int res = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 1 ? 1 : -1);
            if (!map.containsKey(sum)) {
                // 本段内0、1数量相等->和为0   则拿到上一个1的计数和当前位置计数相等的位置
                map.put(sum, i);
            } else {
                res = Math.max(res, i - map.get(sum));
            }
        }
        return res;
    }
}
