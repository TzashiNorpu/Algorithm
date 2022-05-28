package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

public class productExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        /*
        Numbers:     2    3    4     5
        Lefts:       1    2  2*3 2*3*4
        Rights:  3*4*5  4*5    5     1
        */
        int len = nums.length;
        int[] ans = new int[len];
        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = len - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}
