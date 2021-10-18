package algo.tzashinorpu.Week03.Chapter09;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_3_169 {
    public int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int targetNum = nums.length / 2;
        int res = 0;
        for (int num :
                nums) {
            Integer cnt = map.get(num);
            if (cnt == null) {
                map.put(num, 1);
            } else {
                map.put(num, cnt + 1);
            }
            //map.merge(num, 1, Integer::sum);
            cnt = map.get(num);
            if (cnt > targetNum) {
                res = num;
                return res;
            }
        }
        return res;
    }

    public int majorityElement2(int[] nums) {
        int cnt = 1;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == res) {
                cnt++;
            } else {
                cnt--;
                if (cnt == 0) {
                    res = nums[i];
                    cnt++;
                }
            }
        }
        return res;
    }

    public int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
