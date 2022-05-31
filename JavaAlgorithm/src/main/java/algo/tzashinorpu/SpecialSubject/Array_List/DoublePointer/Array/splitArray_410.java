package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class splitArray_410 {
    public int splitArray(int[] nums, int m) {
        int l = 0, r = 0;
        for (int num : nums) {
            l = Math.max(num, l);
            r += num;
        }
        while (l <= r) {
            int mid = l + (r - l) / 2, curr = 0, need = 1;
            for (int num : nums) {
                if (curr + num > mid) {
                    need += 1;
                    curr = 0;
                }
                curr += num;
            }

            if (need > m) l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }
}
