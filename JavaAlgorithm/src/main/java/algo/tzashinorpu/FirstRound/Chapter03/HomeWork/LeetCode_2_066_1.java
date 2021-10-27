package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;

public class LeetCode_2_066_1 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int temp = 0;
        for (int i = len-1 ;i >=0; i--) {
            if (i == len -1 ){
                temp = 1;
            }
            int t = (digits[i] + temp) % 10;
            temp = (digits[i] + temp) / 10;
            digits[i] = t;
            if (temp == 0) {
                return digits;
            }
        }
        if (temp == 1) {
            int[] res = new int[len + 1];
            res[0] = 1;
            System.arraycopy(digits,0,res,1,len);
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {9, 8, 9};
        LeetCode_2_066_1 sol = new LeetCode_2_066_1();
        int[] ints = sol.plusOne(nums);
        for (int e :
                ints) {
            System.out.println(e);
        }
    }
}
