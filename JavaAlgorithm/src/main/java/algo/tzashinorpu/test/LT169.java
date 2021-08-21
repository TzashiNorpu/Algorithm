package algo.tzashinorpu.test;

import java.util.HashMap;

public class LT169 {
    static int[] a = {
            3,
    };

    public static void main(String[] args) {
        System.out.println(find2(a));
    }


    static int find(int[] nums) {
        int res = nums[0];
        int maxCnt = 1;
        HashMap h = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i])) {
                int cnt = (Integer) h.get(nums[i]) + 1;
                h.replace(nums[i], cnt);
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                    res = nums[i];
                }
            } else {
                h.put(nums[i], 1);
            }
        }

        return maxCnt > nums.length / 2 ? res : 0;
    }

    static int find2(int[] nums) {
        Integer candidate = null;
        int cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                candidate = num;
            }
            cnt = (num == candidate) ? ++cnt : --cnt;
        }
        return candidate;
    }
}
