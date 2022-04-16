package algo.tzashinorpu.ThirdRound.Chapter08;

public class majorityElement_169 {
    public int majorityElement(int[] nums) {
        /*Arrays.sort(nums);
        return nums[nums.length / 2];*/
        int cnt = 0;
        int v = 0;
        for (int num : nums) {
            if (num != v) {
                if (cnt == 0) {
                    cnt = 1;
                    v = num;
                } else {
                    cnt--;
                }
            } else {
                cnt++;
            }
        }
        return v;
    }
}
