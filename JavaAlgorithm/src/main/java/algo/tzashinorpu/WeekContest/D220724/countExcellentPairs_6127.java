package algo.tzashinorpu.WeekContest.D220724;

import java.util.*;

public class countExcellentPairs_6127 {
    public long countExcellentPairs(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }


        List<Integer> list = new ArrayList<>();
        for (Integer integer : set) {
            list.add(Integer.bitCount(integer));
        }

        list.sort(Comparator.naturalOrder());

        long ans = 0;
        for (Integer val : list) {
            int tmp = k - val;
            int l = 0;
            int r = list.size() - 1;
            int index = list.size();
            while (l <= r) {
                int mid = (l + r) / 2;
                if (list.get(mid) >= tmp) {
                    index = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            ans += list.size() - index;
        }
        return ans;
    }


}
