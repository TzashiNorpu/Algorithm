package algo.tzashinorpu.ThirdRound.Chapter12;

public class maxProduct_152 {
    public int maxProduct(int[] nums) {
        // 2,3,-2,0,4
        int len = nums.length;
        int[] pos = new int[len];
        int[] neg = new int[len];
        pos[0] = nums[0];
        neg[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int c = nums[i];
            int a = pos[i - 1] * c;
            int b = neg[i - 1] * c;
            pos[i] = Math.max(Math.max(a, b), c);
            max = Math.max(max, pos[i]);
            neg[i] = Math.min(Math.min(a, b), c);
        }
        return max;
    }
}
