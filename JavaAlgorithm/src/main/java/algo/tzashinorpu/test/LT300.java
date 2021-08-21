package algo.tzashinorpu.test;

public class LT300 {
    public static void main(String[] args) {
        int[] nums = {3,5,6,2,5,4,19,5,6,7,12};
        int res = lengthOfLIS(nums);
//        System.out.println(res);

    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] ls = new int[nums.length];
        ls[0]=1;
        int res=1;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, ls[j]);
                }
                ls[i]   = max + 1;
            }
            res = Math.max(res, ls[i]);
        }
//        for (int l :
//                ls) {
//            System.out.println(l);
//        }

        return res;
    }
}
