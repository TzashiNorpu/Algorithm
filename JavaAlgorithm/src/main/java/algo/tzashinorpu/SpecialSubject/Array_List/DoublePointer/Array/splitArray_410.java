package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class splitArray_410 {
    public int splitArray_1(int[] nums, int m) {
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

    public int splitArray_2(int[] nums, int m) {
        int max = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        int l = max, r = sum;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int count = getCount(mid, nums);
            //
            if (count > m) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private int getCount(int mid, int[] nums) {
        /*int cur=0,sub=1;
        for(int num:nums){
            if(cur+num>mid){
                sub++;
                cur=0;
            }
            cur +=num;
        }
        return sub;*/
        int cur = 0, sub = 0;
        for (int num : nums) {
            if (cur + num > mid) {
                sub++;
                cur = num;
            } else {
                cur += num;
            }
        }
        if (cur != 0) sub++;
        return sub;
    }

}
