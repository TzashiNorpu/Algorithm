package algo.tzashinorpu.test;

public class LT136 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int[] nums1 = {4, 1, 2, 1, 2};
        int res = singleNumber(nums);
        System.out.println(res);
    }

    private static int singleNumber(int[] nums) {
        int k = 0;
        for (int num :
                nums) {
            k ^= num;
        }
        return k;
    }
}
